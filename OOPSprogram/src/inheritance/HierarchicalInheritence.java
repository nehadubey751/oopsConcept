package inheritance;
class A{  
void eat()
{
	System.out.println("eating");}  
}  
class B extends A{  
void bark()
{
	System.out.println("barking");}  
}  
class C extends A{  
void meow()
{
	System.out.println("meowing");}  
}  
public class HierarchicalInheritence {
	public static void main(String args[]){  
		C c=new C();  
		c.meow();  
		c.eat();  
		
}
	}  

