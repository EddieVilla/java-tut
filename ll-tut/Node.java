public class Node {
	int val;
	Node next;

	public Node() {
		val=0;
		next=null;
	}
	
	public Node(int val, Node next) {
		this.val=val;
		this.next=next;
	}

	public Node(int val) {
		this.val=val;
		this.next=null;
	}

	public Node(Node next) {
		this.val=-1;
		this.next=next;
	}

	public void add(Node newN) {
		this.next=newN;
	}

	public static int print(Node first) {
		if(first==null)return -1;
		do {
			System.out.println(first.val);
			first=first.next;
		} while(first!=null);
		return 0;
	}
}
