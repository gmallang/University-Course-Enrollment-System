public class Person {
   private String firstName;
   private String lastName;
   protected int id;


   public Person(String firstName, String lastName, int id) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.id = id;


   }


   public String getFirstName() {
       return firstName;
   }


   public String getLastName() {
       return lastName;
   }


   public int getId() {
       return id;
   }


   public void display() {
       System.out.println("Name: " + this.firstName + " " + this.lastName);
       System.out.println("Id: " + this.id);
   }


}
