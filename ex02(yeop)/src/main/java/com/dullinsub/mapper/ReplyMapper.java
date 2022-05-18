package com.dullinsub.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dullinsub.domain.CriteriaReply;
import com.dullinsub.domain.ReplyVO;

public interface ReplyMapper {

	int insert(ReplyVO vo);

	int insertSelectKey(ReplyVO vo);
	
	ReplyVO read(long rno);

	int delete(Long rno);

	int deleteAll(Long bno);

	int update(ReplyVO replyVO);
	
	List<ReplyVO> getListWithPaging(@Param("bno") Long bno, @Param("cri") CriteriaReply cri);
}
