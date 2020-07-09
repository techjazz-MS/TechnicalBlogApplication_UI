package technicalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getAllPosts(Model model){

        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setBody("This blog post shows a few different types of content that's supported and styled with Bootstrap. Basic typography, images, and code are all supported.");
        post1.setDate(new Date());
        post1.setAuthor("Mark");

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("Cum sociis natoque penatibus et magnis, nascetur ridiculus mus. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum. Sed posuere consectetur est at lobortis. Cras mattis consectetur purus sit amet fermentum.");
        post2.setDate(new Date());
        post2.setAuthor("Loren");

        Post post3 = new Post();
        post3.setTitle("Post 3");
        post3.setBody("Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros.");
        post3.setDate(new Date());
        post3.setAuthor("Jack");

        Post post4 = new Post();
        post4.setTitle("Post 4");
        post4.setBody("Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aenean lacinia bibendum nulla sed consectetur. Etiam porta sem malesuada magna mollis euismod. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus");
        post4.setDate(new Date());
        post4.setAuthor("Scarlet");

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);

        model.addAttribute("posts", posts);

        return "index";
    }
}
