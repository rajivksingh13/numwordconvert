/**
 * 
 */
package com.rajiv.num.word.converter.constant;

/**
 * @author Rajiv
 *
 */
public interface NumToWordConstant {
	
	final int INPUT_NUMBER=0;
	final int MAX_NUMBER=999999999;
	
	final String ENTER_INPUT="Please type a number(max upto 9 digits)";
	
	final String INPUT_NUMBER_ZERO="Number in Words:: Zero";
	
	final String NUMBER_IN_WORDS="Number in Words:: ";
	final String EMPTY_CHAR = "";
	final String SPACE_CHAR = " ";
	final String WORD_MINUS = "minus ";
	final String WORD_MILLION = " million ";
	final String WORD_THOUSAND = " thousand ";
	final String WORD_HUNDRED = " hundred and ";
	final String NUMBER_OUT_OF_RANGE="Given Input is Out of Range :: Please Enter a Valid 0<= number <= 999999999::";

	final String LOGGER_CLASS_MESSAGE_START = "Start of main() method in Class::";
	final String LOGGER_CLASS_MESSAGE_END = "End of main() method in Class ::";
	final String LOGGER_IME_EXCEPTION_MESSAGE = "Given Input is Not a Number Type :: Please Enter a Valid number ::";
	final String LOGGER_EXCEPTION_MESSAGE = "An Expection Occured in the main() method ::";
	final String LOGGER_INPUT_METHOD_MESSAGE_START = "Start of convertNumberToWord method in Class::";
	final String LOGGER_INPUT_METHOD_MESSAGE_END = "Ends of convertNumberToWord method in Class::";
	
	final String[] UNITS_ARRAY = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };
	final String[] TENS_ARRAY = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };
}
