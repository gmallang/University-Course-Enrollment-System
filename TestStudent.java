public class TestStudent {
   public static void main(String[] args) {
       Student student = new Student("Alice", "Johnson", 123, "Computer Science", 3.8, 75);


       Course course1 = new Course("Data Structures", "CS200", "Dr. Smith", 3, "Mon 10:00 AM - 11:15 AM");
       Course course2 = new Course("Algorithms", "CS300", "Prof. Brown", 4, "Mon 11:00 AM - 12:15 PM"); 
       Course course3 = new Course("Database Systems", "CS400", "Dr. Lee", 3, "Wed 2:00 PM - 3:15 PM"); 


       System.out.println("\nTrying to enroll in Data Structures...");
       student.addCourse(course1);


       System.out.println("\nTrying to enroll in Algorithms (conflict expected)...");
       student.addCourse(course2);


       System.out.println("\nTrying to enroll in Database Systems...");
       student.addCourse(course3);


       System.out.println("\nFinal Enrollment:");
       student.display();
   }
}
