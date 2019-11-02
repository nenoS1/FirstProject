import java.util.Scanner;

public class BiscuitsFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountBicuits = Integer.parseInt(scanner.nextLine());
        int countOfWorkers = Integer.parseInt(scanner.nextLine());
        int compAmountOfBiscuits = Integer.parseInt(scanner.nextLine());

        double prodDay;

        double thirdDayBiscuit = 10*(Math.floor(((amountBicuits * countOfWorkers) * 3 / 4)));
        int prodCountOfBiscuits = (20 * amountBicuits * countOfWorkers) + (int)thirdDayBiscuit;

        double delta;
        double percentage;


        System.out.printf("You have produced %d biscuits for the past month.%n", prodCountOfBiscuits);

        if (prodCountOfBiscuits > compAmountOfBiscuits) {
            delta = prodCountOfBiscuits - compAmountOfBiscuits;
            percentage = delta/compAmountOfBiscuits*100;
            System.out.printf("You produce %.2f percent more biscuits.", percentage);
        } else if (compAmountOfBiscuits>prodCountOfBiscuits){
            delta = compAmountOfBiscuits - prodCountOfBiscuits;
            percentage = delta/compAmountOfBiscuits*100;
            System.out.printf("You produce %.2f percent less biscuits.", percentage);
        }


    }
}
