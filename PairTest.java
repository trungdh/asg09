public class PairTest {
	public static void main(String [] args){
	
		Pair<String> ss =  new Pair<String>("first","second");
		System.out.println(ss.toString());
		
		Pair<Integer> ite =  new Pair<Integer>(10,20);
		System.out.println(ite.toString());
	}
}