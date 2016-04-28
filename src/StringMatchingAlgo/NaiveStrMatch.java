package StringMatchingAlgo;

/**
 * @author Dhruv
 * @version 1.0
 *
 * Implementation class for Naive String Matcher Algorithm.
 *
 * Algorithm:
 *
 *   NAÏVE_STRING_MATCHER (text, pattern)

    n ← length [text]
    m ← length [pattern]
    for s ← 0 to n-m do
        j ← 1
        while j ≤ m and text[s + j] = pattern[j] do
            j ← j +1
        If j > m then
            return valid shift s
    return no valid shift exist     // i.e., there is no substring of text matching pattern.
 *
 * RUNNING TIME: O((n - m +1)m) ~ O(nm)
 */
public class NaiveStrMatch {

    String T, P;
    int n,m;

    /**
     * Class Constructor
     *
     * @param t - Text String
     * @param p - Pattern String
     */
    public NaiveStrMatch(String t, String p) {
        this.T = t;
        this.P = p;

        // Length of Text
        n = T.length();

        // Length of Pattern
        m = P.length();
    }

    /**
     * Function containing the main search algo
     *
     * @return : -1 if finds no match. OR s - shift, index where match is found
     */
    public int NaiveSearch()
    {
        if(n==0 || m==0)
            return -1;

        for (int s=0; s<= n-m; s++)
        {
            int j=0;
            while (j<m && T.charAt(s+j) == P.charAt(j))
                j++;

            if(j==m)
                return s;
        }
        return -1;
        /**
         *
         The Same thing can done by Java Lib using the below code:
             for (int s=0; s<= n-m; s++) {
                if(text.substring(s,s+m).equals(pattern))
                    return s;
            } return -1;
         **/
    }
}