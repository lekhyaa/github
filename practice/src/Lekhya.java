//public class Lekhya {
//    public static void main(String[] args) {
//        System.out.println(StringFormatter.reverseWord("my name is Lekhya"));
//        System.out.println(StringFormatter.reverseWord("Cars are my life :)"));
//    }
//}

import java.util.Scanner;
public class Lekhya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given string : ");
        String oStr = scanner.nextLine();
        scanner.close();

        String words[] = oStr.split("\\s");
        String rString = "";


        for (int i = 0; i < words.length; i++)  {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            rString = rString + reverseWord + " ";
        }
        System.out.print("Reversed string : " + rString);
    }
}