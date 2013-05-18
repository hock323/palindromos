package palindromos;

public class PalindromeChecker {

    public boolean isPalindrome(Integer candidate) {
        return checkCandidate(candidate.toString());
    }

    public boolean isPalindrome(String candidate) {
        try {
            int intCandidate = Integer.parseInt(candidate);
            return isPalindrome(intCandidate);
        } catch (NumberFormatException e){
            return checkCandidate(candidate);
        }
    }

    private boolean checkCandidate(String candidate) {
        if (palindroma(candidate, 0, candidate.length() - 1)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean palindroma(String candidate, int i, int j) {
        if (i != (candidate.length() / 2)) {
            if (candidate.charAt(i) == candidate.charAt(j)) {
                return palindroma(candidate, ++i, --j);
            } else {
                return false;
            }
        }
        return true;
    }
}
