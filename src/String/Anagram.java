package String;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by dhruv on 4/24/16.
 */
public class Anagram {

    /**
     *
     * @param str1
     * @param str2
     * @return
     */
    public boolean isAnagram(String str1, String str2)
    {
        // Check if null or empty
        if(str1==null || str2==null || str1.length()==0 || str2.length()==0)
            return false;

        // Check if same reference
        if(str1==str2)
            return true;

        str1 = str1.trim();
        str2 = str2.trim();

        // Check if length different
        if(str1.length()!=str2.length())
            return false;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();

        /** Arrays.sort is O(n logn) **/
        Arrays.sort(a);
        Arrays.sort(b);


        /** We can use Arrays.equals, but it's a O(n) solution and our's is n/2
        Arrays.equals(a,b); **/

        /** We can use equals() or compareTo(), but it's a O(n) solution and our's is n/2
         Arrays.equals(a,b); **/


        int len=b.length;
        int j=len-1;

        for(int i=0; i<=len/2 && i<=j;i++,j--)
        {
            if(a[i]!=b[i] || a[j]!=b[j])
                return false;
        }
        return true;
    }

    /**
     *
     * @param str1
     * @param str2
     * @return
     */
    public boolean isAnagram_HashMap(String str1, String str2)
    {
        // Check if null or empty
        if(str1==null || str2==null || str1.length()==0 || str2.length()==0)
            return false;

        // Check if same reference
        if(str1==str2)
            return true;

        str1 = str1.trim();
        str2 = str2.trim();

        // Check if length different
        if(str1.length()!=str2.length())
            return false;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        HashMap<Character,Integer> hashStr1 = new HashMap<>();
        HashMap<Character,Integer> hashStr2 = new HashMap<>();

        for(int i=0; i<str1.length();i++)
        {
            char a = str1.charAt(i), b=str2.charAt(i);
            Object s1,s2;
            if( (s1 = hashStr1.get(a)) == null )
                hashStr1.put(a,1);
            else
                hashStr1.put(a,(int)s1+1);
            if( (s2 = hashStr2.get(b)) == null )
                hashStr2.put(b,1);
            else
                hashStr2.put(b,(int)s2+1);
        }


        /** We can use own own loop to compare or just use 'hashStr1.equals(hashStr2)'

        if(hashStr1.size()!=hashStr2.size()
            return false;

        for(Object o : hashStr1.keySet())
        {
            if(hashStr1.get(o)!=hashStr2.get(o))
                return false;
        }
         **/

        return hashStr1.equals(hashStr2);
    }
}
