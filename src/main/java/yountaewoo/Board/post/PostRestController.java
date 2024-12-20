package yountaewoo.Board.post;

public class PostRestController {
    private PostService postService;

    public PostRestController(PostService postService) {
        this.postService = postService;
    }
}
