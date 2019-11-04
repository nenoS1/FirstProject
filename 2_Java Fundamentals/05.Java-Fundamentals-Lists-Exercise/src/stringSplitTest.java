import java.util.Scanner;

public class stringSplitTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] name = "Insert  3 0".split("\\d",3);
        System.out.println(name.length); // gives 2
        System.out.println(name[0]);   // gives abcd   -- length=4
        System.out.println(name[1]);   // gives qwer3yuiop  -- length=10
    }
}
