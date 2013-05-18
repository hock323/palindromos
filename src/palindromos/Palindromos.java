package palindromos;

public class Palindromos {

    public static void main(String[] args) {
        int palindromeCandidate = Integer.parseInt(args[1]);
        System.out.println(new PalindromeChecker().isPalindrome(palindromeCandidate));
    }
}
