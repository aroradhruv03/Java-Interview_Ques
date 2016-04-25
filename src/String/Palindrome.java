package String;


/**
 * Created by dhruv on 4/23/16.
 */
public class Palindrome {

    enum method{
        charArray, Recursion
    }

    /**
     * Checks if the given string literal is a palindrome or not.
     *
     * Implementation : Checks the first and last digits. Then second and second last & so on...
     * Note: I Find this implementation better than converting a string to reverse and then using equals method.
     *
     * Possible bugs/problems or Future Upgrades -> NA
     *
     * @param str: The input String which is to be checked.
     * @return : true if string is a palindrome else false
     * throws : No exception thrown. If string is null, just returns false.
     */
    public boolean checkPalindrome_char(String str)
    {
        // If string null or length is 0. Not a palindrome.
        if (str==null || str.length()==0)
            return false;

        // If string length is 1. Is a palindrome.
        if (str.length()==1)
            return true;

        boolean palindrome = true;

        // First and last index of string
        int firstIndex = 0, lastIndex = str.length()-1;
        // Half length of string
        int halfLength = (str.length()/2)-1 ;

        while(firstIndex <= halfLength)
        {
            if(str.charAt(firstIndex)!=str.charAt(lastIndex)) {
                palindrome = false;
                break; // break loop to avoid more unnecessary calculations
            }
            firstIndex++;
            lastIndex--;
        }
        return palindrome;
    }

    /**
     * Recursive solution for palindrome
     *
     * Implementation
     *
     * @param str
     * @return
     */
    public boolean checkPalindrome_Recursion(String str)
    {
        // If string null or length is 0. Not a palindrome.
        if (str==null)
            return false;

        if(str.length()<=1)
            return true;

        return ( str.charAt(0)!=str.charAt(str.length()-1) ? false : checkPalindrome_Recursion(str.substring(1,str.length()-1))  );

    }

    /**
     *
     * @param str
     * @return
     */
    public boolean checkPalindrome_StrBuilder(String str)
    {
        // If string null or length is 0. Not a palindrome.
        if (str==null || str.length()==0)
            return false;


        if(str.length()<=1)
            return true;

        return ( str.equals( String.valueOf(new StringBuilder(str).reverse()) )  ) ;

    }

//    //Driver class
//    public static void main(String[] args) {
//        String palindrome2 = "jabbaj";
//        Palindrome p = new Palindrome();
//        boolean b = p.checkPalindrome_Recursion(palindrome2);
//        System.out.println(b);
//    }

}