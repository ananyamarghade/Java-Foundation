public class OperatorsInJava {

    public static void main(String[] args) {

        // 5. Increment / Decrement
        int d = 10;

        System.out.println("\nIncrement / Decrement:");
        System.out.println("++d = " + (++d));
        System.out.println("d++ = " + (d++));
        System.out.println("d after d++ = " + d);
        System.out.println("--d = " + (--d));
        System.out.println("d-- = " + (d--));
        System.out.println("d after d-- = " + d);

        // 6. Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b = " + max);

        // 7. Bitwise Operators
        int p = 5;  
        int q = 3; 

        System.out.println("\nBitwise Operators:");
        System.out.println("p & q = " + (p & q));
        System.out.println("p | q = " + (p | q));
        System.out.println("p ^ q = " + (p ^ q));
        System.out.println("~p = " + (~p));
    }
}
