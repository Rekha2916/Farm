package com.g3farm.model;
import javax.persistence.*;
@Entity
@Table(name = "Farm_Land")
public class G3FarmLand 
{
	//Column Attributes
	@Id 
	@Column(name = "LId")
	private int LId;
	@Column(name = "LArea")
	private int  LArea;
	
	//getter and setters
	public int getLId()
	{
		return LId;
	}
	public void setLId(int lId) 
	{
		LId = lId;
	}
	public int getLArea()
	{
		return LArea;
	}
	public void setLArea(int lArea)
	{
		LArea = lArea;
	}

	

}
