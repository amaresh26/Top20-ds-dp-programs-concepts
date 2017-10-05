/**
 * 
 */
package linkedlist_problems;

/**
 * @author amareshjana
 *
 */
public interface List {
	/***
	 * this is to add the element to the list
	 * */
	 void addElement(int element);
	 void deleteElementByPosition(int position);
	 void deleteElement(int element);
	 void displayElements();
	 void getElement(int position);
	 int size();
}