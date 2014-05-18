package net.anigam.jmeter.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Register")
public class Register {

	@Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;
	
	@Column(name="NM")
	String name;
	
	@Column(name="UNM")
	String username;
	
	@Column(name="PASSWORD")
	String password;
	
	@Column(name="EMAIL")
	String email;
	
	@Column(name="PHNO")
	String phoneNumber;
}
