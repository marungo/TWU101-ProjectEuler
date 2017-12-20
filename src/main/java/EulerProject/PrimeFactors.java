package EulerProject;

import java.util.ArrayList;
import java.util.HashMap;

public class PrimeFactors {

    private static boolean isPrime(int n) {
        int sqroot = (int) Math.sqrt(n);
        for (int i=2;i<=sqroot+1;i++) {
            if (n%i == 0)
                return false;
        }
        return true;
    }

    private static int findNthPrime(int n) {
        int i = 0;
        int j = 1;
        while (i<n) {
            j++;
            if (isPrime(j)) {
                System.out.print(j + " ");
                if (i>0 && i%10 == 0)
                    System.out.println();
                i++;
            }
        }
        System.out.println();
        return j;
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

    public static ArrayList<Integer> findPrimeFactors(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        while (n > 1) {
            int prime = findFirstFactor(n);
            primeFactors.add(prime);
            n = n/prime;
        }
        return primeFactors;
    }

    private static HashMap<Integer,Integer> mapPrimeFactors(int n) {
        ArrayList<Integer> primes = findPrimeFactors(n);
        HashMap<Integer,Integer> primesMap = new HashMap<>();
        for (int i=0;i<primes.size();i++) {
            int key = primes.get(i);
            if (!primesMap.containsKey(key))
                primesMap.put(key,1);
            else
                primesMap.put(key, primesMap.get(key) + 1);
        }
        return primesMap;
    }

    private static HashMap<Integer,Integer> findPrimeFactorsForSetOfIntegers(int[] ns) {
        HashMap<Integer,Integer> allPrimesMap = new HashMap<>();
        for (int i=0; i<ns.length;i++) {
            HashMap<Integer,Integer> primes = mapPrimeFactors(ns[i]);
            for (int key: primes.keySet()) {
                if (!allPrimesMap.containsKey(key) || allPrimesMap.get(key) < primes.get(key))
                    allPrimesMap.put(key, primes.get(key));
            }
        }
        System.out.println(allPrimesMap.toString());
        return allPrimesMap;
    }

    private static int multiplyAllItemsInMap(HashMap<Integer,Integer> map) {
        int result = 1;
        for (Integer key: map.keySet()) {
            int toMultiply = (int) Math.pow(key, map.get(key));
            result = result*toMultiply;
        }
        System.out.println(result);
        return result;
    }

    public static int findSmallestNumberThatDividesEveryNumInList(int[] ns) {
        return multiplyAllItemsInMap(findPrimeFactorsForSetOfIntegers(ns));
    }

    public static int findLargestPrimeFactor(int n) {
        return maxInArrayList(findPrimeFactors(n));
    }

    public static void main(String[] args) {
        int fin = findNthPrime(10000);
        System.out.println(fin);
    }
}