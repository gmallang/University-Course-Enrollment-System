import java.util.ArrayList;


public class Course {
   private String name;
   private String code;
   private String professor;
   private int credits;
   private ArrayList<String> prerequisites; 
   private String time; 


   public Course(String name, String code, String professor, int credits, String time) {
       this.name = name;
       this.code = code;
       this.professor = professor;
       this.credits = credits;
       this.time = time;
       this.prerequisites = new ArrayList<>();
   }


   public void addPrerequisite(String prereqCode) {
       if (!prerequisites.contains(prereqCode)) {
           prerequisites.add(prereqCode);
       }
   }


   public boolean hasPrerequisites() {
       return !prerequisites.isEmpty();
   }


   public void displayPrerequisites() {
       if (prerequisites.isEmpty()) {
           System.out.println("No prerequisites.");
       } else {
           System.out.println("Prerequisites: " + String.join(", ", prerequisites));
       }
   }


   public String getName() {
       return name;
   }


   public String getCode() {
       return code;
   }


   public String getProfessor() {
       return professor;
   }


   public int getCredits() {
       return credits;
   }


   public String getTime() {
       return time;
   }


   public ArrayList<String> getPrerequisites() {
       return prerequisites;
   }


  
   public void setName(String name) {
       this.name = name;
   }


   public void setCode(String code) {
       this.code = code;
   }


   public void setProfessor(String professor) {
       this.professor = professor;
   }


   public void setCredits(int credits) {
       this.credits = credits;
   }


   public void setTime(String time) {
       this.time = time;
   }


   public void display() {
       System.out.println("Course: " + name);
       System.out.println("Code: " + code);
       System.out.println("Professor: " + professor);
       System.out.println("Credits: " + credits);
       System.out.println("Time: " + time);
       displayPrerequisites();
   }
}
