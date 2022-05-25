package largest;

public class Number {

    public static void main(String[] args) {

        double a1 = 5.4, a2 = 4.2, a3 = 3.5;

        if( a1 >= a2 && a1>= a3)
            System.out.println( a1 + " is the largest number.");

        else if (a2 >= a1 && a2 >= a3)
            System.out.println( a2 + " is the largest number.");

        else
            System.out.println( a3 + " is the largest number.");

    }
}
