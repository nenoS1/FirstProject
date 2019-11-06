import java.lang.reflect.Array;
import java.util.*;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> counts = new LinkedHashMap<>();
        List<String> evenRes = new ArrayList<>();
        List<Integer> oddQty = new ArrayList<>();

        int linenumber = 0;
        String line;
        while (!"stop".equals(line = scanner.nextLine())) {
            //String[] input = Arrays.stream(line.split(" ")).toArray(String[]::new);

            if (linenumber % 2 == 0) {
                evenRes.add(line);
                } else {
                oddQty.add(Integer.parseInt(line));
            }
                linenumber = linenumber + 1;
        }

        for (int i = 0; i < evenRes.size(); i++) {
            counts.put(evenRes.get(i),oddQty.get(i));
        }
            for (Map.Entry<String, Integer> stringIntegerEntry : counts.entrySet()) {
                System.out.printf("%s -> %d%n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());


            }
        }
    }
