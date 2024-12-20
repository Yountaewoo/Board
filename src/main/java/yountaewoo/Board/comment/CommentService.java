package yountaewoo.Board.comment;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CommentService {
    private CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void creatComment(CreateCommentRequest createCommentRequest) {
        Comment comment = new Comment(createCommentRequest.content(), createCommentRequest.post());
        commentRepository.save(comment);
    }
}
