import java.util.*;

class Student{
   private int studentId;
   private String fullName;
   private double cgpa;
   public Student(int studentId, String fullName, double cgpa) {
      super();
      this.studentId = studentId;
      this.fullName = fullName;
      this.cgpa = cgpa;
   }
   public int getStudentId() {
      return studentId;
   }
   public String getFullName() {
      return fullName;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class Main
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int bot = Integer.parseInt(in.nextLine());
      
      List<Student> stList = new ArrayList<Student>();
      while(bot>0){
         int studentId = in.nextInt();
         String fullName = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(studentId, fullName, cgpa);
         stList.add(st);
         
         bot--;
      }
      Collections.sort(stList,  Comparator.comparing(Student :: getCgpa).reversed().thenComparing(Student :: getFullName).thenComparing(Student :: getStudentId));
         for(Student st: stList){
         System.out.println(st.getFullName());
      }
   }
}