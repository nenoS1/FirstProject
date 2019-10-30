import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Article {


    static class Articles{
        String Title;
        String Content;
        String Author;

        public Articles(String Title, String Content, String Author) {
            this.Title = Title;
            this.Content = Content;
            this.Author = Author;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public String getContent() {
            return Content;
        }

        public void setContent(String content) {
            Content = content;
        }

        public String getAuthor() {
            return Author;
        }

        public void setAuthor(String author) {
            Author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.Title, this.Content, this.Author);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int numOperations = Integer.parseInt(scanner.nextLine());

        Articles article = new Articles(input[0],input[1], input[2]);
        List<Articles> art = new ArrayList<>();
        art.add(article);

        while(numOperations-- > 0){
            String[] tokens = scanner.nextLine().split(": ");
            String command = tokens[0];
            String param = tokens[1];

            switch (command){
                case "Edit" : article.setContent(param);
                    break;
                case "ChangeAuthor": article.setAuthor(param);
                    break;
                case "Rename": article.setTitle(param);
                    break;
            }
        }

        System.out.println(article);

    }
}
