/**
 * 
 */
package com.rajiv.num.word.converter;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.log4j.Logger;
import com.rajiv.num.word.converter.constant.NumToWordConstant;
import com.rajiv.num.word.converter.exception.NumberOutOfRangeException;

/**
 * @author Rajiv This Class is the Starter for the Number To Word Converter
 *         Application
 *
 */
public class NumberToWordConverter {

	/**
	 * @param args main() method will take the a Number Type as input argument i.e.
	 *             1,5,67
	 */
	private static Logger logger = Logger.getLogger(NumberToWordConverter.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (logger.isDebugEnabled())
			logger.info(NumToWordConstant.LOGGER_CLASS_MESSAGE_START + NumberToWordConverter.class.getName());

		int number = NumToWordConstant.INPUT_NUMBER;
		int maxNumber = NumToWordConstant.MAX_NUMBER;

		Scanner scanner = new Scanner(System.in);

		System.out.println(NumToWordConstant.ENTER_INPUT);

		try {
			// read the number
			number = scanner.nextInt();
			if (number < maxNumber) {
				if (number == 0) {
					System.out.print(NumToWordConstant.INPUT_NUMBER_ZERO);
				} else {
					System.out.print(NumToWordConstant.NUMBER_IN_WORDS + NumberToWord.convertNumberToWord(number));
				}
			} else {
				throw new NumberOutOfRangeException(NumToWordConstant.NUMBER_OUT_OF_RANGE);
			}
		} catch (NumberOutOfRangeException nore) {
			nore.getMessage();
			logger.error(NumToWordConstant.NUMBER_OUT_OF_RANGE);
		} catch (InputMismatchException ime) {
			ime.printStackTrace();
			logger.error(NumToWordConstant.LOGGER_IME_EXCEPTION_MESSAGE);
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(NumToWordConstant.LOGGER_EXCEPTION_MESSAGE);
		} finally {
			// close the reader
			scanner.close();
		}
		logger.info(NumToWordConstant.LOGGER_CLASS_MESSAGE_END + NumberToWordConverter.class.getName());
	}

}
