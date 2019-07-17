/**
 * 
 */
package com.rajiv.num.word.converter.test;

import java.util.InputMismatchException;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import com.rajiv.num.word.converter.NumberToWord;

/**
 * @author Rajiv
 *
 */
@RunWith(value = Parameterized.class)
public class NumToWordTest extends NumberToWord {

	private final String expected;
	private final int input;

	public NumToWordTest(final String expected, final int input) {
		this.expected = expected;
		this.input = input;
	}

	@Parameters
	public static Collection<Object[]> data() {
		final Object[][] data = new Object[][] { { "one", 1 }, { "one hundred and five", 105 }, { "sixty seven", 67 } };
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		assertEquals(expected, NumberToWord.convertNumberToWord(input));
	}

}
