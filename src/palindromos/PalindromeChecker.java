package palindromos;

public class PalindromeChecker {
    
    public boolean isPalindrome(Integer candidate) {      
        if (candidate < 9) {
            return true;
        } else {           
           return checkCandidate(candidate.toString());
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
