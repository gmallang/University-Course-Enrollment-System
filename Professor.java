import java.util.ArrayList;


public class Professor extends Person {
   private String department;
   private double salary;
   private ArrayList<Student> advisees;


   public Professor(String fName, String lName, int id, String department, double salary) {
       super(fName, lName, id);
       this.department = department;
       this.salary = salary;
       advisees = new ArrayList<>();


   }


   public String getDepartment() {
       return department;
   }


   public double getSalary() {
       return salary;
   }


   public ArrayList<Student> getAdvisees() {
       return advisees;
   }


   public void setDepartment(String department) {
       this.department = department;
   }


   public void setSalary(double salary) {
       this.salary = salary;
   }


   public void addAdvisee(Student student) {
       for (int i = 0; i < advisees.size(); i++)
       {
           if (advisees.get(i).getId() == student.getId()) {
               advisees.remove(i);
               return;
           }
       }
   }




   public void removeAdvisee(int id) {
       for (int i = 0; i < advisees.size(); i++) {
           if (advisees.get(i).getId() == id) {
               System.out.println("Already exists");
               advisees.remove(i);
               return;
           }
       }
   }


   @Override
   public void display() {
       super.display();
       System.out.println("Department: " + this.department);
       System.out.println("Salary: " + this.salary);
       System.out.println("Advisees");
       for (Student advisee : advisees) {
           System.out.println("\t" + advisee.getFirstName() + " " + advisee.getLastName());
       }


   }


}
