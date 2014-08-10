import java.util.*;
import java.io.*;

public class ArrayAlg {
	//phan 2a
	/*public <T> void printArray(T[] a){
		for (int i = 0; i< a.length; i++){
			System.out.println(a[i]);
		}*/
	
	//phan 2b
	public <T> void printArray(T[] a,int start,int end) throws Exception{
	
			for (int i = start; i < end; i++) {
			if (start < 0 || start >= end || end > a.length) 
				throw new Exception();
			System.out.print(a[i] + " ");
		}
	}
	
	
	//phan 2c
	public static <T extends Comparable<T>> Pair<T> maxTwo(T[] a){
		if (a == null || a.length == 0) return null;
		else{
			T max = a[0];
			Integer in = new Integer(0);
			T maxse = (T)in;
			try{
			/*for (int i = 1; i < a.length; i++){
				if (max.compareTo(a[i]) < 0) {
				max = a[i];
				}
				if (a[i].compareTo(max) < 0) 
				maxse = a[i];
			}*/
				for(int i = 0; i< a.length; i++){
					if(a[i].compareTo(maxse)>0){
						if(a[i].compareTo(max) > 0){
							maxse = max;
							max = a[i];
						}
						else 
							maxse = a[i];
					}
					else if(maxse.compareTo(max)>= 0)
						maxse = a[i];
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
			return new Pair<T>(max, maxse);
		}
	}
	

	
	public static void main(String [] args){
		ArrayAlg a = new ArrayAlg();		
		Integer[] number = {1,5,7,9,2,4};
		try{
			a.<Integer>printArray(number,1,5);
		}
		catch(Exception e){
			System.out.println(e);
		}
		Pair<Integer> mt = a.maxTwo(number);
		System.out.println("max = " + mt.getFirst());
		System.out.println("maxse = " + mt.getSecond());
	}
}