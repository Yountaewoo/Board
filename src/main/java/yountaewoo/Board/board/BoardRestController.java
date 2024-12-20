package yountaewoo.Board.board;

public class BoardRestController {
    private BoardService boardService;

    public BoardRestController(BoardService boardService) {
        this.boardService = boardService;
    }
}
