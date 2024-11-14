package com.org.freelancer;


public class clients {
	private int client_id;
    private String client_firstname;
    private String client_lastname;
    private String client_email;
    private String  client_phonenumber;
    private String client_address;
    
    
	public clients(int client_id, String client_firstname, String client_lastname, String client_email,
			String client_phonenumber, String client_address) {
		super();
		this.client_id = client_id;
		this.client_firstname = client_firstname;
		this.client_lastname = client_lastname;
		this.client_email = client_email;
		this.client_phonenumber = client_phonenumber;
		this.client_address = client_address;
	}


	public  int getClient_id() {
		return client_id;
	}


	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}


	public String getClient_firstname() {
		return client_firstname;
	}


	public void setClient_firstname(String client_firstname) {
		this.client_firstname = client_firstname;
	}


	public String getClient_lastname() {
		return client_lastname;
	}


	public void setClient_lastname(String client_lastname) {
		this.client_lastname = client_lastname;
	}


	public String getClient_email() {
		return client_email;
	}


	public void setClient_email(String client_email) {
		this.client_email = client_email;
	}


	public String getClient_phonenumber() {
		return client_phonenumber;
	}


	public void setClient_phonenumber(String client_phonenumber) {
		this.client_phonenumber = client_phonenumber;
	}


	public String getClient_address() {
		return client_address;
	}


	public void setClient_address(String client_address) {
		this.client_address = client_address;
	}


	@Override
	public String toString() {
		return "clients [client_id=" + client_id + ", client_firstname=" + client_firstname + ", client_lastname="
				+ client_lastname + ", client_email=" + client_email + ", client_phonenumber=" + client_phonenumber
				+ ", client_address=" + client_address + "]";
	}
	
	
}

