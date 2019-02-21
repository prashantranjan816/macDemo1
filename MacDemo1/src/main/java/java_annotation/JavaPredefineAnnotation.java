package java_annotation;

public class JavaPredefineAnnotation {
	
	public static void main(String[] args) {
		
		B obj = new B();
		obj.method1();
	}
	
	
}



class A {
	
	public void method1(){
		System.out.println("This is Class A method");
		
	}
	
	public void method2() {	
		
	}
}


class B extends A{
	
	@Override
	public void method1() {
		
		System.out.println("This is Class B method");

		
	}
	
	
}

