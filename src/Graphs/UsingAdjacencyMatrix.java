package Graphs;
import java.util.*;

public class UsingAdjacencyMatrix {
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] graph = takeGraphInput();
		
		for(int i=0; i<graph.length; i++) {
			for(int j=0; j<graph[0].length; j++) {
				System.out.print(graph[i][j]);
			}
			System.out.println();
		}
		
		dfs(graph);
		
		

	}
	
	

	private static void dfs(int[][] graph) {
		
		boolean visited[] = new boolean[graph.length];
		helperDfs(graph,visited,8);
		
		
		
	}


	private static void helperDfs(int[][] graph, boolean[] visited,int i) {
		
		visited[i] = true;
		
		System.out.print(i+" ");
		
		
		for(int j=0; j<graph.length; j++) {
			if(!visited[j] && graph[i][j] == 1) {
				helperDfs(graph,visited,j);
			}
		}
		
		
	}



	private static int[][] takeGraphInput() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);	
		int v,e;
		System.out.println("Enter number of Vertices : ");
		v = s.nextInt();
		
		System.out.println("Enter number of edges : ");
		e = s.nextInt();
		
		int[][] graph = new int[v][v];
			
		for(int i=0; i<e; i++) {
			
			System.out.print("Enter edge "+(i+1)+" (v1,v2) : ");
			
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			
			graph[v1][v2] = 1;
			graph[v2][v1] = 1;
			
		}
		
		return graph;
	}

}


//
//9
//12
//0 3
//0 1
//0 5
//0 4
//3 2
//1 2
//4 5
//2 8
//2 6
//8 6
//6 5
//5 7


