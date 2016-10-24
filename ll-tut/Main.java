public class Main {
	public static void main(String[] args) {
		Node a = new Node(42);
		System.out.println("Hello World");
		Node b= new Node(1);
		a.add(b);
		int status = Node.print(a);
		System.out.println("Status: " + status);
	}
}
