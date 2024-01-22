package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {

	@Id
	private String ansid;
	private String ans;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(String ansid, String ans) {
		super();
		this.ansid = ansid;
		this.ans = ans;
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

}
