package com.example.demo.beans;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SPRING_STUDENT_TB")
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STU_SEQ")
@SequenceGenerator(sequenceName="SPRING_SEQUENCE",allocationSize=1,name="STU_SEQ")
	public int id;
	private String name;
	private String pass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
