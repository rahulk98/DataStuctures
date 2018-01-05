
import java.util.LinkedList;
import java.util.Scanner;

public class Graph {
	int g[][];
	int v;
	boolean visited[];
	
	public Graph(){
		
	}
	public Graph(int v){
		g = new int[v][v];
		this.v = v;
		visited = new boolean[v+1];
		for(int i =0;i<=v;i++){
			visited[i] = false;
		}
	}
	public void createMatrix(){
		Scanner s = new Scanner(System.in);
		int e = s.nextInt();
		for(int i = 0; i<e; i++){
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			this.find(v1, v2);
			
		}
	}
	public void print(){
		System.out.print(" ");
		for(int i = 0; i < v; i++){
			System.out.print("  " + (i+1));
		}
		System.out.println();
		for(int i = 0; i < v; i++ ){
			System.out.print(i+1);
			for(int j = 0;j < v; j++){
				System.out.print("  " + g[i][j]);
			}
			System.out.println();
		}
	}
	public void breadthFirstTraversal(){
		LinkedList<Integer> q = new LinkedList<Integer>();
		
		System.out.println("Breadth First Traversal");
		q.add(1);
		visited[1] = true;
		System.out.println(1);
		while(!q.isEmpty()){
			int u = q.poll();
			for(int i = 0; i<v; i++ ){
				if(g[u-1][i] == 1){
					if(visited[i+1] != true){
						visited[i+1] = true;
						System.out.println(i+1);
						q.add(i+1);
					}
				}
			}
		}
	}
	public void depthFirstTraversal(){
		for(int i =0;i<=v;i++){
			visited[i] = false;
		}
		System.out.println("Depth First Traversal");
		visited[1] = true;
		dfs_visit(1);
	}
	public void dfs_visit(int u){
		visited[u] = true;
		System.out.println(u);
		for(int i = 0; i<v; i++ ){
			if(g[u-1][i] == 1){
				if(visited[i+1] != true){
					visited[i+1] = true;
					dfs_visit(i+1);
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		Graph U = new Graph(v);
		U.createMatrix();
		
	}
}
