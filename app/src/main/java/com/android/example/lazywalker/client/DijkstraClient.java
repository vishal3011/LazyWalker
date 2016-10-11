package com.android.example.lazywalker.client;

import com.android.example.lazywalker.model.Edge;
import com.android.example.lazywalker.model.Graph;


public class DijkstraClient {
	
	public static void main(String[] args) {
	
		// Define the edges of the graph
	
		Edge[] edges5 =
                {	new Edge(0,1,3),
                    new Edge(0,2,1),
                    new Edge(1,2,3),
                    new Edge(2,3,6),
                    new Edge(3,4,2),
                    new Edge(1,4,7)
			};

		Edge[] edges6 =
				{
                    new Edge(0,1,7),
                    new Edge(1,2,10),
                    new Edge(0,2,9),
                    new Edge(0,5,14),
                    new Edge(1,3,15),
                    new Edge(2,3,11),
                    new Edge(2,5,2),
                    new Edge(4,5,9),
                    new Edge(3,4,6),
				};

		Edge[] edges7 =
				{
					new Edge(0,2,1),
					new Edge(0,3,2),
					new Edge(2,3,1),
					new Edge(1,2,2),
					new Edge(2,4,3),
					new Edge(3,6,1),
					new Edge(5,6,1),
					new Edge(4,5,2),
					new Edge(1,5,3)
				};
		Edge[] edges8 = {
				    new Edge(0,1,4),
				    new Edge(0,2,1),
                    new Edge(1,4,7),
                    new Edge(2,4,1),
                    new Edge(2,5,3),
                    new Edge(4,5,2),
                    new Edge(0,6,7),
                    new Edge(0,3,9),
                    new Edge(3,7,6),
                    new Edge(6,7,4),
                    new Edge(3,6,3),
                    new Edge(5,7,2),
                    new Edge(5,6,2)
		};

        Edge[] edges9 = {
                    new Edge(0,1,4),
                    new Edge(0,7,8),
                    new Edge(1,2,8),
                    new Edge(1,7,11),
                    new Edge(2,3,7),
                    new Edge(2,5,4),
                    new Edge(2,8,2),
                    new Edge(3,4,9),
                    new Edge(3,5,14),
                    new Edge(4,5,10),
                    new Edge(5,6,2),
                    new Edge(6,7,1),
                    new Edge(6,8,6),
                    new Edge(7,8,7)

        };
		// Create the graph
		
		Graph graph = new Graph(edges5);
		
		// Update the graph with the shortest distances
		
		graph.calculateShortestDistances();
		
		// Display the graph
		
		System.out.println(graph.toString());
	
	}

}