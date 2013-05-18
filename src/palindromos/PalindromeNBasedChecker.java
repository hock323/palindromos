package palindromos;

public class PalindromeNBasedChecker {

    public boolean isPalindrome(Integer candidate, int base) {
        if (candidate <= 9) {
            return true;
        } else {
            return checkCandidate(convertTo(candidate, base));
        }
    }

    public boolean isPalindrome(String candidate, int base) {
        return isPalindrome(Integer.parseInt(candidate), base);
    }

    private boolean checkCandidate(String candidate) {
        return new PalindromeChecker().isPalindrome(candidate);
    }

    private String convertTo(Integer number, int base) {
        return Integer.toString(number, base);
    }
}
