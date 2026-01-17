public class OperatorsInJava {

    public static void main(String[] args) {

        // Assignment Operators

        int c = 5;

        System.out.println("\nAssignment Operators:");
        c += 2;
        System.out.println("c += 2 -> " + c);
        c -= 1;
        System.out.println("c -= 1 -> " + c);
        c *= 2;
        System.out.println("c *= 2 -> " + c);
        c /= 2;
        System.out.println("c /= 2 -> " + c);

        // Increment / Decrement
        int d = 10;

        System.out.println("\nIncrement / Decrement:");
        System.out.println("++d = " + (++d));
        System.out.println("d++ = " + (d++));
        System.out.println("d after d++ = " + d);
        System.out.println("--d = " + (--d));
        System.out.println("d-- = " + (d--));
        System.out.println("d after d-- = " + d);

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b = " + max);

        // Bitwise Operators
        int p = 5;  
        int q = 3; 

        System.out.println("\nBitwise Operators:");
        System.out.println("p & q = " + (p & q));
        System.out.println("p | q = " + (p | q));
        System.out.println("p ^ q = " + (p ^ q));
        System.out.println("~p = " + (~p));
    }
}
