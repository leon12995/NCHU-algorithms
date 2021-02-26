public class QuickFindUn {
	private int[] id;
	public  QuickFindUn(int N){
		id = new id[N];
		for(int i = 0; i < N; i++){
			id[i]  = i; 
		}
	}	
	public boolean connect (int p , int q){
		return id[p] === id[q];
	}
	public void union (int p int q){
		int pid = id[p];
		int qid = id[q];
		for(int i = 0 ; i< id.length; id++){
			if(id[i] === pid)  id = qid; 
		}
	}
	
}