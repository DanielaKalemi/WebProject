package com.javapage.model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="user")
public class User implements Serializable{

	 @Id @GeneratedValue
	    private int iduser;
	    private String first_name;
	    private String last_name;
	    private String email;
	    private String username;
	    private String password;
	 
	    public User() {
	    }
	 
	     
	    public User(String first_name, String last_name, String email, String username, String password) {
	        this.first_name = first_name;
	        this.last_name = last_name;
	        this.email = email;
	        this.username = username;
	        this.password = password;
	    }
	 
	 
	    public int getIduser() {
	        return iduser;
	    }
	 
	     public void setIduser(int iduser) {
	        this.iduser = iduser;
	    }
	 
	    public String getFirstName() {
	        return first_name;
	    }
	 
	    public void setFirstName(String first_name) {
	        this.first_name = first_name;
	    }
	 
	 
	    public String getLastName() {
	        return last_name;
	    }
	 
	    public void setLastName(String last_name) {
	        this.last_name = last_name;
	    }
	 
	    public String getEmail() {
	        return email;
	    }
	 
	    public void setEmail(String email) {
	        this.email = email;
	    }
	 
	    public String getUserName() {
	        return username;
	    }
	 
	    public void setUserName(String username) {
	        this.username = username;
	    }
	 
	    public String getPassword() {
	        return password;
	    }
	 
	    public void setPassword(String password) {
	        this.password = password;
	    }       
}
