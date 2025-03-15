import java.lang.reflect.Method;

public class Dynamic {
    public static void main(String[] args) {
        try {
            
            Class<?> clazz = Class.forName("SampleClass");
    
            Object instance = clazz.getDeclaredConstructor().newInstance();
        
            Method method = clazz.getMethod("sayHello", String.class);

        
            method.invoke(instance, "World");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class SampleClass {
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
