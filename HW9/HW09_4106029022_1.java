import java.util.ArrayList;
import java.util.Stack;
public class HW09_4106029022_1 extends LSD {
	
	public  int Distance(int[][] array) {
		int shortestPathArr[]= new int[100];
        int pathAmount =0;
        int answer =0;
        int v = 0;
        

        for(int i=0; i<array.length;i++) {
        	for(int j=0; j<array[0].length;j++) {
        		if( v < array[i][j]) {
        			v =array[i][j];
        		}
        	}
        }
        
        v=v+1;
 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }
 
        
        for(int i=0; i<array.length;i++) { 
        		addEdge(adj, array[i][0], array[i][1] );   
        }
         
        int [] vector = new int[v-1];
        
        for(int i=0; i<vector.length;i++) { 
        		vector[i]=i;
        }
	
    	for(int i=0; i<vector.length;i++) { 
    		for(int j=1; j < vector.length;j++) {
    			shortestPathArr[pathAmount] =printShortestDistance(adj, vector[i], vector[j], v);
    			pathAmount++;
    		}
    	}
    	for(int i=0; i<shortestPathArr.length;i++) {
    		if(answer < shortestPathArr[i]) {
    			answer =shortestPathArr[i];
    		}
    	}
    	return answer;

    } 

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j)
    {
        adj.get(i).add(j);
        adj.get(j).add(i);
    }
 

    private static int printShortestDistance(ArrayList<ArrayList<Integer>> adj,int s, int dest, int v)
    {

        int pred[] = new int[v];
        int dist[] = new int[v];
 
        if (BFS(adj, s, dest, v, pred, dist) == false) {

            return 0;
        }
 

 
        return dist[dest];
    }
    
    private static boolean BFS(ArrayList<ArrayList<Integer>> adj, int src,
            int dest, int v, int pred[], int dist[])
	{

    	java.util.LinkedList<Integer> queue = new java.util.LinkedList<Integer>();

		boolean visited[] = new boolean[v];
		
		for (int i = 0; i < v; i++) {
		visited[i] = false;
		dist[i] = Integer.MAX_VALUE;
		pred[i] = -1;
		}
	

		visited[src] = true;
		dist[src] = 0;
		queue.add(src);
		
		while (!queue.isEmpty()) {
		int u = queue.remove();
			for (int i = 0; i < adj.get(u).size(); i++) {
				if (visited[adj.get(u).get(i)] == false) {
				visited[adj.get(u).get(i)] = true;
				dist[adj.get(u).get(i)] = dist[u] + 1;
				pred[adj.get(u).get(i)] = u;
				queue.add(adj.get(u).get(i));
			

				if (adj.get(u).get(i) == dest)return true;
				}
			}
		}
		return false;
	}
    

    
    

    
    public static void main(String args[])
    {
        int inputArray[][] = {{0,1},{0,2},{0,4},{1,3},{1,4},{2,5},{6,7}};
        HW09_4106029022_1  hw =  new HW09_4106029022_1();
        	System.out.print(hw.Distance(inputArray));
    }
}


