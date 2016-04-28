package StringMatchingAlgo;

/**
 * @author Dhruv
 * @version 1
 */
public class DriverClassSMA {

    public static void main(String[] args) {

        long startTime, endTime, elapsedTime;

        // A 100 length string
        String inp1="UJ58hzQnPAA7cuxL4iz9P3tBYwNwxXyuSf4nhoyjv1Q3BOCh7j6MHy0UWSZsp97Va2NYGbQxnw978kq2CplLFfXmD6sr3Y8FkMXuCAG5x1Evs62vqW9hUMLJXEXl3KptIG";
        String pat1="G5x1Evs62vqW9hUMLJXEXl3";

        startTime = System.currentTimeMillis();
        NaiveStrMatch naiveStrMatch = new NaiveStrMatch(inp1, pat1);
        int s2 = naiveStrMatch.NaiveSearch();
        System.out.println("NaiveSearch "+s2);
        endTime = System.currentTimeMillis();
        elapsedTime = endTime-startTime;
        System.out.println("Naives took (in ms): "+elapsedTime);

        startTime = System.currentTimeMillis();
        KMPStrSrch k = new KMPStrSrch(inp1, pat1);
        int s3 = k.KMP();
        System.out.println("KMP:"+s3);
        endTime = System.currentTimeMillis();
        elapsedTime = endTime-startTime;
        System.out.println("KMP took (in ms): "+elapsedTime);

        startTime = System.currentTimeMillis();
        RabinKarpSearch r = new RabinKarpSearch(inp1, pat1);
        int s = r.patternSearch();
        System.out.println("Robin:"+s);
        endTime = System.currentTimeMillis();
        elapsedTime = endTime-startTime;
        System.out.println("Rabin-Karp took (in ms): "+elapsedTime);
    }
}