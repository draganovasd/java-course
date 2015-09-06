package Graphs;

import java.util.Scanner;

public class TestGraph {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Creating a new matrix of size 4");
		Graphs graph = new Graphs(4);
		
		graph.connectEdges(1, 2);
		graph.connectEdges(2, 3);
		graph.connectEdges(2, 4);
		graph.connectEdges(3, 4);
		graph.connectEdges(1, 1);
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Choose two edges to check for connection: ");
			int edge1 = input.nextInt();
			int edge2 = input.nextInt();
			System.out.println(graph.areConnected(edge1, edge2));
			System.out.println("Choose two edges to check for path between them: ");
			int edge3 = input.nextInt();
			int edge4 = input.nextInt();
			System.out.println(graph.path(edge3, edge4));
		}
		input.close();
		
	}

}
