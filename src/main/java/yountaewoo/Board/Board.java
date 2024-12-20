package yountaewoo.Board;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;
import java.util.Objects;

@Entity
public class Board {
    private String name;
    private List<Post> posts;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    protected Board() {

    }

    public Board(Long id, String name, List<Post> posts) {
        this.id = id;
        this.name = name;
        this.posts = posts;
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


