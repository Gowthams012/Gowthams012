- 👋 Hi, I’m @Gowthams012
- 👀 I’m interested in ...
- 🌱 I’m currently learning ...
- 💞️ I’m looking to collaborate on ...
- 📫 How to reach me ...
- 😄 Pronouns: ...
- ⚡ Fun fact: ...

Freelance Job Marketplace
A console-based freelance job marketplace built in Java. This application allows clients to post jobs and freelancers to apply for them. It incorporates core object-oriented programming concepts such as classes, inheritance, polymorphism, interfaces, and collections, along with exception handling, file handling, and JDBC for database interactions.

Features
Clients can post jobs with details like job title, description, type, budget, and due date.
Freelancers can apply for jobs, providing a cover letter and other details.
Applications can be managed to approve or reject freelancers' applications.
Data is stored using file handling and a database with JDBC.
Technologies Used
Java: Core programming language for the application.
JDBC: For database connectivity.
File Handling: For saving job postings and applications.
Collections: ArrayLists to manage jobs and applications.
Key Concepts Implemented
Classes and Objects: Core entities like Job, Client, Freelancer, and Application.
Inheritance and Polymorphism: Different job types (e.g., Fixed-Price, Hourly) with unique attributes.
Encapsulation and Abstraction: Interfaces for managing job applications (e.g., postJob, applyForJob, approveApplication).
Exception Handling: Handling invalid applications, duplicate job postings, and expired jobs.
Database Structure
The database has four main tables:

Clients: Stores client details (ID, name, email, phone, etc.).
Freelancers: Stores freelancer details (ID, name, email, skills, etc.).
Jobs: Stores job details (ID, client ID, title, description, type, budget, etc.).
Applications: Stores application details (ID, job ID, freelancer ID, cover letter, status, etc.).
