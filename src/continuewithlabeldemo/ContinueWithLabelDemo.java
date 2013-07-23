package continuewithlabeldemo;

/**
 *
 * @author  Karan Sharma
 * @time     Jul 22, 2013 8:45:32 AM 
 */
class ContinueWithLabelDemo
{
    public static void main(String[] args)
    {
        String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;

        int max = searchMe.length() - substring.length();

    test:
        for (int i = 0; i <= max; i++)
        {
            int lengthOfSubstring = substring.length();  // 3
            int j = i;
            int k = 0;
            while ( (lengthOfSubstring--) != 0)
            {
                if (searchMe.charAt(j++) != substring.charAt(k++) ) 
                {
                    continue test;  //will jump the control of execution to the next iteration of for loop
                }
            }
            foundIt = true;
                break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
}
