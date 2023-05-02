public class testclass {
    public static void main(String[] args) {
        System.out.println("Hello world");
        printHelloWorld();
        printHelloAndMyName("Lekhya");
        System.out.println(sumof2Nums(2, 3));
        System.out.println(prodofNums(2, 3));
        System.out.println(divof2Nums(2, 3));
        System.out.println(subof2Nums(2, 3));
    }

    public static void printHelloAndMyName(String str) {
        System.out.println("Hello" + str);
    }

    public static void printHelloWorld() {
        System.out.println("Hello World2");
    }

    public static int sumof2Nums(int a, int b) {
        return a + b;
    }

    public static int prodofNums(int a, int b) {
        return a * b;
    }

    public static int subof2Nums(int a, int b) {
        return a - b;
    }

    public static int divof2Nums(int a, int b) {
        return a / b;
    }

}