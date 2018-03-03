package com.java.votingpolls.domain;

import java.util.ArrayList;
import java.util.Date;

public class Poll {

		public String id;
		public String pollName;
		public Date dateCreated;
		public String description;
		public User pollOwner;
		public ArrayList<User> voters = new ArrayList<User>();
		public int totalVotes;
	
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPollName() {
			return pollName;
		}
		public void setPollName(String pollName) {
			this.pollName = pollName;
		}
		public Date getDateCreated() {
			return dateCreated;
		}
		public void setDateCreated(Date dateCreated) {
			this.dateCreated = dateCreated;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public User getPollOwner() {
			return pollOwner;
		}
		public void setPollOwner(User pollOwner) {
			this.pollOwner = pollOwner;
		}
		public ArrayList<User> getVoters() {
			return voters;
		}
		public void setVoters(User voters) {
			this.voters.add(voters);
		}
		public int getTotalVotes() {
			return totalVotes;
		}
		public void setTotalVotes(int totalVotes) {
			this.totalVotes = totalVotes;
		}
		
}
