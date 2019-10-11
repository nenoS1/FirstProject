public class arrayRotation {
    public static void main(String[] args) {
        int[] numbers = {12, 14, 16, 20};

        for (int i = 0; i < numbers.length/2 ; i++) {
            int oppositeindex = numbers.length - 1 - i;
            int oldnumbersI = numbers[i];
            numbers[i] = numbers[oppositeindex];
            numbers[oppositeindex] = oldnumbersI;
        }

        Print(numbers);
    }

    private static void Print(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
