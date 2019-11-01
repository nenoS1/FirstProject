import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ContactList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String[] input = scanner.nextLine().split(" ");
        List<String> contacts = Arrays.stream(scanner.nextLine().split(" "))
                        .collect(Collectors.toList());

        String line = scanner.nextLine();
        while(!line.contains("Print")){
            String tokens[] =  line.split("\\s+");
            String operations = tokens[0];
            switch (operations) {
                case "Add" :
                    Add(contacts, tokens);
                    break;
                case "Remove" :
                    Remove(contacts, tokens[1]);
                    break;
                case "Export" :
                    Extract(contacts, tokens);
                    break;
            }
            line = scanner.nextLine();
        }

        String tok[] =  line.split("\\s+");
        String operations = tok[0];
        switch (operations) {case "Print" :
            print(contacts, tok[1]);
            break;
        }
    }

    public static void print(List<String> contacts, String token) {
        String printOperations = token;
        if(printOperations.equals("Normal")){
            System.out.print("Contacts: ");
            System.out.println(String.join(" ", contacts));
        } else {
            System.out.print("Contacts: ");
            for (int i = contacts.size()-1; i >= 0; i--) {
                System.out.print(contacts.get(i)+" ");
            }
        }
    }

    public static void Extract(List<String> contacts, String[] tokens) {
        int startIndex = Integer.parseInt(tokens[1]);
        int count = Integer.parseInt(tokens[2]);
        List<String> printContacts = new ArrayList<>();
        if (startIndex + count < contacts.size()){
            for (int i = startIndex; i < startIndex + count; i++) {
                printContacts.add(contacts.get(i));
            }
        } else {
            for (int i = startIndex; i < contacts.size(); i++) {
                printContacts.add(contacts.get(i));
            }
        }
        System.out.println(String.join(" ", printContacts));
    }

    public static void Remove(List<String> contacts, String token) {
        int index = Integer.parseInt(token);
        if(index>=0 && index<contacts.size()){
            contacts.remove(index);
        }
    }

    public static void Add(List<String> contacts, String[] tokens) {
        String contact = tokens[1];
        int index = Integer.parseInt(tokens[2]);
        if (!contacts.contains(contact)){
            contacts.add(contact);
        } else if(index>=0 && index<contacts.size()) {
            contacts.add(index,contact);
        }
    }
}
