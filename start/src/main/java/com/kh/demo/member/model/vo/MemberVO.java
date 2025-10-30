package com.kh.demo.member.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class MemberVO {

	private String memberId;
	private String memberPwd;
	private String memberName;
	private String role;
}
