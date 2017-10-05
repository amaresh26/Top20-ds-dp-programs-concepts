/**
 * 
 */
package linkedlist_problems;

/**
 * @author amareshjana
 *
 */
public class ListNode {

	private ListNode nextNode;
	private int data;


	/**
	 * @param nextNode
	 * @param data
	 */
	public ListNode(ListNode nextNode, int data) {
		super();
		this.nextNode = nextNode;
		this.data = data;
	}


	/**
	 * constructor with no parameters
	 */
	public ListNode() {
		
	}

	/**
	 * @return the nextNode
	 */
	public ListNode getNextNode() {
		return nextNode;
	}
	/**
	 * @param nextNode the nextNode to set
	 */
	public void setNextNode(ListNode nextNode) {
		this.nextNode = nextNode;
	}
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
}