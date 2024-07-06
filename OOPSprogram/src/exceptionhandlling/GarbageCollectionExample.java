package exceptionhandlling;

public class GarbageCollectionExample {
	public static void main(String[] args) {
        GarbageCollectionExample obj1 = new GarbageCollectionExample();
        GarbageCollectionExample obj2 = new GarbageCollectionExample();
        
        obj1 = null;
        obj2 = null;
        
        System.gc();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("End of main method");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called on object: " + this);
        super.finalize();
    }
}