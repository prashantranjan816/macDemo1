package java_annotation;


/*//For more follow this video
https://www.youtube.com/watch?v=rWlHQnvrZcw&index=2&list=PLsyeobzWxl7rGC3gHSbs26-bzmPqUW-ez
*/
public class JavaCustomAnnotation {

	
	
}


//Customize Annotation
@interface SmoartPhone
{
	String os();
	int screenSize();
}



@SmoartPhone(os="Kitkat",screenSize=5)
class AndroidPhone 
{
	
	
}