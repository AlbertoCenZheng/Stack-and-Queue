/**
 * 
 * @author Alberto
 * 
 * Stack class;
 * 
 * CSI 213
 * Dr.Magenus;
 * Apr/2/2017
 */
public class Stack {
	public Node top;
	
	public Node peek(){
		return top;
	}
	
	public void pop(){
		top = top.getNext();
		top = null;
	}
	
	public void push(Node newnode){
		newnode.setNext(top);
		top = newnode;
	}
}
