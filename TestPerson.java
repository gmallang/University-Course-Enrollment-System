public class TestPerson {
   public static void main(String[] args) {
       Person person = new Person("Caleb", "Williams", 1013);
       System.out.println("First Name: " + person.getFirstName());
       System.out.println("Last Name: " + person.getLastName());
       System.out.println("ID: " + person.getId());
       person.display();
   }
  
}
