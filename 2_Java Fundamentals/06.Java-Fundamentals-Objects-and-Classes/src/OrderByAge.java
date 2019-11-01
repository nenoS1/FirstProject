import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {

   public static class Student{
        String name;
        String ID;
        int age;

       public Student(String name, String ID, int age) {
           this.name = name;
           this.ID = ID;
           this.age = age;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public String getID() {
           return ID;
       }

       public void setID(String ID) {
           this.ID = ID;
       }

       public int getAge() {
           return age;
       }

       public void setAge(int age) {
           this.age = age;
       }
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Student> student = new ArrayList<>();
        String line;
        while (!"End".equals(line = scanner.nextLine())){
            String tokens[] = line.split("\\s+");
            String Name = tokens[0];
            String id = tokens[1];
            int Age = Integer.parseInt(tokens[2]);
            Student students = new Student(Name, id, Age);
            student.add(students);
        }

        student.sort((f, s) -> f.getAge()-(s.getAge()));
        for (Student student1 : student) {
            System.out.printf("%s with ID: %s is %d years old.%n", student1.getName(), student1.getID(), student1.getAge());
        }
    }
}
