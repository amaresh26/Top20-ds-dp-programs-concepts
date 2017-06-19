package doublelinkedlist;

public class DoubleLinkedList {
	private int size = 0;
	private ListNode head;
	private ListNode tail;


	/**
	 * will add the element at the last of list
	 * */
	public void addFirst(int data){

	}

	/**
	 * will add the element at the last of list
	 * */
	public void addLast(){

	}

	/**
	 * will add the element at the last in the list
	 * */
	public void addAfterElement(){

	}

	/**
	 * will remove the first element in the list
	 * */
	public void removeFirst(){

	}

	/**
	 * will remove the element at the last in the list
	 * */
	public void removeLast(){

	}

	/**
	 * this is to remove the element which is having the data given by the user
	 * */
	public void removeElement(int data){

	}

	/**
	 * to remove all the data in the doubly linked list
	 * */
	public void emptyList(){

	}

	/**
	 * will method get to know the size of the doubly linked list
	 * */
	public int getSize(){
		return size;
	}

}

class ListNode {
	private ListNode front;
	private int data;
	private ListNode back;


	public ListNode getFront() {
		return front;
	}
	public void setFront(ListNode front) {
		this.front = front;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getBack() {
		return back;
	}
	public void setBack(ListNode back) {
		this.back = back;
	}
}