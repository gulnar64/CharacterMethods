import java.util.StringTokenizer;

public class StringTokenizerMethods {
    public static void main(String[] args) {
        StringTokenizer strTokenizer = new StringTokenizer("nksdv sncdksdnvk \ndfvd \tfsdgfv");
        StringTokenizer strTokenizer2 = new StringTokenizer("nksdv sncdksdnvk \ndfvd \tfsdgfv", "snc");
        StringTokenizer strTokenizer3 = new StringTokenizer("nksdv sncdksdnvk \ndfvd \tfsdgfv", " ",true );

        System.out.println(strTokenizer.countTokens());
        System.out.println(strTokenizer2.countTokens());
        System.out.println(strTokenizer3.countTokens());
        while (strTokenizer.hasMoreElements()) {
            System.out.println(strTokenizer.nextElement());
        }
        System.out.println("2");
        while (strTokenizer2.hasMoreTokens()) {
            System.out.println(strTokenizer2.nextToken());
        }
        System.out.println("3");
        while (strTokenizer3.hasMoreTokens()) {
            System.out.println(strTokenizer3.nextToken());
        }
    }
}
