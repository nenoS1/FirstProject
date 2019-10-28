import java.lang.ref.PhantomReference;
import java.util.*;
import java.util.stream.Collectors;

public class advertisementMessage {

    static class AdMessage{
        String Phrases;
        String Events;
        String Authors;
        String Cities;
    }

    static void genMsg(int x){
        String[] Phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] Events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] Authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] Cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        List<AdMessage> msg = new ArrayList<>();

        Random rnd = new Random();

        AdMessage message = new AdMessage();
        message.Phrases = Phrases[rnd.nextInt(Phrases.length)];
        message.Events = Events[rnd.nextInt(Events.length)];
        message.Authors = Authors[rnd.nextInt(Authors.length)];
        message.Cities = Cities[rnd.nextInt(Cities.length)];

        msg.add(message);

        for (AdMessage adMessage : msg) {
            System.out.printf("%s %s %s - %s%n", message.Phrases, message.Events, message.Authors, message.Cities);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMsgs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numMsgs; i++) {
            genMsg(numMsgs);
        }
    }
}
