package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.List;

public class CommentsApp {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    private static final Gson gson = new Gson();
    private static final OkHttpClient post = new OkHttpClient();
    private static final OkHttpClient comments = new OkHttpClient();

    public static String getLastPost(int userId) {
        try {
            Request request = new Request.Builder()
                    .url(BASE_URL + "/users/" + userId + "/posts")
                    .get()
                    .build();

            Response response = post.newCall(request).execute();
            if (response.isSuccessful()) {
                String responseBody = response.body().string();
                List<PostEntity> posts = gson.fromJson(responseBody, new TypeToken<List<PostEntity>>() {
                }.getType());
                String result = "";
                if (!posts.isEmpty()) {
                    result = String.valueOf(posts.get(posts.size() - 1));
                    return result;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "null";
    }

    public static int postIdMax(int userId) {
        String[] parts = getLastPost(userId).split(",");
        int postId = 0;
        for (String part : parts) {
            if (part.contains("id=")) {
                String[] idParts = part.split("=");
                postId = Integer.parseInt(idParts[1]);
                break;
            }
        }
        return postId;
    }

    public static List<CommentsEntity> getCommentsToLastPost(int userId) {
        try {
            Request request = new Request.Builder()
                    .url(BASE_URL + "/posts/" + postIdMax(userId) + "/comments")
                    .get()
                    .build();

            Response response1 = comments.newCall(request).execute();
            System.out.println("response.code() = " + response1.code());
            if (response1.isSuccessful()) {
                String responseBody1 = response1.body().string();
                return gson.fromJson(responseBody1, new TypeToken<List<CommentsEntity>>() {
                }.getType());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}