package com.javapoo.program;

import com.javapoo.entities.Comment;
import com.javapoo.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class ProgramComent {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");
        Post post1 = new Post(
                sdf.parse("21/06/2018 15:05:44"),
                "Traveling to New Zeeland",
                "I'm going to visit this wonderful country!",
                12);
        post1.addComment(c1);
        post1.addComment(c2);

        c1 = new Comment("Good night");
        c2 = new Comment("May the force be with you");
        Post post2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);
        post2.addComment(c1);
        post2.addComment(c2);

        System.out.println(post1);
        System.out.println(post2);


    }
}
