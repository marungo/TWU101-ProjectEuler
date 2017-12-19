package EulerProject;

import java.util.ArrayList;

public class PrimeFactors {
    private static ArrayList<Integer> knownPrimes;


    private static boolean isPrime(int n) {
        int sqroot = (int) Math.sqrt(n);
        for (int i=2;i<=sqroot;i++) {
            if (n%i == 0)
                return false;
        }
        return true;
    }

    private static int maxInArrayList(ArrayList<Integer> ns) {
        System.out.println(ns);
        int max = ns.get(0);
        for (int i=1;i<ns.size();i++) {
            max = Math.max(max,ns.get(i));
        }
        return max;
    }

    private static int findFirstFactor(int n) {
        int i = 2;
        while (n%i != 0) {
            i++;
        }
        return i;
    }

    private static ArrayList<Integer> findPrimeFactors(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        while (n > 1) {
            int prime = findFirstFactor(n);
            primeFactors.add(prime);
            n = n/prime;
        }
        return primeFactors;
    }

    public static int findLargestPrimeFactor(int n) {
        return maxInArrayList(findPrimeFactors(n));
    }

}
