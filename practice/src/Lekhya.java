import java.lang.*;
import java.io.*;
import java.util.*;

class Lekhya {
    public static void main(String[] args) {
        //String name = "Lekhya";
        StringBuilder name1 = new StringBuilder("Lekhya");
        // name1.append(name);
        name1.reverse();
        System.out.println(name1 + " reverse of the string in Method 1");

        String input = "Lekhya";
        char[] t1 = input.toCharArray();
        for (int i = t1.length - 1; i >= 0; i--)
            System.out.print(t1[i]);
        System.out.print("Reversing the string in Method2");

        String str = "Nitin", reverseStr = "";
        //int strLength = str.length();
        for (int i = (str.length() - 1); i >=0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println("\n" + str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
