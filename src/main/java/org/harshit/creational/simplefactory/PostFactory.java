package org.harshit.creational.simplefactory;

public class PostFactory {

    public static Post createPost(String type) throws IllegalAccessException {
        return switch (type) {
            case "blog" -> new BlogPost();
            case "news" -> new NewsPost();
            case "product" -> new ProductPost();
            default -> throw new IllegalAccessException("Post type is not available");
        };
    }

}
