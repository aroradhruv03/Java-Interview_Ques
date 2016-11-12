package String;

/**
 * @author Dhruv
 * @version 1.0
 *          Date 11/10/16
 *          <p>
 *          This is a implementation class for
 */
public class Reverse {

    public String reverse_StringBuilder(String str)
    {
        if(str==null || str.trim().isEmpty() || str.length()==1)
            return str;

        StringBuilder sb = new StringBuilder(str);
        return  String.valueOf(sb.reverse()) ;
        // I prefer above, But Can also use : return (sb.reverse()).toString();
    }

    public String reverse_Recursion(String str)
    {
        if(str==null || str.trim().isEmpty() || str.trim().length()==1)
            return str;

        return reverse_Recursion(str.substring(1)) + str.charAt(0);
    }

    public String reverse_charArray(String str)
    {
        if(str==null || str.trim().isEmpty() || str.trim().length()==1)
            return str;

        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0;i--)
        {
            sb.append(str.charAt(i));
        }
        return String.valueOf(sb);
    }

    /**
     * DRIVER CLASS
     */
    /*
    public static void main(String[] args) {
        String str2 = "19ijsd:)(*b4jif2039ojfFGOskl+=>DFJ";
        System.out.println(new Reverse().reverse_StringBuilder(str2));

    }
    */
}