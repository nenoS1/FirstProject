import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2 {


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
        int numOperations = Integer.parseInt(scanner.nextLine());

        List<Articles> articles = new ArrayList<>();

        while(numOperations-- > 0){
            String[] tokens = scanner.nextLine().split(", ");
            String title = tokens[0];
            String content = tokens[1];
            String author = tokens[2];

            Articles article = new Articles(title, content, author);

            articles.add(article);

        }

        //"title", "content", "author".
        String criteria = scanner.nextLine();
        if(criteria.equals("title")){
            articles.sort((f, s) -> f.getTitle().compareTo(s.getTitle()));
        } else if(criteria.equals("content")){
            articles.sort((f, s) -> f.getContent().compareTo(s.getContent()));
        } else if(criteria.equals("author")){
            articles.sort((f, s) -> f.getAuthor().compareTo(s.getAuthor()));
        }

        for (Articles article : articles) {
            System.out.println(article.toString());
        }
    }
}
