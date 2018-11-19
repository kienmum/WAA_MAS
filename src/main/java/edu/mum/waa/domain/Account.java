package edu.mum.waa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Account {

   @Column(name ="Account")
   private String account;
   
   @Column(name ="Password")
   private String password;
   
   @Column(name ="Status")
   private String status;
   
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
   
	
}
