
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    static class Person implements Comparable<Person> {
        String Name;
        int age;


        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(Person p) {
            return this.getName().compareTo(p.getName());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        List<Person> listP = new ArrayList<>();

        while (n-->0){
            String[] input = scanner.nextLine().split(" ");

            String x = input[0];
            int y = Integer.parseInt(input[1]);

            Person person = new Person();
            person.setName(x);
            person.setAge(y);

            if(person.age>30) {
                listP.add(person);
            }
        }

        Collections.sort(listP);
        listP.forEach(p -> System.out.printf("%s - %d%n", p.Name, p.age));


        }
        }