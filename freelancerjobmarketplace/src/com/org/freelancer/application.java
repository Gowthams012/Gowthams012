package com.org.freelancer;

public class application {
	private int application_id;
    private int application_jobid;
    private int job_freelancerid;
    private String cover_letter;
    
	public application(int application_id, int application_jobid, int job_freelancerid, String cover_letter) {
		super();
		this.application_id = application_id;
		this.application_jobid = application_jobid;
		this.job_freelancerid = job_freelancerid;
		this.cover_letter = cover_letter;
		
	}
	public int getApplication_id() {
		return application_id;
	}
	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}
	public int getApplication_jobid() {
		return application_jobid;
	}
	public void setApplication_jobid(int application_jobid) {
		this.application_jobid = application_jobid;
	}
	public int getJob_freelancerid() {
		return job_freelancerid;
	}
	public void setJob_freelancerid(int job_freelancerid) {
		this.job_freelancerid = job_freelancerid;
	}
	public String getCover_letter() {
		return cover_letter;
	}
	public void setCover_letter(String cover_letter) {
		this.cover_letter = cover_letter;
	}
	
	@Override
	public String toString() {
		return "application [application_id=" + application_id + ", application_jobid=" + application_jobid
				+ ", job_freelancerid=" + job_freelancerid + ", cover_letter=" + cover_letter  + "]";
	}

	}
