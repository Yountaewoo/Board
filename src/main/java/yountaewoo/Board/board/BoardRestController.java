package yountaewoo.Board.board;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardRestController {
    private BoardService boardService;

    public BoardRestController(BoardService boardService) {
        this.boardService = boardService;
    }

    //게시판 생성
    @PostMapping("/boards")
    public void createBoard(@Valid @RequestBody CreateBoardRequest createBoardRequest) {
        boardService.createBoard(createBoardRequest);
    }
}
