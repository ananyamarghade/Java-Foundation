public class OperatorsInJava {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));


        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

    
        // 3. Logical Operators
  
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));

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
