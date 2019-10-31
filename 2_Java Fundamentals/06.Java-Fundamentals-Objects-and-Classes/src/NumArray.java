import java.util.Scanner;

public class NumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        int[] input = new int[inputArr.length];
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(inputArr[i]);
        }

        String line;
        while (!"End".equals(line=scanner.nextLine())){
            String[] tokens = line.split(" ");
            String operations = tokens[0];
            int index = Integer.parseInt(tokens[1]);

            switch (operations){
                case "Switch" :
                    if(index <= input.length-1){
                        input[index] = -(input[index]);
                    }
                    break;
                case "Change" :
                    int value = Integer.parseInt(tokens[2]);
                    if(index <= input.length-1){
                        input[index] = value;
                    }
                    break;
                case "Sum" :
                    break;

            }
        }
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");
        }
    }
}
