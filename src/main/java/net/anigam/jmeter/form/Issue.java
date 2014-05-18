package net.anigam.jmeter.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table(name="ISSUE")
public class Issue {

	@Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;
     
    @Column(name="NM")
    private String name;
 
    @Column(name="NUM")
    private String number;
 
    @Column(name="DESCRIPTION")
    private String description;
     
    @Column(name="COMMENTS")
    private String comments;
    
    @Column(name="DDLS")
    private String ddlChanges;
    
    @Column(name="DMLS")
    private String dmlChanges;

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
		return ddlChanges;
	}

	public void setDdlChanges(String ddlChanges) {
		this.ddlChanges = ddlChanges;
	}

	public String getDmlChanges() {
		return dmlChanges;
	}

	public void setDmlChanges(String dmlChanges) {
		this.dmlChanges = dmlChanges;
	}
    
    
    
}
