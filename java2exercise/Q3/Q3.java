package Q3;
// WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
public class Q3 {
    public static void main(String[] args) {
         try{
            Class.forName("Chirag");
        }catch (ClassNotFoundException e){
            System.out.println(e.getStackTrace());
    }
}
}
