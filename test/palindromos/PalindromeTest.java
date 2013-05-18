/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromos;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author usuario
 */
public class PalindromeTest {
    PalindromeChecker palindromeChecker;
    
    public PalindromeTest() {
    }
    
    @Before
    public void setUp() {
        palindromeChecker = new PalindromeChecker();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void OneDigitPalindrome() {
        int candidate = 0; 
        assertTrue(palindromeChecker.isPalindrome(candidate));
    }
    
    @Test
    public void palindrome() {
        int candidate = 1234321; 
        assertTrue(palindromeChecker.isPalindrome(candidate));
    }
    
    @Test
    public void notPalindrome() {
        int candidate = 785; 
        assertFalse(palindromeChecker.isPalindrome(candidate));
    }
    
    @Test
    public void withLeftZeroCandidate() {
        String candidate = "01210";
        assertFalse(palindromeChecker.isPalindrome(candidate));
    }
}
