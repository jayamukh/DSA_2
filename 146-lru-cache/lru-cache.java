class LRUCache {

    int size;
    int maxSize;
    Node head;
    Node tail;
    Map<Integer,Node> map;
    class Node
    {
        Node next;
        Node prev;
        int val;
        int key;
        public Node(int key, int val)
        {
            this.key = key;
            this.val = val;
        }
    }

    public LRUCache(int capacity) {
        this.maxSize = capacity;
         map  = new HashMap<>();
    }

    public void addLast(Node node)
    {
        if(this.size == 0)
        {
            head = tail = node;
        }
        else
        {
            tail.next = node;
            node.prev = tail;
            node.next = null;
            tail = node;
        }
        size++;
    }

    public void remove(Node node)
    {
        if(this.size == 1)
        {
            head = tail = null;
        }
        else if(node == head)
        {
            head = head.next;
            head.prev = null;
            node.next = null;

        }
        else if(node == tail)
        {
            tail = tail.prev;
            tail.next = null;
            node.prev = null;

        }
        else
        {

              Node prev  = node.prev;
            Node next = node.next;
            prev.next = next;
           next.prev = prev;
            node.next = null;
            node.prev = null;

        }
        size--;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
        {
            return -1;
        }
        else
        {
           Node node = map.get(key);
           remove(node);
           addLast(node);
           return node.val;
        }
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
             Node node = map.get(key);
             remove(node);
           addLast(node);
            node.val = value;
        }
        else
        {
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addLast(newNode);
            if(size > maxSize)
            {
                Node temp = head;
                remove(temp);
                map.remove(temp.key);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */