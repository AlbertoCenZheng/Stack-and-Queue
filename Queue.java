/**
 * 
 * @author Alberto
 * 
 * Queue class;
 * 
 * CSI 213
 * Dr.Magenus;
 * Apr/2/2017
 */
public class Queue {

	public Node front , end;
	

	public Node peek(){
		return end;
	}
	
	public void dequeue(){
		end = end.getPrev();
		end.setNext(null);
	}
	
	public void enqueue(Node newnode){
		newnode.setNext(front);
		front = newnode;
	}
}
