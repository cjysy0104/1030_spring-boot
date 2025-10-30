package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	/*
	 * Spring MVC에서 빈으로 등록할 때: 
	 * 
	 * root-context.xml 가서
	 * 
	 * <bean class="풀클래스명" id="식별자">
	 * 		<property 필드값/>
	 * </bean>
	 * ===================================
	 * 
	 * @Configuration 
	 * 
	 * 스프링에서 설정클래스를 정의할 때 사용
	 * 
	 * 하나 이상의 @bean이 달린 메서드를 포함해야 스프링컨테이너에 빈으로 등록함
	 * 
	 * @Configuration클래스 내에 메서드로 달려서 스프링 빈을 생성함
	 * 
	 * XML로 설정하는 것보다 빠른 시점에 오류를 발생할 수 있고,
	 * 코드기반이기 빼문에 자동완성, 수정이용에 용이하고
	 * 설정 내 
	 */
	
	@Bean
	public StudyBean study() {
		return new StudyBean();
	}
}
