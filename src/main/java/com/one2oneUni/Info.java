package com.one2oneUni;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long info_id;
   
    @Column(unique = true)
    private long rollNo;

	public long getInfo_id() {
		return info_id;
	}

	public void setInfo_id(long info_id) {
		this.info_id = info_id;
	}

	public long getRollNo() {
		return rollNo;
	}

	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}

    
    
    
    
}

