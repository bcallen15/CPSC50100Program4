//******************************************
//	Set.java		Author: Ben Callen
//
//	Adds, deletes, checks and prints a list
//	of values added by user input
//******************************************

public class Set {

	private LinkedNode first;
	
	public Set() {
		first = null;
	}
	// method to add number to array by user input
	public void add(int x) {
		if(!exists(x)) {
			LinkedNode node = new LinkedNode(x);
			node.setNext(first);
			first = node;
		}
	}
	//method to delete number from array by user input
	public void delete(int x) {
		if(first !=null) {
			if(first.getData()==x) {
				first = first.getNext();
			}
			else {
				LinkedNode holder = first; //holder is a placeholder for the node
				while(holder.getNext() != null) {
					if(holder.getNext().getData()==x) {
						holder.setNext(holder.getNext().getNext());
						break;
					}
					
					holder = holder.getNext();
				}
			}
		}
	}
	//checks to see if value is in array or not and returns true or false
	public boolean exists(int x) {
		LinkedNode holder = first;
		
		while(holder != null) {
			if(holder.getData()==x) {
				return true;
			}
			holder = holder.getNext();
		}
		
		return false;
	}
	
	public String toString() {
		String data = "";
		LinkedNode holder = first;
		
		while(holder != null) {
			data += holder.getData() + " ";
			holder = holder.getNext();
		}
		
		return data;
	}

}
