package java_abstract;

public class AbstractClassB extends AbstractClassA{
	
	public void methodB1()
	{
		System.out.println("This is methodB1");
	}

	@Override
	public void methodA3() {
		// TODO Auto-generated method stub
		
		System.out.println("This is methodA3");
		
	}
public static void main(String[] args) {
	AbstractClassA obj = new AbstractClassB();
	obj.methodA1();
	obj.methodA4();
	
	
}

/*@Override
public void methodA4() {
	// TODO Auto-generated method stub
	System.out.println(" over ride methos4");
	
}*/

@Override
public void methodA5() {
	// TODO Auto-generated method stub
	
}
	
}
