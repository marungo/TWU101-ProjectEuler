package EulerProject;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    ArrayList<Integer> fib;

    public Fibonacci() {
        fib = new ArrayList<>();
        fib.add(1);
        fib.add(2);
    }

    public ArrayList<Integer> getEvenFibs(int end) {
        ArrayList<Integer> evenFibs = new ArrayList<>();
        findNthFibonacci(end);
        List<Integer> subl =  fib.subList(0,end);
        for (Integer item: subl) {
            if (item%2 == 0)
                evenFibs.add(item);
        }
        return evenFibs;
    }

    private void populateFib(int end) {
        for (int i=fib.size();i<end;i++) {
            int n = fib.get(i-2) + fib.get(i-1);
            fib.add(n);
        }
    }

    private int fibonacciEvenSum(int start, int end) {
        int sum = 0;

        for (int i=start;i<end;i++) {
            int ith = findNthFibonacci(i);
            if (ith%2 == 0) {
                sum += ith;
            }
        }
        return sum;
    }

    private int findNthFibonacci(int n) {
        if (fib.size() < n)
            populateFib(n);
        return fib.get(n-1);
    }

    public static void main(String[] args) {
//        Fibonacci f = new Fibonacci();
//        System.out.println(f.getEvenFibs(4000000));
//        System.out.println(f.fib.size());
//        System.out.println(f.fibonacciEvenSum(0,1000000));
    }
}
