package com.tyss.javacollections.test;

public class NodeTest {
		private Node first = null;
		private int count = 0;
		public void add( Object e) {
			if(first == null) {
				first = new Node(e,null);
				count++;
				return ;
				
			}
			Node last =first;
			while(last.next!=null) {
				last= last.next;
			}
			last.next = new Node(e,null);
					count++;
		}
		
		//Adding
		public void add(int index, Object e) {
			if(index>=count) throw new IndexOutOfBoundsException();
			if(index==0) {
				first = new Node(e, first);
				count++;
				return ;
				
				
			}
			Node n= first;
			for (int i = 0; i <= index; i++) {
			n= n.next;
				
			}
			n.next = new Node(e,n.next);
			count++;
		}
		public Object get(int index) {
			if(index>=count) throw new IndexOutOfBoundsException();
			Node n =first;
			for (int i = 0; i <= index; i++) {
				n=n.next;
			}
			return n.e;
		}
		public int size() {
			return count;
		}
		
		//delete at particular index
		public void remove(int index) {
			if( index<0 && index>=count) throw new IndexOutOfBoundsException(); 
			if(index==0) {
				first= first.next;
				count--;
				return;
				
			}
			Node n =first;
			for (int i = 0; i <= index; i++) {
				n=n.next;
			}
			n.next=n.next.next;
			count--;
		}
		//clear method
		public void clear() {
			first=null;
			count=0;	
		}
		public String toString() {
			if(count==0)
				return "[ ]";
			String str="["+first.e;
			Node n =first;
			while(n.next!=null) {
				n=n.next;
				str+=", "+n.e;
			}
			str = "]";
			return str;
			
		
		}

	}

