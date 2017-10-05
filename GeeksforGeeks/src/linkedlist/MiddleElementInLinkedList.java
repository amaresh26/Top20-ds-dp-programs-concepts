package linkedlist;

import java.util.Random;

import performancecalc.ProgramPerformanceCalc;

public class MiddleElementInLinkedList{
	//to increase or decrease the size of the linked list please change the LIST_SIZE values
	private static final int LIST_SIZE = 1_00_00_000;

	public static void main(String[] args) {
		//linked list for finding the middle element
		LinkedList mLinkedList = new LinkedList();

		//Performance calc for the program written
		ProgramPerformanceCalc mCalc = new ProgramPerformanceCalc();

		//is used to insert the elements into the linkedlist
		addElements(mLinkedList);

		//used to display the elements into the linkedlist
		// if not need please comment the line
		//mLinkedList.displayElements();

		//calling the starttime to take the start time
		mCalc.startTime();

		//used to print the middle element of the linked list
		printMiddelElement(mLinkedList);

		//time after finishing the execution of your program
		mCalc.endTime();

		//calculating the time taken by your program to execute
		mCalc.calTime();
	}

	/**
	 * This method is to add the elements into the linked list
	 * by using the random class
	 * 
	 * @param mLinkedList is the LinkedList
	 * */
	private static void addElements(LinkedList mLinkedList) {
		Random mRandom = new Random();
		for (int i = 0; i < LIST_SIZE; ++i){
			mLinkedList.addElement(mRandom.nextInt(100 - 1) + 1);
		}
	}

	/**
	 * this method is used to print the middle element of the
	 * linked list
	 * 
	 * @param mList is the linkedList used to print the middleElement
	 * */
	private static void printMiddelElement(LinkedList mList){

		ListNode mSlowNode = mList.getHeadNode().getNextNode();
		ListNode mFastNode = mList.getHeadNode().getNextNode().getNextNode();

		while(mFastNode != null && mFastNode.getNextNode() != null){
			mFastNode = mFastNode.getNextNode().getNextNode();
			mSlowNode = mSlowNode.getNextNode();
		}
		//displaying the middle element of the linked list
		System.out.println("Middle Element of Linked List is "+mSlowNode.getData());
	}
}