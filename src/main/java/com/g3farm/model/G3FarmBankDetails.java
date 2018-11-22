package com.g3farm.model;
import javax.persistence.*;
@Entity
@Table(name = "Farm_BankDetails")
public class G3FarmBankDetails 
{
    //Column attributes	
	@Id 
	@Column(name = "BDAccountNo")
	private String BDAccountNo;
	@Column(name = "BDIFSCCode")
	private String  BDIFSCCode;
	//getters and setters
	public String getBDAccountNo() 
	{
		return BDAccountNo;
	}
	public void setBDAccountNo(String bDAccountNo) 
	{
		BDAccountNo = bDAccountNo;
	}
	public String getBDIFSCCode() 
	{
		return BDIFSCCode;
	}
	public void setBDIFSCCode(String bDIFSCCode)
	{
		BDIFSCCode = bDIFSCCode;
	}

	
}
