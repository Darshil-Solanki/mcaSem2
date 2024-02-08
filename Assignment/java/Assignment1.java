import java.util.Scanner;
import static java.lang.System.out;

class Assignment1 {
    static void first(Scanner s) {
        out.println("Enter a:");
        int a = s.nextInt();
        out.println("Square of " + a + " is: " + (a * a));
    }

    static void second(Scanner s) {
        out.println("Enter a:");
        int a = s.nextInt();
        out.println("Enter b:");
        int b = s.nextInt();
        out.println("Square root of sum of " + a + " and " + b + " is: " + Math.sqrt(a + b));
    }

    static void third(Scanner s) {
        out.println("Enter a:");
        int a = s.nextInt();
        out.println("Number is:" + (a < 0 ? -a : a));
    }

    static void fourth(Scanner s) {
        out.println("Enter a:");
        int a = s.nextInt();
        out.println("Enter b:");
        int b = s.nextInt();
        if (a > b)
            out.println(a + " is greater than " + b);
        else if (a < b)
            out.println(b + " is greater than " + a);
        else
            out.println(a + " is equal to " + b);
    }

    static void fifth(Scanner s) {
        int flag = 1;
        int a;
        while (flag != 0) {
            out.println("Enter a num:");
            a = s.nextInt();
            if (a < 0)
                out.println("Unsuitable number");
            else if (a == 0)
                flag = 0;
            else
                out.println(a + " to the power of two is: " + Math.pow(2, a));
        }
    }

    static void sixth(Scanner s) {
        int a;
        int c = 0;
        while (true) {
            out.println("Enter a num:");
            a = s.nextInt();
            if (a == 0)
                break;
            c++;
        }
        out.println("Total no. of input is:" + (c));
    }

    static void seventh(Scanner s) {
        int a;
        int c = 0;
        while (true) {
            out.println("Enter a num:");
            a = s.nextInt();
            if (a == 0)
                break;
            if (a < 0)
                c++;
        }
        out.println("Total no. of negative input is:" + (c));
    }

    static void eigth(Scanner s) {
        int a;
        int sum = 0;
        while (true) {
            out.println("Enter a num:");
            a = s.nextInt();
            if (a == 0)
                break;
            sum += a;
        }
        out.println("Total sum of no. is:" + (sum));
    }

    static int fact(int a) {
        if (a == 0 || a == 1)
            return 1;
        else if (a < 0) {
            out.println("Wrong input!!!");
            return -1;
        } else
            return a * fact(a - 1);
    }

    static void nineth(Scanner s) {
        out.println("Enter a num:");
        int a = s.nextInt();
        out.println("Factorail of " + a + " is: " + fact(a));
    }

    static void tenth(Scanner s) {
        int arr[] = { 1, 3, 2, 5, 9, 4, 0 };
        for (int i : arr) {
            out.println(i);
        }
        out.println("Enter two indices to swap:");
        int a = s.nextInt();
        int b = s.nextInt();
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        for (int i : arr) {
            out.println(i);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        first(sc);
        second(sc);
        third(sc);
        fourth(sc);
        fifth(sc);
        sixth(sc);
        seventh(sc);
        eigth(sc);
        nineth(sc);
        tenth(sc);
    }
}