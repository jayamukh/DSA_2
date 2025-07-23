class Solution {
    private HashMap<Character, Character> mappings;

    public Solution(){
        this.mappings = new HashMap<Character, Character>(); 
        this.mappings.put(')','(');
        this.mappings.put('}','{');
        this.mappings.put(']','[');

    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i =0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            System.out.println(ch);
            //closing
            if(this.mappings.containsKey(ch))
            {
                char top = st.empty()? '#': st.pop();
                
                if(top != this.mappings.get(ch))
                {
                    return false;
                }
                
            }
            else
                {
                    st.push(ch);
                }
        }

        return st.isEmpty();
    }
}