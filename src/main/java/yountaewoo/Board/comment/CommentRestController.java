package yountaewoo.Board.comment;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentRestController {
    private CommentService commentService;

    public CommentRestController(CommentService commentService) {
        this.commentService = commentService;
    }

    //댓글 생성
    @PostMapping("/comments")
    public void createComment(@Valid @RequestBody CreateCommentRequest createCommentRequest) {
        commentService.creatComment(createCommentRequest);
    }
}
