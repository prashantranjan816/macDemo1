package Java_Exception;

public class Exception_throw {

	static int a=18;
	static int b=60;
	 static void validate(int age){  
	   /*  if(age<a)  
	      throw new ArithmeticException("not valid , please enter age more than "+a);  
	     
	     if(age>b)
	     throw new ArithmeticException("not valid , please enter age less than "+ b); 
	     */
	     if(age<a||age>b)
		     throw new ArithmeticException("not valid , please enter age in between " + a + "-" + b ); 
	     else  
	      System.out.println("welcome to vote");  
	   } 
	 
	 
	 
	 
	 
	 
	 
	 
	   /**
	 * @param args
	 */
	public static void main(String args[]){  
	      validate(17);   
	      System.out.println("proceed please...");  
	  }  
	}

