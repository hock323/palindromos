
package palindromos;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PalindromeNBasedCheckerTest {
    
   PalindromeChecker palindromeChecker;
    
    @Before
    public void setUp() {
        palindromeChecker = new PalindromeChecker();
    }
    
    @Test
    public void TenBasedPalindrome() {
        int candidate = 1234321;
        assertTrue(new PalindromeNBasedChecker().isPalindrome(candidate, 10));
    }
    @Test
    public void sixteenthBasedPalindrome() {
        int candidate = 289;
        assertTrue(new PalindromeNBasedChecker().isPalindrome(candidate, 16));
    }
    @Test
    public void sixteenBasedNoPalindrome() {
        int candidate = 1234;
        assertFalse(new PalindromeNBasedChecker().isPalindrome(candidate, 16));
    }
    
    @Test
    public void twoBasedNoPalindrome() {
        int candidate = 1234;
        assertFalse(new PalindromeNBasedChecker().isPalindrome(candidate, 2));
    }
    
    @Test
    public void twoBasedPalindrome() {
        int candidate = 273;
        assertTrue(new PalindromeNBasedChecker().isPalindrome(candidate, 2));
    }
    
    @Test
    public void sixteenthBasedPalindrome2() {
        int candidate = 273;
        assertTrue(new PalindromeNBasedChecker().isPalindrome(candidate, 16));
    }
}
