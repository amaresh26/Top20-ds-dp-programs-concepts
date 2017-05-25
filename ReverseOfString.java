package leetcode_oj_easy;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		String str = mScanner.nextLine();
		System.out.println(reverseString(str));
	}
	
	public static String reverseString(String s) {
		StringBuffer sb = new StringBuffer(s);
        s = sb.reverse().toString();
        return s;
    }
}