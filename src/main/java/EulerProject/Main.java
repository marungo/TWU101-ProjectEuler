package EulerProject;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    private static int problem1() {
        int sum = 0;
        for (int i=0;i<1000;i++) {
            if (i%3 == 0 || i%5 == 0)
                sum += i;
        }
        return sum;
    }

    private static ArrayList<Integer> problem2() {
        int n = 4000000;
        Fibonacci f = new Fibonacci();
        return f.getEvenFibs(n);
    }

    private static int problem3() {
        int n = 608069021;
        return PrimeFactors.findLargestPrimeFactor(n);
    }

    private static int problem4() {
        int start = 100;
        int end = 999;
        ArrayList<Integer> pals = Palindrome.probablyBiggestPalindromes(start, end);
        Collections.sort(pals);
        return pals.get(pals.size()-1);
    }

    public static void main(String[] args) {
//        System.out.println(problem1());
//        System.out.println(problem2());
//        System.out.println(problem3());
        System.out.println(problem4());
    }
}
