package StringMatchingAlgo;

/**
 * @author Dhruv
 * @version 1.5
 *
 * Implementation class for the Rabin-Karp Search Algo
 *
 * RUNNING TIME: O(nm)
 */
public class RabinKarpSearch {

    final private int prime = 256; // the prime factor number

    String text, pattern;

    // Hash of the text and the pattern. Hash of text is recalculated at each iteration
    long textHash, patternHash;

    int textLength, patternLength; // length of respective stirng

    /**
     * Constructor for the class
     * @param text : Input String
     * @param pattern : Input Pattern
     */
    public RabinKarpSearch(String text, String pattern) {
        this.textLength = text.length();
        this.patternLength = pattern.length();
        if(patternLength <= textLength)
            this.textHash = calculateHash(text.substring(0, patternLength));
//        else
//            throw new Exception("Pattern length should be less than or equal to Text length");
//            this.s =-1;

        this.text = text;
        this.pattern = pattern;
        this.patternHash = calculateHash(pattern);
    }

    /**
     * Calculates the initial Hash. We are calculating a Rolling hash here
     * @param s - The input string
     * @return - the hash of the input string
     */
    public long calculateHash(String s)
    {
        long hash = 0;
        for(int i = 0; i < patternLength;i++)
        {
            hash += s.charAt(i)*Math.pow(prime,i); // ASCII * prime^i
        }
        return hash;
    }

    /**
     * For the actual search algo
     * @return : : -1 if finds no match. or the s - shift, index where match is found
     */
    public int patternSearch(){

        if(textLength==0 || patternLength==0)
            return -1;

        for(int i = 0; i<= textLength - patternLength; i++ )
        {
            if(patternHash==textHash && checkNaive(i)){
                return i;
            }
            if( (i+1+patternLength) <= textLength )
                recalculateHash(i);
        }
        return -1;
    }

    /**
     * USed for recalculating the Rolling Hash
     * @param i - the index from which the new Hash should be calculated
     */
    public void recalculateHash(int i){
        textHash -= text.charAt(i);
        textHash /= prime;
//        textHash += calculateHash(text.substring(i+patternLength,patternLength));
        textHash += text.charAt(i+patternLength)*Math.pow(prime,patternLength-1);
    }

    /**
     * If the hashes match, checks if the pattern actaully exists at teh index or not
     * @param i : input index where the shift is suppoed to be
     * @return : true if shift occurs else false
     */
    public boolean checkNaive(int i)
    {
        int p=0;
        for (int j=i;j<textLength-patternLength && p<patternLength;j++){
//            System.out.printf(pattern.charAt(p)+" "+text.charAt(j));
            if(pattern.charAt(p)!=text.charAt(j))
                return false;
            p++;
        }
        return true;
    }

}
