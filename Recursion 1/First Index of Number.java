
public class Solution {

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(input==null)
        {
            return -1;
        }
        
        int len=input.length;
        int i=0;
        while(i<len)
        {
            if(input[i]==x)
            {
                return i;
            }
            else
            {
                i=i+1;
            }
        }
        return -1;
        
		
	}
	
}