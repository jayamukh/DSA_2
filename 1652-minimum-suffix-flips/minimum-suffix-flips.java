class Solution {
    public int minFlips(String target) {
        int[] arr = target.chars()
                    .map(c -> c-'0')
                    .toArray();
                    int noOfFlips = 0;
        for(int i =0; i < arr.length; i++)
        {
            if(noOfFlips %2 == 0)
            {
                if(arr[i] == 1)
                    noOfFlips++;
            }
            else
            {
                 if(arr[i] == 0)
                    noOfFlips++;
            }

        }
        
        return noOfFlips;
        
    }
}