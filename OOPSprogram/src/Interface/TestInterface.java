package Interface;
interface Drawable{  
void draw();  
}  
class Rectangle implements Drawable
{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class Circle implements Drawable
{  
public void draw(){System.out.println("drawing circle");}  
}  
public interface TestInterface {
	public static void main(String args[]){  
		Drawable d=new Circle();  
		d.draw();  
		}
	
}  

