//1. I can declare a method of interface as public and abstract
//2. I cannot declare an abstract method of interface as private but i can declare a private method inside interface that is not declared as abstract
//3. I can declare and initialize a variable inside interface as final and also as static but the variable's name should be uppercase
//4. Methods that are not declared as static  inside interfaces cannot have a body
//5. I can access to the static variables declared inside interfaces from the main method using the interface name(interfaceName.variableName)
//6. I can access to the static methods declared inside interfaces from the main method using the interface name(interfaceName.methodName)
//7. Interface can extends from another interface using the keyword extends
//8. I can declare a public abstract method inside interfaces

public class Main {
    public static void main(String[] args) {
        System.out.println("Identifyer Inside Interface Test: " +Test.X);
        Test.meth3();

    }
}