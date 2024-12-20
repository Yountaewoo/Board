package yountaewoo.Board.board;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BoardService {
    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    //게시판 생성
    public void createBoard(CreateBoardRequest createBoardRequest) {
        Board board = new Board(createBoardRequest.name());
        boardRepository.save(board);
    }

}
