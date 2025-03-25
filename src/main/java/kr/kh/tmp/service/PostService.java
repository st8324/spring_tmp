package kr.kh.tmp.service;

import java.util.List;

import kr.kh.tmp.model.vo.BoardVO;

public interface PostService {

	boolean insertBoard(String name);

	List<BoardVO> getBoardList();

	boolean updateBoard(BoardVO board);

	boolean deleteBoard(int num);

}
