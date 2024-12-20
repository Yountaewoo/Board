package yountaewoo.Board;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Post {
    private String title;

    private String content;

    @OneToMany
    private List<Comment> comments;

    @ManyToOne
    private Board board;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    protected Post() {

    }

    public Post(Board board, List<Comment> comments, String content, Long id, String title) {
        this.board = board;
        this.comments = comments;
        this.content = content;
        this.id = id;
        this.title = title;
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
        return Objects.equals(title, post.title) && Objects.equals(content, post.content) && Objects.equals(comments, post.comments) && Objects.equals(board, post.board) && Objects.equals(id, post.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, comments, board, id);
    }
}



