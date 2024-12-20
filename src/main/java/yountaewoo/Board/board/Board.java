package yountaewoo.Board.board;

import jakarta.persistence.*;
import yountaewoo.Board.post.Post;

import java.util.List;
import java.util.Objects;

@Entity
public class Board {
    private String name;

    @OneToMany(mappedBy = "board")
    private List<Post> posts;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    protected Board() {

    }

    public Board(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Post> getPosts() {
        return posts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Objects.equals(name, board.name) && Objects.equals(posts, board.posts) && Objects.equals(id, board.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, posts, id);
    }
}


