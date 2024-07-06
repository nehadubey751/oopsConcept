package inheritance;

public interface MutipleInheritance {
	void methodA();
}
interface Y {
    void methodB();
}
class Z implements MutipleInheritance, Y{
    @Override
	public void methodB() {
        System.out.println("Method A from interface A");
		
	}

	@Override
	public void methodA() {
        System.out.println("Method B from interface B");
		
	}
	
	public class Main {
	    public static void main(String[] args) {
	        Z obj = new Z();
	        obj.methodA(); 
	        obj.methodB(); 
	    }
}}