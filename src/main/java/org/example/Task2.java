package org.example;

import java.io.FileWriter;
import java.io.IOException;

import static org.example.CommentsApp.getCommentsToLastPost;

public class Task2 {
    public static void main(String[] args) {
        int userId = 2;

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("user-" + userId + "-post-" + CommentsApp.postIdMax(userId) + "-comments.json");
            fileWriter.write(getCommentsToLastPost(userId).toString());
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
