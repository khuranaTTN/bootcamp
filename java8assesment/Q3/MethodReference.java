package java8session.Q3;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

interface forStatic{
    void say(int i);
}

interface forInstance1{
    void add(int i, int j);
}
interface forInstance2{
    void sub(int i, int j);
}

public class MethodReference {


    public static void saySomething(int i){
        System.out.println("Multiplication is:"+(i*i));
    }

    public void saySomething2(int i, int j){
        System.out.println("Addition is:"+(i+j));
    }

    public void saySomething3(int i, int j){
        System.out.println("Subtraction is:"+(i-j));
    }
    public static void main(String[] args) {
        // Referring static method
        forStatic says = MethodReference::saySomething;
        // Calling interface method
        System.out.println("Using static method reference:");
        says.say(8);


        MethodReference methodReference = new MethodReference(); // Creating object
        // Referring non-static method using reference
        forInstance1 says2 = methodReference::saySomething2;
        // Calling interface method
        System.out.println("\nUsing instance method reference:");
        says2.add(10,20);
        // Referring non-static method using anonymous object
        forInstance2 sayable2 = new MethodReference()::saySomething3; // You can use anonymous object also
        // Calling interface method
        //System.out.println("Using static method reference:");
        sayable2.sub(15,8);

    }
}
