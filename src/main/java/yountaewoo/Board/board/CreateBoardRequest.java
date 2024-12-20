package yountaewoo.Board.board;

import jakarta.validation.constraints.Size;
import yountaewoo.Board.post.Post;

import java.util.List;

public record CreateBoardRequest(
        @Size(min = 1, max = 20) String name,
        List<Post> posts
) {
}
