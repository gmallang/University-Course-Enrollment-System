import java.util.ArrayList;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Student extends Person {
   private String major;
   private double gpa;
   private int credits;
   private double balance;
   private boolean transfer;
   private ArrayList<Course> enrolledCourses; 
   private ArrayList<String> completedCourses;


   public Student(String fName, String lName, int id, String major, double gpa, int credits) {
       super(fName, lName, id);
       this.major = major;
       this.gpa = gpa;
       this.credits = credits;
       this.balance = 0;
       this.enrolledCourses = new ArrayList<>();
       this.completedCourses = new ArrayList<>();
   }


   public boolean conflictsWith(Course newCourse) {
       for (Course existing : enrolledCourses) {
           if (isTimeConflict(existing, newCourse)) {
               System.out.println("⚠️ Time conflict with " + existing.getName());
               return true;
           }
       }
       return false;
   }


  
   private boolean isTimeConflict(Course c1, Course c2) {
       String[] c1Parts = c1.getTime().split(" ");
       String[] c2Parts = c2.getTime().split(" ");


       String day1 = c1Parts[0];
       String day2 = c2Parts[0];


       if (!day1.equals(day2)) {
           return false;
       }


       LocalTime[] range1 = parseTimeRange(c1Parts[1] + " " + c1Parts[2], c1Parts[4] + " " + c1Parts[5]);
       LocalTime[] range2 = parseTimeRange(c2Parts[1] + " " + c2Parts[2], c2Parts[4] + " " + c2Parts[5]);


       return !(range1[1].isBefore(range2[0]) || range1[0].isAfter(range2[1]));
   }


   private LocalTime[] parseTimeRange(String start, String end) {
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
       LocalTime startTime = LocalTime.parse(start, formatter);
       LocalTime endTime = LocalTime.parse(end, formatter);
       return new LocalTime[]{startTime, endTime};
   }


   public boolean addCourse(Course course) {
       if (!conflictsWith(course)) {
           enrolledCourses.add(course);
           System.out.println("✅ Enrolled in: " + course.getName());
           return true;
       } else {
           System.out.println("❌ Could not enroll due to time conflict.");
           return false;
       }
   }
