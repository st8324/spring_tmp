package kr.kh.tmp.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kr.kh.tmp.model.vo.BoardVO;
import kr.kh.tmp.model.vo.FileVO;
import kr.kh.tmp.model.vo.LikeVO;
import kr.kh.tmp.model.vo.MemberVO;
import kr.kh.tmp.model.vo.PostVO;
import kr.kh.tmp.pagination.Criteria;
import kr.kh.tmp.pagination.PageMaker;

public interface PostService {

	boolean insertBoard(String name);

	List<BoardVO> getBoardList();

	boolean updateBoard(BoardVO board);

	boolean deleteBoard(int num);

	List<PostVO> getPostList(Criteria cri);

	boolean insertPost(PostVO post, MemberVO user, MultipartFile[] fileList);

	void updateView(int po_num);

	PostVO getPost(int po_num);

	boolean deletePost(int po_num, MemberVO user);

	boolean updatePost(PostVO post, MemberVO user, MultipartFile[] fileList, int[] delNums);

	List<FileVO> getFileList(int po_num);

	PageMaker getPageMaker(Criteria cri);

	int updateLike(LikeVO like, MemberVO user);

}
