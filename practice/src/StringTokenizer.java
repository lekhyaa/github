//public class Lekhya {
//    public static void main(String[] args) {
//        System.out.println(StringFormatter.reverseWord("my name is Lekhya"));
//        System.out.println(StringFormatter.reverseWord("Cars are my life :)"));
//    }
//}
//public class StringTokenizer {
//    public static void main(String args []) {
//        String s = "my name is prasanna kumar";
//        printWords(s);
//  }
//    public static void printWords(String str) {

//        String word;
//        StringTokenizer iss = new StringTokenizer(str);
//        while (iss.hasMoreTokens()) {
//            word = iss.nextToken();
//        }
//        System.out.print(new StringBuilder(word).reverse().toString() + " ");
//    }
//}
import java.lang.*;
public class StringTokenizer {

    public static void main(String args[])
    {
        StringBuffer sbf = new StringBuffer("lekhya is!");
        System.out.println("String buffer = " + sbf);
        sbf.reverse();
        System.out.println("reversed string = " + sbf);
    }
}


