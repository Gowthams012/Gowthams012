package com.org.freelancer;

import java.sql.SQLException;
import java.util.List;

public interface freelancerjobmarketDAO {
	public void ClientRegisteration(clients client) throws SQLException;
	public void FreelancerRegistration(freelancer freelancer) throws SQLException;
	public void Postjob(jobs job) throws SQLException;
	public void Jobapplication(application application) throws SQLException;
	List<jobs> jobsAvailable() throws SQLException;
	public void Approvejob(int job_id) throws SQLException;
	public void UpdateApplication(int application_id,String application_status) throws SQLException;

	
}
