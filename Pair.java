public class Pair<P>{ 

	private P first; 
	private P second;
	
	public Pair() {
		first = null; second = null; 
	}
	public Pair(P first, P second) {
		this.first = first; this.second = second;
	} 
	
	public P getFirst() { 
		return first; 
	} 
	
	public P getSecond() { 
		return second; 
	} 
	
	public void setFirst(P newValue) { 
		first = newValue; 
	} 
	
	public void setSecond(P newValue) { 
		second = newValue; 
	} 
	
	public String toString(){
		return ""+ first + "," + second;
	}
}

