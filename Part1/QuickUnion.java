public class QuickUnionUF{
		private int[] id;
	public QucikUnionUF(N){
		id  = new int(N);
		for(int i = 0; i < N; i++){
			id[i] = i;
		}
	public boolean connect(int p , int q){
		return id[p] === id[q];
	}
	public int root(i){
		while(i != id[i]) i = id[i];
		return i
	}
	public void union(int p ,int q){
		int i =  root(p);
		int j  = root(q);
		id[i] = j;
	}

	}
}