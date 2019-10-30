import java.util.Scanner;

public class DistanceCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        double stepsLength = Double.parseDouble(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());

        double percentage = ((steps/5)*(stepsLength*70/100)+((steps-(steps/5))*stepsLength))/distance*100/100;

        System.out.printf("You travelled %.2f%% of the distance!", percentage);
    }
}
