package mca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class palindromeTest {

	@Test
	public void testApp() {
		Hello t=new Hello();
        String expected = "aba";
        String actual =t.palindrome(expected);

        Assertions.assertEquals(expected, actual);
	}

}
