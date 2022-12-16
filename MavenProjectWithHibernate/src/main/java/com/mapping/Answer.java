package com.mapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@Column(name = "ans_id")
	private int ansId;
	private String answer;
	@OneToOne(mappedBy = "answer")//to ignoring foreign key for answer table using property in onetoone mapping
	
	private Question question;
	

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer() {
		super();
	}

	public Answer(int ansId, String answer) {
		super();
		this.ansId = ansId;
		this.answer = answer;
	}

}
