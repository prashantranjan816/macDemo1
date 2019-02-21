package Java_Exception;

public class Java_exception_keywords {
 
	  public static void main(String args[]){  
		    
		   try {
			int data=25/0;  
			   System.out.println(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			System.out.println(e);
			e.printStackTrace();
		}  
		    
		  
		  finally{System.out.println("finally block is always executed");}  
		  System.out.println("rest of the code...");  
		  }  
		}

