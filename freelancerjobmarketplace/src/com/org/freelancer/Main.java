package com.org.freelancer;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		freelancejobmarketDAOimpl freelanceDAO=new freelancejobmarketDAOimpl();
		int choice;
		while(true) {
			System.out.println("----------Freelance Job Marketplace----------");
            System.out.println("1. Register a Client");
            System.out.println("2. Register a Freelancer");
            System.out.println("3. Post a Job");
            System.out.println("4. Apply for Job");
            System.out.println("5. Check Available Jobs ");
            System.out.println("6. Update Job Status  ");
            System.out.println("7. Update Application Status ");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice) {
            case 1:
            	System.out.println("-----Client Registration-----");
            	System.out.println("Enter the Client ID  : ");
            	int client_id=sc.nextInt();
            	System.out.println("Enter a First Name : ");
            	String client_firstname=sc.next();
            	System.out.println("Enter the Last Name : ");
            	String client_lastname=sc.next();
            	System.out.println("Enter a Email : ");
            	String client_email=sc.next();
            	System.out.println("Enter a Phone number : ");
            	String client_phonenumber=sc.next();
            	System.out.println("Enter a Address : ");
            	String client_address=sc.next();
            	
            	clients newclient=new clients(client_id,client_firstname,client_lastname,client_email,client_phonenumber,client_address);
            	freelanceDAO.ClientRegisteration(newclient);
            	break;
          
            case 2:
                System.out.println("-----Freelancer Registration-----");
                
                System.out.print("Enter the Freelancer ID: ");
                int freelancer_id = sc.nextInt();
                
                System.out.print("Enter the First Name: ");
                String freelancer_firstname = sc.next();
                
                System.out.print("Enter the Last Name: ");
                String freelancer_lastname = sc.next();
                
                System.out.print("Enter the Email: ");
                String freelancer_email = sc.next();
                
                System.out.print("Enter the Phone number: ");
                String freelancer_phonenumber = sc.next();
                
                sc.nextLine(); 

                System.out.print("Enter Skills: ");
                String freelancer_skills = sc.nextLine(); 

              
                freelancer newFreelancer = new freelancer(
                    freelancer_id,
                    freelancer_firstname,
                    freelancer_lastname,
                    freelancer_email,
                    freelancer_phonenumber,
                    freelancer_skills
                );

               
                freelanceDAO.FreelancerRegistration(newFreelancer);
                break;

            case 3:
            	System.out.println("-----Post a Job-----");
            	System.out.println("Enter the Job ID: ");
            	int job_id = sc.nextInt();
            	System.out.println("Enter a Client Id: ");
            	int jobclient_id = sc.nextInt();
            	sc.nextLine(); 

            	System.out.print("Enter the Job Title: ");
            	String job_title = sc.nextLine();
            	System.out.print("Enter a Job Description: ");
            	String job_describtion = sc.nextLine();
            	System.out.print("Enter a Job Type: ");
            	String job_type = sc.nextLine();

            	System.out.println("Enter a Salary: ");
            	double job_salary = sc.nextDouble();

            	System.out.println("Enter the Working Hours for Job: ");
            	double job_hours = sc.nextDouble();
            	sc.nextLine(); 

            	System.out.println("Enter the Job Status (open/closed): ");
            	String job_status = sc.nextLine();

            	System.out.print("Enter the Due Date to Apply for Job: ");
            	String due_date = sc.nextLine();

 
            	jobs newJob = new jobs(
            	    job_id,        
            	    jobclient_id,   
            	    job_title,   
            	    job_describtion,
            	    job_type,        
            	    job_salary,       
            	    job_hours,    
            	    job_status,       
            	    due_date          
            	);

            	freelanceDAO.Postjob(newJob);

            	break;
            case 4:
            	System.out.println("----- Job Application -----");
            	System.out.println("Enter the Application ID  : ");
            	int application_id = sc.nextInt();
            	System.out.println("Enter a Job Id  : ");
            	int application_jobid = sc.nextInt();
            	System.out.println("Enter the Freelancer ID  : ");
            	int job_freelancerid = sc.nextInt();
            	sc.nextLine(); 
            	System.out.print("Enter a Cover Letter : ");
            	String cover_letter = sc.nextLine();
            	application newApplication = new application(
            	        application_id, 
            	        application_jobid, 
            	        job_freelancerid, 
            	        cover_letter);
            	freelanceDAO.Jobapplication(newApplication);

            	break;
            case 5:
            	
            	 List<jobs> availableJobs = freelanceDAO.jobsAvailable();
            	 freelanceDAO.displayJobs(availableJobs);
            	break;
            case 6:
            	System.out.println("----- Update Job Status -----");
            	System.out.println("Enter the Job ID  : ");
            	int updatejob_id = sc.nextInt();
            	freelanceDAO.Approvejob(updatejob_id);
            
            	break;
            case 7:
            	System.out.println("----- Update Application Status -----");
            	System.out.println("Enter the Application ID  : ");
            	int updateapplication_id = sc.nextInt();
            	System.out.print("Enter the Application Status (Selected/Rejected)  : ");
            	String updatedapplication_status = sc.next();
            	
            	freelanceDAO.UpdateApplication(updateapplication_id,updatedapplication_status);
            	break;
            case 8:
            	System.out.println("-----Thank You !----");
            	System.exit(0);
            	sc.close();
            	break;
            default:
            	System.out.println("-----Invalid Choice Please Try Again ! -----");
            	break;
            	
            }

			
		}
	}



}
