package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post post;

    public Post[] searchPost() {
        int ownerId = post.getOwnerId();
        int date = post.getDate();
        String query = post.getText();
        return null;
    }

    public void deletePost() {
        int ownerId = post.getOwnerId();
        int postId = post.getId();
        System.out.println();
    }
}
