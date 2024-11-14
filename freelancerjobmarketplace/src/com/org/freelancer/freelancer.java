package com.org.freelancer;

public class freelancer {
	private int freelancer_id;
    private String freelance_firstname;
    private String freelancer_lastname;
    private String freelancer_email;
    private String freelancer_phonenumber;
    private String freelancer_skils;
	public freelancer(int freelancer_id, String freelance_firstname, String freelancer_lastname,
			String freelancer_email, String freelancer_phonenumber, String freelancer_skils) {
		super();
		this.freelancer_id = freelancer_id;
		this.freelance_firstname = freelance_firstname;
		this.freelancer_lastname = freelancer_lastname;
		this.freelancer_email = freelancer_email;
		this.freelancer_phonenumber = freelancer_phonenumber;
		this.freelancer_skils = freelancer_skils;
	}
	public int getFreelancer_id() {
		return freelancer_id;
	}
	public void setFreelancer_id(int freelancer_id) {
		this.freelancer_id = freelancer_id;
	}
	public String getFreelance_firstname() {
		return freelance_firstname;
	}
	public void setFreelance_firstname(String freelance_firstname) {
		this.freelance_firstname = freelance_firstname;
	}
	public String getFreelancer_lastname() {
		return freelancer_lastname;
	}
	public void setFreelancer_lastname(String freelancer_lastname) {
		this.freelancer_lastname = freelancer_lastname;
	}
	public String getFreelancer_email() {
		return freelancer_email;
	}
	public void setFreelancer_email(String freelancer_email) {
		this.freelancer_email = freelancer_email;
	}
	public String getFreelancer_phonenumber() {
		return freelancer_phonenumber;
	}
	public void setFreelancer_phonenumber(String freelancer_phonenumber) {
		this.freelancer_phonenumber = freelancer_phonenumber;
	}
	public String getFreelancer_skils() {
		return freelancer_skils;
	}
	public void setFreelancer_skils(String freelancer_skils) {
		this.freelancer_skils = freelancer_skils;
	}
	@Override
	public String toString() {
		return "freelancer [freelancer_id=" + freelancer_id + ", freelance_firstname=" + freelance_firstname
				+ ", freelancer_lastname=" + freelancer_lastname + ", freelancer_email=" + freelancer_email
				+ ", freelancer_phonenumber=" + freelancer_phonenumber + ", freelancer_skils=" + freelancer_skils + "]";
	}
    
    
}
