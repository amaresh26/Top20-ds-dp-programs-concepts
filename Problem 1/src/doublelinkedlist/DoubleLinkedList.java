package doublelinkedlist;

public class DoubleLinkedList {
	private int size ;
	private ListNode head;
	private ListNode tail;

	public DoubleLinkedList() {
		this.size = 0;
		head = new ListNode();
		tail = new ListNode();
	}

	/**
	 * will add the element at the last of list
	 * Time Complexity -  
	 * Space Complexity - 
	 * */
	public void addFirst(int data){
		ListNode mListNode = new ListNode(data);
		if (head.getNext() == null){
			head.setNext(mListNode);
			tail = mListNode;
		} else {
			//if head node is already having the next element
			//copying that node address in temp 
			ListNode temp = head.getNext();
			//setting the head next address to new Node mListNode
			head.setNext(mListNode);
			//setting the new Node next as temp which is the head next element previously
			mListNode.setNext(temp);
			//setting the new node prev with head node address
			mListNode.setPrev(head);
		}
	}

	/**
	 * will add the element at the last of list
	 * */
	public void addLast(int data){
		ListNode mListNode = new ListNode(data);
		tail.setNext(mListNode);
		mListNode.setPrev(tail);
		tail = mListNode;
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
	private ListNode next;
	private int data;
	private ListNode prev;

	ListNode(int data){
		this.data = data;
	}

	ListNode(){}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getPrev() {
		return prev;
	}

	public void setPrev(ListNode prev) {
		this.prev = prev;
	}
}