package com.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	private String qid;
	private String question;
//	@OneToOne
//	private Answer aid;
	@OneToMany(mappedBy = "qid")
	private List<Answer> aid;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(String qid, String question, List<Answer> aid) {
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

	public List<Answer> getAid() {
		return aid;
	}

	public void setAid(List<Answer> aid) {
		this.aid = aid;
	}

}
