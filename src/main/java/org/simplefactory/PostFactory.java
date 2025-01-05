package  org.simplefactory;

/**
 * This class acts as a simple factory for creation of 
 * different posts on website.
 * 1. simply encapsulates the object creation logic
 * 2. Typically, as a separate class with a static method which accepts an arg to decide which class to instantiate
 * 3. Factory method is different from simple factory as it mostly delegates the object creation logic to subclasses
 * 4. simple factory knows all classes whose objects it can create but factory method doesn't know in Advance.
 *
 */
public class PostFactory {

    public static Post createPost(String type) {
        return switch (type) {
            case "blog" -> new BlogPost();
            case "news" -> new NewsPost();
            case "product" -> new ProductPost();
            default -> throw new IllegalArgumentException("Type is Unknown");
        };
    }
}
