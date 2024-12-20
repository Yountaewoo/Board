package yountaewoo.Board.comment;

import jakarta.validation.constraints.Size;
import yountaewoo.Board.post.Post;

public record CreateCommentRequest(
        @Size(min = 1, max = 20) String content,
        Post post
) {
}
