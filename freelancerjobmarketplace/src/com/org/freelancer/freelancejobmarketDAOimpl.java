package com.org.freelancer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.org.freelancer.utils.DatabaseConnection;

public class freelancejobmarketDAOimpl implements freelancerjobmarketDAO {

	@Override
	public void ClientRegisteration(clients client) throws SQLException {
		 String sql = "INSERT INTO clients (client_id, first_name, last_name, email, phone_number, address) VALUES (?,?,?,?,?,?)";
	        
	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement stmt = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

	            stmt.setInt(1, client.getClient_id());
	            stmt.setString(2, client.getClient_firstname());
	            stmt.setString(3, client.getClient_lastname());
	            stmt.setString(4, client.getClient_email()); 
	            stmt.setString(5, client.getClient_phonenumber());
	            stmt.setString(6, client.getClient_address());

	            int affectedRows = stmt.executeUpdate();
	            
	            if (affectedRows > 0) {
	                System.out.println("Registration completed successfully!");
	            }
	        } catch (SQLIntegrityConstraintViolationException e) {
	            System.out.println("Client already exists with this ID or email.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw e;
	        }
        }
		
	

	@Override
	public void FreelancerRegistration(freelancer freelancer) throws SQLException {
		// TODO Auto-generated method stub
		 String sql = "INSERT INTO freelancer (freelancer_id, fl_first_name, fl_last_name, fl_email, fl_phno, skills) VALUES (?,?,?,?,?,?)";
	        
	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement stmt = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

	            stmt.setInt(1, freelancer.getFreelancer_id());
	            stmt.setString(2, freelancer.getFreelance_firstname());
	            stmt.setString(3, freelancer.getFreelancer_lastname());
	            stmt.setString(4, freelancer.getFreelancer_email()); 
	            stmt.setString(5, freelancer.getFreelancer_phonenumber());
	            stmt.setString(6, freelancer.getFreelancer_skils());

	            int affectedRows = stmt.executeUpdate();
	            
	            if (affectedRows > 0) {
	                System.out.println("Registration completed successfully!");
	            }
	        } catch (SQLIntegrityConstraintViolationException e) {
	            System.out.println("Freelancer already exists with this ID or email.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw e;
	        }
	}

	@Override
	public void Postjob(jobs job) throws SQLException {
		String sql = "INSERT INTO jobs (job_id, client_id, job_title, job_description, job_type, budget, hourly_rate, job_status, due_date) VALUES (?,?,?,?,?,?,?,?,?)";
	    
	    try (Connection connection = DatabaseConnection.getConnection();
	         PreparedStatement stmt = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

	        stmt.setInt(1, job.getJob_id());
	        stmt.setInt(2, job.getJobclient_id());
	        stmt.setString(3, job.getJob_title());
	        stmt.setString(4, job.getJob_describtion());
	        stmt.setString(5, job.getJob_typer());
	        stmt.setDouble(6, job.getJob_salary()); 
	        stmt.setDouble(7, job.getJob_hours());  
	        stmt.setString(8, job.getJob_status());
	        stmt.setString(9, job.getDue_date());

	        int affectedRows = stmt.executeUpdate();
	        
	        if (affectedRows > 0) {
	            System.out.println("Job posted successfully!");
	        }
	    } catch (SQLIntegrityConstraintViolationException e) {
	        System.out.println("Job already exists with this ID or client ID.");
	    } catch (SQLException e) {
	        e.printStackTrace();
	        throw e;
	    }
		
	}

