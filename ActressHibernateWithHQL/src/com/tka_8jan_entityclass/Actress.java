package com.tka_8jan_entityclass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Actress {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Aid;
	private String Aname;
	private int Aage;
	private String ADomain;
	public Actress() {
		
	}
	public Actress(int aid, String aname, int aage, String aDomain) {
		super();
		Aid = aid;
		Aname = aname;
		Aage = aage;
		ADomain = aDomain;
	}
	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	public int getAage() {
		return Aage;
	}
	public void setAage(int aage) {
		Aage = aage;
	}
	public String getADomain() {
		return ADomain;
	}
	public void setADomain(String aDomain) {
		ADomain = aDomain;
	}
	@Override
	public String toString() {
		return "Actress [Aid=" + Aid + ", Aname=" + Aname + ", Aage=" + Aage + ", ADomain=" + ADomain + "]";
	}	

}
