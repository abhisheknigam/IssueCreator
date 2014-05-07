package net.anigam.jmeter.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ISSUE")
public class Issue {

	@Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;
     
    @Column(name="NAME")
    private String name;
 
    @Column(name="NUMBER")
    private String number;
 
    @Column(name="DESCRIPTION")
    private String description;
     
    @Column(name="COMMENTS")
    private String comments;
    
    @Column(name="DDL")
    private String DdlChanges;
    
    @Column(name="DML")
    private String DmlChanges;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getDdlChanges() {
		return DdlChanges;
	}

	public void setDdlChanges(String ddlChanges) {
		DdlChanges = ddlChanges;
	}

	public String getDmlChanges() {
		return DmlChanges;
	}

	public void setDmlChanges(String dmlChanges) {
		DmlChanges = dmlChanges;
	}
    
    
    
}
