package in.zipgo.MacDemo1;

public class StringBufferConcept {

	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);// Hello Java  
		}  
}
