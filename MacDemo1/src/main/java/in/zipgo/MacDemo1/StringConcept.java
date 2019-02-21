package in.zipgo.MacDemo1;
import java.util.*;

public class StringConcept {
	
	public static void main(String []args){
		StringConcept h=new  StringConcept();
	    h.checkStringIsNumerical2();
	 }

	void checkStringIsNumerical2(){
		/*
		 * Here we can remove letter and find out only numeric from string.
		 * Character.isDigit(chr): will return only digit.
		 * Character.isLetter(chr): will return only letter.
		*/
	    String h="hello 123 for 2the rest of the 98475wt355";
	     for(int i=0;i<h.length();i++)  {
	         char chr=h.charAt(i);
	      if(chr!=' '){
	       if(Character.isDigit(chr)){
	          System.out.print(chr) ;
	       }
	       }
	    }
	 }
	
// find out each character 
	/* void checkStringIsNumerical(){
	    String h="hello 123 for the rest of the 98475wt355";
	     for(int i=0;i<h.length();i++)  {
	      if(h.charAt(i)!=' '){
	       System.out.println("Is this '"+h.charAt(i)+"' is a digit?:"+Character.isDigit(h.charAt(i)));
	       }
	    }
	 }
*/
	
	
	/*
	public static void main(final String[] args){
	    final String input = "0-123-abc-456-xyz-789";
	    final String result = stripNonDigits(input);
	    System.out.println(result);
	}*/
	
	

//Replace concept=========================================
	 /*   public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        String t="123-456-%@789@";
	        t=t.replaceAll("-%@","");
	        System.out.println(t);
	    }*/
	
	
	
}
