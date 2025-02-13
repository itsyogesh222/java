package Final;

public class Example {
      public static void main(String[] args) {

          demo obj = new demo();

          obj.setId(1); 
          obj.setName("Yogesh"); 

          System.out.println("ID: " + obj.getId());
          System.out.println("Name: " + obj.getName());
          
          
          Address a = new Address ();
          
          
          a.setCity("Mumbai");
          a.setState("Maharashtra");
          
          System.out.println("City:" + a.getCity());
          System.out.println("State:" + a.getState());
      }
}
