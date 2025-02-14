package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.QuestionService;

import jakarta.transaction.Transactional;

@SpringBootTest  // 테스트 용도의 클래스로 사용.
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Autowired // 의존성주입
	private QuestionService questionService;
	
	// 연습용 데이타 작업시 아래 주석처리.
	//@Transactional
	@Test // 테스트 용도의 메서드로 사용
	void testJpa() {
		/*
		Question q1 = new Question();
		q1.setSubject("sbb가 무엇인가요?");
		q1.setContent("sbb에 대해서 알고 싶습니다.");
		q1.setCreateDate(LocalDateTime.now());
		
		questionRepository.save(q1); // 첫번째 질문 저장. insert문
		
		Question q2 = new Question();
		q2.setSubject("스프링부트 모델 질문입니다.");
		q2.setContent("id는 자동으로 생성되나요?");
		q2.setCreateDate(LocalDateTime.now());
		questionRepository.save(q2); // 두번째 질문 저장. insert문
		
		
		 List<Question> all = this.questionRepository.findAll();
		 assertEquals(2, all.size());
		 
		 Question q = all.get(0); // 첫번째 질문 참조
		 assertEquals("sbb가 무엇인가요?", q.getSubject());
		 
		
		 Optional<Question> oq = this.questionRepository.findById(1);
		 if(oq.isPresent()) { // 데이타가 존재하면 true
			 Question q = oq.get();
			 assertEquals("sbb가 무엇인가요?", q.getSubject());
		 }
		 
		
		 Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
		 assertEquals(1, q.getId());
		
		
		Question q = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
		assertEquals(1, q.getId());
		
		
		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
		Question q = qList.get(0);
		assertEquals("sbb가 무엇인가요?", q.getSubject());
		
		
		Optional<Question> oq = this.questionRepository.findById(1);
		assertTrue(oq.isPresent());
		
		Question q = oq.get();
		q.setSubject("수정된 제목");
		
		this.questionRepository.save(q); // update문
		
		
		assertEquals(2, this.questionRepository.count());
		Optional<Question> oq = this.questionRepository.findById(1);
		assertTrue(oq.isPresent()); // oq.isPresent() 위의 1번데이타가 존재하면 true
		Question q = oq.get();
		this.questionRepository.delete(q);
		assertEquals(1, this.questionRepository.count());
		
		
		
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		
		Answer a = new Answer();
		a.setContent("네 자동으로 생성됩니다.");
		a.setQuestion(q);
		a.setCreateDate(LocalDateTime.now());
		this.answerRepository.save(a);
		 
		
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		
		
		List<Answer> answerList = q.getAnswerList();
		
		assertEquals(1, answerList.size());
		assertEquals("네 자동으로 생성됩니다." , answerList.get(0).getContent());
		
		
		
		for(int i=1; i<=300; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]", i);
			String content = "내용무";
			this.questionService.create(subject, content, null);
		}
		
		*/
		
		
		
		
		
		
		
		
	}

}
