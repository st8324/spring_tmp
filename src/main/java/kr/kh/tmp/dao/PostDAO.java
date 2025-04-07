package kr.kh.tmp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.kh.tmp.model.vo.BoardVO;
import kr.kh.tmp.model.vo.FileVO;
import kr.kh.tmp.model.vo.LikeVO;
import kr.kh.tmp.model.vo.PostVO;
import kr.kh.tmp.pagination.Criteria;

public interface PostDAO {

	boolean insertBoard(@Param("bo_name")String name);

	List<BoardVO> selectBoardList();

	boolean updateBoard(@Param("board")BoardVO board);

	boolean deleteBoard(@Param("bo_num")int num);

	List<PostVO> selectPostList(@Param("cri")Criteria cri);

	boolean insertPost(@Param("post")PostVO post);

	void updateView(@Param("po_num")int po_num);

	PostVO selectPost(@Param("po_num")int po_num);

	boolean deletePost(@Param("po_num")int po_num);

	boolean updatePost(@Param("post")PostVO post);

	void insertFile(@Param("file")FileVO file);

	void deleteFile(@Param("fi_num")int fi_num);

	List<FileVO> selectFileList(@Param("fi_po_num")int po_num);

	FileVO selectFile(@Param("fi_num")int fi_num);

	int selectCountPostList(@Param("cri")Criteria cri);

	LikeVO selectLike(@Param("li_po_num")int li_po_num, @Param("li_me_id")String li_me_id);

	void insertLike(@Param("li_po_num")int li_po_num, @Param("li_me_id")String li_me_id, @Param("li_state")int li_state);

}
