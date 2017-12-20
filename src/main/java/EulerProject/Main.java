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

    private static int problem5() {
        int start = 1;
        int end = 20;
        int[] ns = new int[end];
        for (int i=start;i<=end;i++)
            ns[i-1] = i;
        return PrimeFactors.findSmallestNumberThatDividesEveryNumInList(ns);
    }

    private static int problem6() {
        return SquareSum.DifferenceBetweenSquareOfSumsAndSumOfSquares(1,100);
    }

    public static void main(String[] args) {
//        System.out.println(problem1());
//        System.out.println(problem2());
//        System.out.println(problem3());
//        System.out.println(problem4());
//        System.out.println(problem5());
        System.out.println(problem6());
    }
}