package LeetCode;

import java.util.ArrayList;

public class integer_to_roman {

//	https://leetcode.com/problems/integer-to-roman/
//	http://help.hancom.com/hoffice/webhelp/9.0/ko_kr/hcell/formula-funtion/phrase/roman_numerals.htm

	public static String intToRoman(int num) {

		if (1 > num || num > 3999) {
			return "";
		}

		ArrayList<Integer> arrNum = new ArrayList<>();
		while (num > 0) {
			arrNum.add(num % 10);
			num /= 10;
		}

		String result = "";
		String[] resultArr = new String[arrNum.size()];
		int count = arrNum.size();

		for (int i = 0; i < arrNum.size(); i++) {
			count--;
			switch (arrNum.get(i)) {
				case 1:
					resultArr[count] = "I";
					break;
				case 2:
					resultArr[count] = "II";
					break;
				case 3:
					resultArr[count] = "III";
					break;
				case 4:
					resultArr[count] = "IV";
					break;
				case 5:
					if (count == 3) {
						resultArr[count] = "D";
					} else if (count == 2) {
						resultArr[count] = "L";
					} else {
						resultArr[count] = "V";
					}

					break;
				case 6:
					resultArr[count] = "VI";
					break;
				case 7:
					resultArr[count] = "VII";
					break;
				case 8:
					resultArr[count] = "VIII";
					break;
				case 9:
					if (count == 3) {
						resultArr[count] = "CM";
					} else if (count == 2) {
						resultArr[count] = "XC";
					} else if (count == 1) {
						resultArr[count] = "IX";
					}
					break;
				case 0:
					if (count == 3) {
						resultArr[count] = "M";
					} else if (count == 2) {
						resultArr[count] = "C";
					} else if (count == 1) {
						resultArr[count] = "X";
					}
					break;
			}

		}

		//일의 자리, 이의 자리, 삼의 자리 거꾸로 합치기
		for (int i = arrNum.size() - 1; i >= 0; i--) {

			result += resultArr[i];
		}

		return result;

	}

	public static void main(String[] args) {
//		Input: num = 3
//		Output: "III"
//
//		Input: num = 58
//		Output: "LVIII"
//		Explanation: L = 50, V = 5, III = 3

//		Input: num = 1994
//		Output: "MCMXCIV"
//		Explanation: M = 1000, CM = 900, XC = 90 and IV = 4

//		int num = 100;
//		ArrayList<Integer> arrNum = new ArrayList<>();
//		while (num > 0) {
//			arrNum.add(num % 10);
//			num /= 10;
//		}
//		System.out.println(arrNum);

		System.out.println(intToRoman(58));
	}

}
