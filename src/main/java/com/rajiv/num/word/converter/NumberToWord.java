/**
 * 
 */
package com.rajiv.num.word.converter;

import org.apache.log4j.Logger;
import com.rajiv.num.word.converter.constant.NumToWordConstant;

/**
 * @author Rajiv
 *
 */
public class NumberToWord {

	private static Logger logger = Logger.getLogger(NumberToWord.class);

	public static String convertNumberToWord(int number) {

		logger.info(NumToWordConstant.LOGGER_INPUT_METHOD_MESSAGE_START + NumberToWord.class.getName());

		// variable to hold string representation of number
		String words = NumToWordConstant.EMPTY_CHAR;
		String unitsArray[] = NumToWordConstant.UNITS_ARRAY;
		String tensArray[] = NumToWordConstant.TENS_ARRAY;

		// add minus before conversion if the number is less than 0
		if (number < 0) {
			// convert the number to a string
			String numberStr = NumToWordConstant.EMPTY_CHAR + number;
			// remove minus before the number
			numberStr = numberStr.substring(1);
			// add minus before the number and convert the rest of number
			return NumToWordConstant.WORD_MINUS + convertNumberToWord(Integer.parseInt(numberStr));
		}
		// check if number is divisible by 1 million
		if ((number / 1000000) > 0) {
			words += convertNumberToWord(number / 1000000) + NumToWordConstant.WORD_MILLION;
			number %= 1000000;
		}
		// check if number is divisible by 1 thousand
		if ((number / 1000) > 0) {
			words += convertNumberToWord(number / 1000) + NumToWordConstant.WORD_THOUSAND;
			number %= 1000;
		}
		// check if number is divisible by 1 hundred
		if ((number / 100) > 0) {
			words += convertNumberToWord(number / 100) + NumToWordConstant.WORD_HUNDRED;
			number %= 100;
		}
		
		if (number > 0) {
			// check if number is within teens
			if (number < 20) {
				// fetch the appropriate value from unit array
				words += unitsArray[number];
			} else {
				// fetch the appropriate value from tens array
				words += tensArray[number / 10];
				if ((number % 10) > 0) {
					words += NumToWordConstant.SPACE_CHAR + unitsArray[number % 10];
				}
			}
		}
		logger.info(NumToWordConstant.LOGGER_INPUT_METHOD_MESSAGE_END + NumberToWord.class.getName());
		return words;
	}

}
