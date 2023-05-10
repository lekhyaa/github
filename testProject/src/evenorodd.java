import java.util.Scanner;
public class evenorodd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " yes this number is even");
        else {
            System.out.println(num + " yes this number is odd");
        }
    }
}