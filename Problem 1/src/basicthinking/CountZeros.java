/**
 * Problem1: Count Zeroes
 * Given an array that contains some number of contiguous zeroes at the start, followed by some arbitrary integers other than zero. Write an efficient function that returns the number of zeroes in the given array.
 * Function Prototype:
 * int countZeroes(int []a, int n)
 * Example
 * Input: 0 0 0 0 0 3 2 8 11 10 15 22
 * Output: 5
 */
package basicthinking;

import java.util.Arrays;
import java.util.Random;

/**
 * @author amareshjana
 *
 */
public class CountZeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int a[] = {0,0, 0, 0, 0, 3, 2, 8, 11, 10, 15, 22};
		int a[] = randomGenerator(Integer.parseInt(args[0]));
//		for (int i =0 ; i< a.length;++i)
//			System.out.println(a[i]);
		long start = System.currentTimeMillis();
		int count = countZeros(a);
		long end = System.currentTimeMillis();

		System.out.println("Count of zeros are "+ count);
		System.out.println((end - start) / 1000.0 + "seconds");
	}

	/**
	 * count zeros
	 * @param a[] is the array with number
	 * */
	public static int countZeros(int a[]){
		int nCount = 0;
		for(int i = 0; i < a.length; ++i){
			if (a[i] == 0)
				++nCount;
			else
				break;
		}
		return nCount;
	}
	
	/**
	 * random number generator
	 * @param size
	 * */
	public static int[] randomGenerator(int size){
		int a[]= new int[size];
		Random mRandom = new Random();
		for (int i =0 ; i < size;++i){
			a[i] = mRandom.nextInt(size);
		}
		Arrays.sort(a);
		return a;
	}

}
