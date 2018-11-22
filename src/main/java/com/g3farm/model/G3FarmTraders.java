package com.g3farm.model;
import javax.persistence.*;
@Entity
@Table(name = "Farm_Traders")
public class G3FarmTraders
{
	//column attributes
	@Id 
	@Column(name = "TId")
	private int TId;
	@Column(name = "TName")
	private String  TName;
	@Column(name = "TContact", length = 10)
	private int TContact;
	//getters and setters
	public int getTId() 
	{
		return TId;
	}
	public void setTId(int tId) 
	{
		TId = tId;
	}
	public String getTName() 
	{
		return TName;
	}
	public void setTName(String tName) 
	{
		TName = tName;
	}
	public int getTContact() 
	{
		return TContact;
	}
	public void setTContact(int tContact)
	{
		TContact = tContact;
	}
	

}

