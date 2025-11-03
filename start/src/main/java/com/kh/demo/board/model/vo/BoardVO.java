package com.kh.demo.board.model.vo;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class BoardVO {

	private Long boardNo;
	private String boardTitle;
	private String boardContent;
	private String boardWriter;
	private String fileUrl;
	private String status;
	private String createDate;
}
