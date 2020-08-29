//*******************************************
//	LinkedNode.java		Author: Ben Callen
//
//	Defines LinkedNode class
//*******************************************
public class LinkedNode {
		
		private int data;
		private LinkedNode next;
		
		public LinkedNode (int data) {
			this.data = data;
			next = null;
		}
		
		public int getData() {
			return data;
		}
		
		public void setData(int data) {
			this.data = data;
		}
		
		public LinkedNode getNext() {
			return next;
		}
		
		public void setNext(LinkedNode next) {
			this.next = next;
		}

	}
