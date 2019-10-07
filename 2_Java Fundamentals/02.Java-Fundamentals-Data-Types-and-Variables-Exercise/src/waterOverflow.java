import java.util.Scanner;

public class waterOverflow {
    public static void main(String[] args) {
        int capacity = 255;
        int flow = 0;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int litres = scanner.nextInt();
            if (capacity>=flow+litres) {
                flow = flow+litres;
            }
                else{
                    System.out.println("Insufficient capacity!");
                }

               }
        System.out.println(flow);
            }
        }
