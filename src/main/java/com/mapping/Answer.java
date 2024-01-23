package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {

	@Id
	private String ansid;
	private String ans;

	@ManyToOne
	private Question qid;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(String ansid, String ans, Question qid) {
		super();
		this.ansid = ansid;
		this.ans = ans;
		this.qid = qid;
	}

	public String getAnsid() {
		return ansid;
	}

	public void setAnsid(String ansid) {
		this.ansid = ansid;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Question getQid() {
		return qid;
	}

	public void setQid(Question qid) {
		this.qid = qid;
	}

}
