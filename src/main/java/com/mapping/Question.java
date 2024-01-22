package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	private String qid;
	private String question;
	@OneToOne
	private Answer aid;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(String qid, String question, Answer aid) {
		super();
		this.qid = qid;
		this.question = question;
		this.aid = aid;
	}

	public String getQid() {
		return qid;
	}

	public void setQid(String qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAid() {
		return aid;
	}

	public void setAid(Answer aid) {
		this.aid = aid;
	}

}
