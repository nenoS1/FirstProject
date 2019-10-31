import java.util.Scanner;

public class NumArray {

    static void printSumNeg(int[] IN){
        int sum = 0;
        for (int i = 0; i < IN.length; i++) {
            if (IN[i]<0){
                sum += IN[i];
            }
        }
        System.out.println(sum);
    }

    static void printSumPos(int[] IN){
        int sum = 0;
        for (int i = 0; i < IN.length; i++) {
            if (IN[i]>=0){
                sum += IN[i];
            }
        }
        System.out.println(sum);
    }

    static void printSumAll(int[] IN){
        int sum = 0;
        for (int i = 0; i < IN.length; i++) {
            sum += IN[i];
        }
        System.out.println(sum);
    }
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
            String index1 = tokens[1];

            switch (operations){
                case "Switch" :
                    int index = Integer.parseInt(tokens[1]);
                    if(index>=0 && index <= input.length-1){
                        input[index] = -(input[index]);
                    }
                    break;
                case "Change" :
                    index = Integer.parseInt(tokens[1]);
                    int value = Integer.parseInt(tokens[2]);
                    if(index>=0 && index <= input.length-1){
                        input[index] = value;
                    }
                    break;
                case "Sum" :
                    if (index1.equals("Negative")){
                        printSumNeg(input);
                    } else if (index1.equals("Positive")){
                        printSumPos(input);
                    } else {
                        printSumAll(input);
                    }
                    break;

            }
        }
        for (int i = 0; i < input.length; i++) {
            if(input[i]>=0)
            System.out.print(input[i]+" ");
        }
    }
}
