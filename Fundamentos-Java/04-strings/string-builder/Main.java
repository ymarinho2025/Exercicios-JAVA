import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Tenha uma boa viagem!");
        Comment c2 = new Comment("Wow isso é incrível!");

        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:33"),
                "Viajando para Nova Zelandia",
                "Eu estou indo visitar este maravilhoso país!",
                12
        );

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}