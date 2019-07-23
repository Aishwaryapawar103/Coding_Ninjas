public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		int n=input.length;
        for(int i=0;i<n;i++)
        {
            if(input[i]==x)
            {
                return true;
            }
        
        }
        return false;
	}
}