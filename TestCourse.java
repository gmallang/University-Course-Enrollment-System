public class TestCourse {
   public static void main(String[] args) {
       Course course1 = new Course("Data Structures", "CS200", "Dr. Smith", 3, "Mon 10:00 AM - 11:15 AM");
       Course course2 = new Course("Algorithms", "CS300", "Prof. Brown", 4, "Wed 2:00 PM - 3:30 PM");


       course2.addPrerequisite("CS200"); 
       course2.addPrerequisite("MATH101");


       System.out.println("Course 1:");
       course1.display();


       System.out.println("\nCourse 2:");
       course2.display();
   }
}
