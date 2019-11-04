import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listOperations {

    static void ShiftLeft(List<Integer> l,int count){
        for (int shiftStep=0;shiftStep<count;shiftStep++){
            int temp=l.get(0);
            for (int i=0;i<l.size()-1;i++){
                l.set(i,l.get(i+1));
            }
            l.set(l.size()-1,temp);
        }
    }

    static void  ShiftRight(List<Integer> l,int count){

        for (int shiftStep=0;shiftStep<count;shiftStep++){
            int temp=l.get(l.size()-1);
            for (int i=l.size()-1;i>0;i--){
                l.set(i,l.get(i-1));
            }
            l.set(0,temp);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();

        List<String> items = Arrays.stream(numbers.split("\\s+")).collect(Collectors.toList());
        List<Integer> Numbers = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            Numbers.add(Integer.parseInt(items.get(i)));
        }

        String line;
        while (!"End".equals(line=scanner.nextLine())){
            String tokens[] = line.split("\\s+");
            String operations = tokens[0];

            switch (operations){
                case "Add" :
                    Numbers.add(Integer.parseInt(tokens[1]));
                    break;
                case "Remove" :
                    int index = Integer.parseInt(tokens[1]);
                    if (index>=0 && index<Numbers.size()){
                        Numbers.remove(index);
                    }
                    else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Insert" :
                    int indexNum = Integer.parseInt(tokens[2]);
                    if(indexNum>=0 && indexNum<Numbers.size()){
                        int num = Integer.parseInt(tokens[1]);
                        Numbers.add(indexNum, num);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift" :
                    String directions = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    if(directions.equals("left")){
                        ShiftLeft(Numbers, count);
                    } else {
                        ShiftRight(Numbers, count);
                    }
                    break;
            }
        }
        for (int i = 0; i < Numbers.size(); i++) {
            System.out.print(Numbers.get(i)+" ");
        }
    }
}
