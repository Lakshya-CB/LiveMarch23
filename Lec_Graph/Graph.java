package Lec_Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

public class Graph {
//HashMap<V1,Nbr>
//	HashMap<V1,HM<V2,Wt>>
	HashMap<Integer, HashMap<Integer, Integer>> G;

	public Graph(int intial) {
		G = new HashMap<>();
		for (int U = 1; U <= intial; U++) {
			G.put(U, new HashMap<>());
		}
	}

	public void signIn(int User) {
		G.put(User, new HashMap<>());
	}

	public boolean isNbr(int V1, int V2) {
		HashMap<Integer, Integer> Nbr_V1 = G.get(V1);
		return Nbr_V1.containsKey(V2);
	}

	public void addEdge(int V1, int V2, int Wt) {

		HashMap<Integer, Integer> Nbr_V1 = G.get(V1);
		Nbr_V1.put(V2, Wt);
		HashMap<Integer, Integer> Nbr_V2 = G.get(V2);
		Nbr_V2.put(V1, Wt);
	}

	public void removeEdge(int V1, int V2) {
		HashMap<Integer, Integer> Nbr_V1 = G.get(V1);
		Nbr_V1.remove(V2);
		HashMap<Integer, Integer> Nbr_V2 = G.get(V2);
		Nbr_V2.remove(V1);
	}

	public boolean hasPath(int src, int dest) {
		return hasPath(src, dest, "", new HashSet<>());
	}

	private boolean hasPath(int curr, int dest, String path, HashSet<Integer> Visited) {
		if (curr == dest) {
			System.out.println(path + "-" + dest);
			return true;
		}
		if (Visited.contains(curr)) {
			return false;
		}
		boolean ans = false;
		Visited.add(curr);
		for (int nbr : G.get(curr).keySet()) {
			boolean sp = hasPath(nbr, dest, path + "-" + curr, Visited);
			ans = ans || sp;
		}
		Visited.remove(curr);
		return ans;
	}

	public void BFS(int src) {
		Queue<Integer> Q = new LinkedList<Integer>();
		Q.add(src);
		HashSet<Integer> Visited = new HashSet<>();
		while (Q.isEmpty()) {
			int V = Q.poll();
			if(Visited.contains(V)) {
				System.out.println("CYCLE HEIN!!");
			}
			Visited.add(V);
			for (int nbr : G.get(V).keySet()) {
				if (!Visited.contains(nbr)) {
					Q.add(nbr);
				}
			}

		}
		
	}
	public void BFT() {
		HashSet<Integer>Visited = new HashSet<>();
		int NOC = 0;
		for(int src : G.keySet()) {
			if(Visited.contains(src)) {
				continue;
			}
			Queue<Integer> Q = new LinkedList<>();
			Q.add(src);
			while (Q.isEmpty()) {
				int V = Q.poll();
				if(Visited.contains(V)) {
					System.out.println("CYCLE HEIN!!");
				}
				Visited.add(V);
				for (int nbr : G.get(V).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);
					}
				}

			}
			NOC++;
		}
		System.out.println(NOC);
	}

}
