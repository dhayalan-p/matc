package com.example.demo.Modelwithmongodp;



import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {
	
	@Id
	private Long madtharId;
	private String mname;	
	private String maddress;
	private String mdistrict;
	private int mpincode;
	public Long getMadtharId() {
		return madtharId;
	}
	public void setMadtharId(Long madtharId) {
		this.madtharId = madtharId;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMaddress() {
		return maddress;
	}
	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}
	public String getMdistrict() {
		return mdistrict;
	}
	public void setMdistrict(String mdistrict) {
		this.mdistrict = mdistrict;
	}
	public int getMpincode() {
		return mpincode;
	}
	public void setMpincode(int mpincode) {
		this.mpincode = mpincode;
	}
	public Address(Long madtharId, String mname, String maddress, String mdistrict, int mpincode) {
		super();
		this.madtharId = madtharId;
		this.mname = mname;
		this.maddress = maddress;
		this.mdistrict = mdistrict;
		this.mpincode = mpincode;
	}
	
	public Address() {}
	

}
