package yountaewoo.Board.post;

import jakarta.persistence.*;
import yountaewoo.Board.comment.Comment;
import yountaewoo.Board.board.Board;

import java.util.List;
import java.util.Objects;

@Entity
public class Post {
    private String title;

    private String content;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments;

    @ManyToOne
    private Board board;

    private int viewCount;

    private int recommendationCount;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    protected Post() {

    }

    public Post(Board board, List<Comment> comments, String content, Long id, int recommendationCount, String title, int viewCount) {
        this.board = board;
        this.comments = comments;
        this.content = content;
        this.id = id;
        this.recommendationCount = recommendationCount;
        this.title = title;
        this.viewCount = viewCount;
    }

    public Board getBoard() {
        return board;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public String getContent() {
        return content;
    }

    public int getRecommendationCount() {
        return recommendationCount;
    }

    public int getViewCount() {
        return viewCount;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return viewCount == post.viewCount && recommendationCount == post.recommendationCount && Objects.equals(title, post.title) && Objects.equals(content, post.content) && Objects.equals(comments, post.comments) && Objects.equals(board, post.board) && Objects.equals(id, post.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, comments, board, viewCount, recommendationCount, id);
    }
}



