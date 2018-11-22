package com.g3farm.model;
import javax.persistence.*;
@Entity
@Table(name = "Farm_Address")
public class G3FarmAddress
{
	//Column attributes
	@Id 
	@Column(name = "AId")
	private int AId;
	@Column(name = "ALine1")
	private String  ALine1;
	@Column(name = "ALine2")
	private String  ALine2;
	@Column(name = "ACity")
	private String  ACity;
	@Column(name = "AState")
	private String  AState;
	@Column(name = "APincode")
	private String  APincode;
	//Getters and Setters
	public int getAId() 
	{
		return AId;
	}
	public void setAId(int aId) 
	{
		AId = aId;
	}
	public String getALine1() 
	{
		return ALine1;
	}
	public void setALine1(String aLine1) 
	{
		ALine1 = aLine1;
	}
	public String getALine2() 
	{
		return ALine2;
	}
	public void setALine2(String aLine2) 
	{
		ALine2 = aLine2;
	}
	public String getACity()
	{
		return ACity;
	}
	public void setACity(String aCity)
	{
		ACity = aCity;
	}
	public String getAState()
	{
		return AState;
	}
	public void setAState(String aState) 
	{
		AState = aState;
	}
	public String getAPincode() 
	{
		return APincode;
	}
	public void setAPincode(String aPincode)
	{
		APincode = aPincode;
	}




}
