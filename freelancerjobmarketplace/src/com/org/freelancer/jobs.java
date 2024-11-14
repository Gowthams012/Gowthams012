package com.org.freelancer;

public class jobs {
	private int job_id;
    private int jobclient_id;
    private String job_title;
	private String job_describtion;
    private String job_typer;
    private double job_salary;
    private double job_hours;
    private String job_status;
    private String due_date;
    
	public jobs(int job_id, int jobclient_id, String job_title, String job_describtion, String job_typer,
			double job_salary, double job_hours, String job_status, String due_date) {
		super();
		this.job_id = job_id;
		this.jobclient_id = jobclient_id;
		this.job_title = job_title;
		this.job_describtion = job_describtion;
		this.job_typer = job_typer;
		this.job_salary = job_salary;
		this.job_hours = job_hours;
		this.job_status = job_status;
		this.due_date = due_date;
		
		
		
	}

	public int getJob_id() {
		return job_id;
	}

	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}

	public int getJobclient_id() {
		return jobclient_id;
	}

	public void setJobclient_id(int jobclient_id) {
		this.jobclient_id = jobclient_id;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getJob_describtion() {
		return job_describtion;
	}

	public void setJob_describtion(String job_describtion) {
		this.job_describtion = job_describtion;
	}

	public String getJob_typer() {
		return job_typer;
	}

	public void setJob_typer(String job_typer) {
		this.job_typer = job_typer;
	}

	public double getJob_salary() {
		return job_salary;
	}

	public void setJob_salary(double job_salary) {
		this.job_salary = job_salary;
	}

	public double getJob_hours() {
		return job_hours;
	}

	public void setJob_hours(double job_hours) {
		this.job_hours = job_hours;
	}

	public String getJob_status() {
		return job_status;
	}

	public void setJob_status(String job_status) {
		this.job_status = job_status;
	}

	public String getDue_date() {
		return due_date;
	}

	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}

	@Override
	public String toString() {
		return "jobs [job_id=" + job_id + ", jobclient_id=" + jobclient_id + ", job_title=" + job_title
				+ ", job_describtion=" + job_describtion + ", job_typer=" + job_typer + ", job_salary=" + job_salary
				+ ", job_hours=" + job_hours + ", job_status=" + job_status + ", due_date=" + due_date + "]";
	}
	    
    
}