	@Override
	public void Jobapplication(application application) {
		  String sql = "INSERT INTO application (application_id, job_id, freelancer_id, cover_letter, application_status) VALUES (?, ?, ?, ?, 'Applied')";

		    try (Connection connection = DatabaseConnection.getConnection();
		         PreparedStatement stmt = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

		        stmt.setInt(1, application.getApplication_id()); 
		        stmt.setInt(2, application. getApplication_jobid());         
		        stmt.setInt(3, application.getJob_freelancerid()); 
		        stmt.setString(4, application.getCover_letter()); 

		

		        int affectedRows = stmt.executeUpdate();

		        if (affectedRows > 0) {
		            System.out.println("Application submitted successfully!");
		        }
		    } catch (SQLIntegrityConstraintViolationException e) {
		        System.out.println("Error: Application already exists or data violation occurred.");
		    } catch (SQLException e) {
		        e.printStackTrace();  // Handle other SQL exceptions
		        throw new RuntimeException(e);
		    }
		
	}

	@Override
	public List<jobs> jobsAvailable() throws SQLException {
		List<jobs> jobList = new ArrayList<>();
	    String sql = "SELECT * FROM jobs";
	    try (Connection connection = DatabaseConnection.getConnection();
	         Statement stmt = connection.createStatement();
	         ResultSet rs = stmt.executeQuery(sql)) {

	        while (rs.next()) {
	            // Create jobs object using the result set
	            int job_id = rs.getInt("job_id");
	            int jobclient_id = rs.getInt("client_id");
	            String job_title = rs.getString("job_title");
	            String job_description = rs.getString("job_description");
	            String job_type = rs.getString("job_type");
	            double budget = rs.getDouble("budget");
	            double hourly_rate = rs.getDouble("hourly_rate");
	            String job_status = rs.getString("job_status");
	            String due_date = rs.getString("due_date");

	            // Create a job object
	            jobs job = new jobs(job_id, jobclient_id, job_title, job_description, job_type, 
	                                budget, hourly_rate, job_status, due_date);

	            // Add the job object to the list
	            jobList.add(job);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	        throw e;
	    }

	    return jobList;
	}

	@Override
	public void Approvejob(int job_id) {
		String sql = "UPDATE jobs SET job_status = 'Closed' WHERE job_id = ?";

	    try (Connection connection = DatabaseConnection.getConnection();
	         PreparedStatement stmt = connection.prepareStatement(sql)) {

	        stmt.setInt(1, job_id);  

	        int affectedRows = stmt.executeUpdate();

	        if (affectedRows > 0) {
	            System.out.println("Job has been approved and status updated to 'Closed'.");
	        } else {
	            System.out.println("No job found with the given job ID.");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        throw new RuntimeException("Error while approving job.", e);
	    }
		
	}

	
	public void displayJobs(List<jobs> jobList) {
	    if (jobList.isEmpty()) {
	        System.out.println("No jobs available.");
	    } else {
	        for (jobs job : jobList) {
	            System.out.println("Job ID: " + job.getJob_id());
	            System.out.println("Client ID: " + job.getJobclient_id());
	            System.out.println("Job Title: " + job.getJob_title());
	            System.out.println("Job Description: " + job.getJob_describtion());
	            System.out.println("Job Type: " + job.getJob_typer());
	            System.out.println("Budget: " + job.getJob_salary());
	            System.out.println("Hourly Rate: " + job.getJob_hours());
	            System.out.println("Job Status: " + job.getJob_status());
	            System.out.println("Due Date: " + job.getDue_date());
	            System.out.println("--------------------------------------");
	        }
	    }
	}



	@Override
	public void UpdateApplication(int application_id,String application_status) throws SQLException {
		String sql = "UPDATE application SET application_status = ? WHERE application_id = ?"; // Corrected WHERE clause

	    try (Connection connection = DatabaseConnection.getConnection();
	         PreparedStatement stmt = connection.prepareStatement(sql)) {

	        // Set the parameters for the query
	        stmt.setString(1, application_status); // Set the new application status
	        stmt.setInt(2, application_id); // Set the application ID for the WHERE condition

	        int affectedRows = stmt.executeUpdate();

	        if (affectedRows > 0) {
	            System.out.println("Application status has been updated to '" + application_status + "'.");
	        } else {
	            System.out.println("No application found with the given application ID.");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        throw new RuntimeException("Error while updating application status.", e);
	    	}

		}
	}
