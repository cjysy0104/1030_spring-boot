package com.kh.demo.board.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.kh.demo.board.model.dao.BoardMapper;
import com.kh.demo.board.model.dto.BoardDTO;
import com.kh.demo.board.model.vo.BoardVO;
import com.kh.demo.file.service.FileService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
	private final BoardMapper boardMapper;
	private final FileService fileService;
	
	@Override
	public void save(BoardDTO board, MultipartFile file, String username) {
		
		// 유효성 검증 valid로 퉁
		// 권한검증 -> ROLE로 함
		
		BoardVO b = null;
		// 첨부파일 관련 값
		if(file != null && !file.isEmpty()) {
			// 이름 바꾸기~
			// 원본파일명에서 확장자 뽑기~
			// 저장위치 정해야함~
			// 파일 올리는 메소드 호출~
			String filePath = fileService.store(file);
			
			 b = BoardVO.builder()
							   .boardTitle(board.getBoardTitle())
							   .boardContent(board.getBoardContent())
							   .boardWriter(username)
							   .fileUrl(filePath)
							   .build();
			// title, content, writer, file INSERT
			
		} else {
			
			 b = BoardVO.builder()
					   .boardTitle(board.getBoardTitle())
					   .boardContent(board.getBoardContent())
					   .boardWriter(username)
					   .build();
		}
		
		boardMapper.save(b);
		
		
		
	}

	@Override
	public List<BoardDTO> findAll(int pageNo) {
		return null;
	}

	@Override
	public BoardDTO findByBoardNo(Long boardNo) {
		return null;
	}

	@Override
	public BoardDTO update(BoardDTO board, MultipartFile file) {
		return null;
	}

	@Override
	public void deleteByBoardNo(Long boardNo) {

	}

	@Override
	public void save(BoardDTO board, MultipartFile file) {
		// TODO Auto-generated method stub
		
	}

}
