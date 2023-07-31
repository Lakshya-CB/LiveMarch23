package Lec_Graph;

public class Client {
	public static void main(String[] args) {
		Graph G = new Graph(7);
		G.addEdge(1, 4, 6);
		G.addEdge(1, 2, 10);
		G.addEdge(2, 3, 2);
		G.addEdge(3, 4, 3);
		G.addEdge(5, 4, 10);
		G.addEdge(5, 6, 9);
		G.addEdge(5, 7, 15);
		G.addEdge(6, 7, 13);
		System.out.println(G.G);
		System.out.println(G.hasPath(1, 7));

	}
}
