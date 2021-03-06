package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.ReplyVO;

public interface ReplyMapper {
	
	public int insert(ReplyVO vo);
	public ReplyVO read(Long rno);
	public int delete (Long rno);
	public  int update(ReplyVO reply);
	public List<ReplyVO> getList(Long bno); //@Param("bno") Long bno
	
	
}
