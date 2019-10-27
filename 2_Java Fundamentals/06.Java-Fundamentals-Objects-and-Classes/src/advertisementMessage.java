import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class advertisementMessage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> Messages = Arrays.stream(scanner.nextLine().split(" "))
                        .collect(Collectors.toList());
    }
}
