package com.cs871.microservices.issues.entities;


import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "issues")
public class IssueReport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String createdBy;
    private Date createdOn;
    private String question;
    private String answer;
    private String remarks;
    //private String email;
    //private String url;
    //private String description;
    //private boolean markedAsPrivate;
    //private boolean updates;
 
    
    public IssueReport() {}
    
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	

	/*
	 * public String getEmail() { return email; }
	 * 
	 * public void setEmail(String email) { this.email = email; }
	 * 
	 * public String getUrl() { return url; }
	 * 
	 * public void setUrl(String url) { this.url = url; }
	 * 
	 * public String getDescription() { return description; }
	 * 
	 * public void setDescription(String description) { this.description =
	 * description; }
	 * 
	 * public boolean isMarkedAsPrivate() { return markedAsPrivate; }
	 * 
	 * public void setMarkedAsPrivate(boolean markedAsPrivate) {
	 * this.markedAsPrivate = markedAsPrivate; }
	 * 
	 * public boolean isUpdates() { return updates; }
	 * 
	 * public void setUpdates(boolean updates) { this.updates = updates; }
	 * 
	 * public boolean isDone() { return done; }
	 * 
	 * public void setDone(boolean done) { this.done = done; }
	 * 
	 * public Date getCreated() { return created; }
	 * 
	 * public void setCreated(Date created) { this.created = created; }
	 * 
	 * public Date getUpdated() { return updated; }
	 * 
	 * public void setUpdated(Date updated) { this.updated = updated; }
	 * 
	 * private boolean done; private Date created; private Date updated;
	 */

    
}
