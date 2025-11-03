package com.kh.demo.auth.model.service;

import java.util.Map;

import com.kh.demo.member.model.dto.MemberDTO;

public interface AuthService {

	Map<String, String> login(MemberDTO member);
}
