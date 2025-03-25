package kr.kh.tmp.dao;

import org.apache.ibatis.annotations.Param;

public interface PostDAO {

	boolean insertBoard(@Param("bo_name")String name);

}
