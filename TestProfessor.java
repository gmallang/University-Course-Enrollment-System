import java.util.ArrayList;


public class TestProfessor {
   public static void main(String[] args) {
       Student s1 = new Student("Jake", "Long", 987, "CS", 3.8, 100);
       Student s2 = new Student("John", "Brown", 750, "Econ", 4.0, 120);
       Professor p1 = new Professor("Liam", "Jones", 805, "CS", 9012);


       p1.setDepartment("Math");
       p1.setSalary(100000);


       p1.addAdvisee(s1);
       p1.addAdvisee(s2);


       p1.removeAdvisee(750);


       p1.display();
      
       ArrayList<Student> myAdvisees = p1.getAdvisees();
       System.out.println("\nUpdated Advisee List:");
       for (Student s : myAdvisees) {
           System.out.println(s.getFirstName() + " " + s.getLastName());
       }
   }
}
