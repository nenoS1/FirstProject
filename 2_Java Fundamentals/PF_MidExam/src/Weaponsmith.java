import java.util.Scanner;

public class Weaponsmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");

        String line;
        while (!"Done".equals(line = scanner.nextLine())) {
            String tokens[] = line.split("\\s+");
            String command = tokens[0];
            String operations = tokens[1];

            //ha|Do|mm|om|er
            //to do index check
            if (command.equals("Move") && operations.equals("Left")) {
                int index = Integer.parseInt(tokens[2]);
                moveLeft(input, index);
            } else if (command.equals("Move") && operations.equals("Right")) {
                int index = Integer.parseInt(tokens[2]);
                moveRight(input, index);
            } else if (command.equals("Check") && operations.equals("Even")) {
                for (int i = 0; i <= input.length-1; i=i+2) {
                    System.out.print(input[i]+" ");
                }
            } else if (command.equals("Check") && operations.equals("Odd")) {
                for (int i = 1; i <= input.length-1; i=i+2) {
                    System.out.print(input[i]+" ");
                }
            }
        }

        String joined = String.join("", input);
        System.out.printf("%nYou crafted %s!", joined);
        //System.out.println(String.join(" ", input));
    }

    public static void moveRight(String[] input, int index) {
        if (index >= 0 && index < input.length-1){
        String current = input[index + 1];
        input[index + 1] = input[index];
        input[index] = current;
        }
    }


    public static void moveLeft(String[] input, int index) {
        if (index > 0 && index <= input.length-1) {
            String current = input[index - 1];
            input[index - 1] = input[index];
            input[index] = current;
        }
    }
}
