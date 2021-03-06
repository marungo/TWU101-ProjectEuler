package EulerProject;

import java.util.ArrayList;

public class Palindrome {

    public static ArrayList<Integer> probablyBiggestPalindromes(int start, int end) {
        ArrayList<Integer> palindromes = new ArrayList<>();
        int i = end;
        while (i>start) {
            for (int j=end;j>=i;j--) {
                int ij = i*j;
                if (isPalindrome(ij)) {
                    palindromes.add(ij);
                }
            }
            i--;
        }
        return palindromes;
    }

    private static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        if (s.equals(reverse(s)))
            return true;
        return false;
    }

    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(501105));
        System.out.println(probablyBiggestPalindromes(900,999));
    }
}
