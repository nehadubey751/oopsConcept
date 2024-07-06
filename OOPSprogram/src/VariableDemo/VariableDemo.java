package VariableDemo;

public class VariableDemo {
static int staticVar = 10;//static variable
    
    // Instance variable
    int instanceVar;
    
    public VariableDemo(int instanceVar) {
        this.instanceVar = instanceVar;
    }
    public void display(int paramVar) {
        // Local variable
        int localVar = 20;
        
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Parameter Variable: " + paramVar);
        System.out.println("Local Variable: " + localVar);
    }
}
