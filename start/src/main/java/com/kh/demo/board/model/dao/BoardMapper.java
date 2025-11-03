package com.kh.demo.board.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.multipart.MultipartFile;

import com.kh.demo.board.model.dto.BoardDTO;
import com.kh.demo.board.model.vo.BoardVO;

@Mapper
public interface BoardMapper {
	
	List<BoardDTO> findAll(int pageNo);
	
	BoardDTO findByBoardNo(Long boardNo);
	
	BoardDTO update(BoardDTO board, MultipartFile file);
	
	void deleteByBoardNo(Long boardNo);

	void save(BoardVO board);

}
