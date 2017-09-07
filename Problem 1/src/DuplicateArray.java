import java.util.Random;

/**
 * @author amareshjana
 * @question remove the duplicates from the array different approaches are done with time and space complexity
 *
 */
public class DuplicateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int size = Integer.parseInt(args[0]);
		int[] input = new int[size];
		Random mRandom = new Random();
		for (int i = 0;i < size;++i)
			input[i] = mRandom.nextInt(size) + 1;

		long start = System.currentTimeMillis();
		int[] newArry = removeDuplicates1(input);
		long end = System.currentTimeMillis();
		
//		for (int a : newArry){
//			System.out.print(a+" ");
//		}
		System.out.println((end - start) / 1000.0 + "seconds");
	}

	/**
	 *@param given array with duplicate numbers and need to remove the duplicates from the array
	 *@return an array without duplicates
	 *Adhock method
	 * Time Complexity - O(n^2)
	 * */
	public static int[] removeDuplicates1(int[] array){
		int mSizeOfNewArry = 0;
		
		for (int i = 0; i < array.length; ++i){
			if (array[i] != Integer.MAX_VALUE){
				++mSizeOfNewArry;
				for (int j = i+1; j< array.length;++j){
					if (array[i] == array[j]){
						array[j] = Integer.MAX_VALUE;
					}
				}
			}
		}
		
		int[] out = new int[mSizeOfNewArry];
		int k = 0;
		for (int i = 0; i < array.length;++i){
			if (array[i] != Integer.MAX_VALUE)
				out[k++] = array[i];
		}
		return out;
	}
	
	/**
	 *@param given array with duplicate numbers and need to remove the duplicates from the array
	 *@return an array without duplicates
	 *sorting and duplicates check
	 * */
	public static int[] removeDuplicates2(int[] array){
		int mSizeOfNewArry = 0;
		
		for (int i = 0; i < array.length; ++i){
			if (array[i] != Integer.MAX_VALUE){
				++mSizeOfNewArry;
				for (int j = i+1; j< array.length;++j){
					if (array[i] == array[j]){
						array[j] = Integer.MAX_VALUE;
					}
				}
			}
		}
		
		int[] out = new int[mSizeOfNewArry];
		int k = 0;
		for (int i = 0; i < array.length;++i){
			if (array[i] != Integer.MAX_VALUE)
				out[k++] = array[i];
		}
		return out;
	}
}