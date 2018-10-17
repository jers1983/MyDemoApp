package com.mydemoapp.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Vote {

	@EmbeddedId
	private VoteId pk;
	private Boolean voteUp;
	
	public VoteId getPk() {
		return pk;
	}
	public void setPk(VoteId pk) {
		this.pk = pk;
	}
	public Boolean getVoteUp() {
		return voteUp;
	}
	public void setVoteUp(Boolean voteUp) {
		this.voteUp = voteUp;
	}
}