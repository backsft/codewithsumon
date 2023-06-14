package com.one2oneUni;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long st_id;

    private String st_name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rollNo", referencedColumnName = "rollNo")
    
    private Info info;

	public long getSt_id() {
		return st_id;
	}

	public void setSt_id(long st_id) {
		this.st_id = st_id;
	}

	public String getSt_name() {
		return st_name;
	}

	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

    
    
    
}
