import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    static class Scholar{
        String fname;
        String lname;
        Double grade;

        public Scholar(String fname, String lname, Double grade) {
            this.fname = fname;
            this.lname = lname;
            this.grade = grade;
        }

        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getLname() {
            return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        public Double getGrade() {
            return grade;
        }

        public void setGrade(Double grade) {
            this.grade = grade;
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        List<Scholar> scholars = new ArrayList<>();

        while (number-- > 0){
            String[] line = scanner.nextLine().split("\\s+");
            String Fname = line[0];
            String Lname = line[1];
            Double Grade = Double.parseDouble(line[2]);

            Scholar scholar = new Scholar(Fname,Lname,Grade);

            scholars.add(scholar);

        }

        scholars.sort((s, f) -> f.getGrade().compareTo(s.getGrade()));

        for (Scholar scholar : scholars) {
            System.out.printf("%s %s: %.2f%n", scholar.getFname(), scholar.getLname(), scholar.getGrade());
        }

    }
}
