package linkedlist;

import java.util.Random;

public class MiddleElementInLinkedList{

	public static void main(String[] args) {
		LinkedList mLinkedList = new LinkedList();
		//is used to insert the elements into the linkedlist
		addElements(mLinkedList);
		//used to display the elements into the linkedlist
		mLinkedList.displayElements();
		//used to print the middle element of the linked list
		printMiddelElement(mLinkedList);
		

	}
	
	/**
	 * This method is to add the elements into the linked list
	 * by using the random class
	 * 
	 * @param mLinkedList is the LinkedList
	 * */
	private static void addElements(LinkedList mLinkedList) {
		Random mRandom = new Random();
		for (int i = 0; i < 10; ++i ){
			int a = mRandom.nextInt(100 - 10) + 10;
			mLinkedList.addElement(a);
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
		
		while(mFastNode.getNextNode() != null){
			mSlowNode = mSlowNode.getNextNode();
			mFastNode = mFastNode.getNextNode().getNextNode();
		}
		
		System.out.println("Middle Element of Linked List is "+mSlowNode.getData());
		
	}

}