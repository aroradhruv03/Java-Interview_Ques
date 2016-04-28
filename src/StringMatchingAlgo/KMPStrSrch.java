package StringMatchingAlgo;

/**
 * @author Dhruv
 * @version 1.0
 *
 * Implementation class for Knuth-Morris-Pratt String Matching Algo
 *
 * Algo:
 *
 * KNUTH-MORRIS-PRATT Prefix Func (pattern)

    Input:    Pattern with m characters
    Output: Failure function f for pattern[i . . j]

    i ← 1
    j ← 0
    f(0) ← 0
    while i < m do
        if pattern[j] = pattern[i]
            f(i) ← j +1
            i ← i +1
            j← j + 1
    else if
        j ← f(j - 1)
    else
        f(i) ← 0
        i ← i +1

    KNUTH-MORRIS-PRATT (text, pattern)

    Input:    Strings text[0 . . n] and pattern[0 . . m]
    Output: Starting index of substring of text matching pattern

    f ← compute failure function of Pattern pattern
    i ← 0
    j ← 0
    while i < length[text] do
        if j ← m-1 then
            return i- m+1    // we have a match
    i ← i +1
    j ← j +1
    else if j > 0
        j ← f(j -1)
      else
        i ← i +1
 *
 * RUNNING TIME: O(n + m)
 */
public class KMPStrSrch {

     String text;
     String pattern;
     int[] prefixFunc;
     int s;

    /**
     * Constructor for the class
     * @param text : Input String
     * @param pattern : Inout Paramter
     */
    public KMPStrSrch(String text, String pattern) {
        this.text = text;
        this.pattern = pattern;
        prefixFunc = new int[this.pattern.length()];
        if(pattern.length()>0)
            computePrefix();
//        s = KMP();
    }

    /**
     * Computes the prefix function
     */
    public void computePrefix(){

        int i, j=0;
        int m = pattern.length();
        prefixFunc[0] = 0;

        for (i = 1; i < m ; i++) {
            while (j > 0 && pattern.charAt(j) != pattern.charAt(i)) {
                j = prefixFunc[j - 1];
            }
            if (pattern.charAt(j) == pattern.charAt(i)) {
                j++;
            }
            prefixFunc[i] = j;
        }
    }

    /**
     * The implemented algo for KMP
     * @return : -1 if finds no match. OR s - shift, index where match is found
     */
    public int KMP() {
        int j = 0;
        if (text.length() == 0 || pattern.length()==0 )
            return -1;

        for (int i = 0; i < text.length(); i++) {
            while (j > 0 && pattern.charAt(j) != text.charAt(i)) {
                j = prefixFunc[j - 1];
            }
            if (pattern.charAt(j) == text.charAt(i)) { j++; }
            if (j == pattern.length()) {
                s = i - pattern.length() + 1;
//                System.out.println(s);
                return s;
            }
        }
        return -1;
    }
}
