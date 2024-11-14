create database freelancejobmarket;
use freelancejobmarket;

create table clients(
client_id int primary key not null,
first_name varchar(100) not null,
last_name varchar(100) not null,
email varchar(150) not null unique,
phone_number varchar(15) not null unique,
address text not null,
created_at timestamp default current_timestamp);

create table freelancer(
freelancer_id int primary key not null,
fl_first_name varchar(100) not null,
fl_last_name varchar(100) not null,
fl_email varchar(150) not null,
fl_phno varchar(15) not null,
skills text not null,
created_at timestamp default current_timestamp);

create table jobs(
job_id int Primary Key not null,
client_id INT not null ,
job_title VARCHAR(100) not null,
job_description TEXT not null ,
job_type varchar(50) not null,
budget decimal(15,2) not null,
hourly_rate DECIMAL(10, 2) not null ,
job_status varchar(20) not null,  
posting_date TIMESTAMP ,
due_date DATE not null ,
foreign key(client_id) references clients(client_id));

create table application(
application_id int primary key not null,
job_id int not null,
freelancer_id int not null,
cover_letter text not null,
application_status varchar(20) not null,
application_date timestamp,
foreign key(job_id) references jobs(job_id),
foreign key(freelancer_id) references freelancer(freelancer_id));

select * from clients;
select * from application;
select * from freelancer;

alter table freelancer modify skills varchar(150);

alter table jobs modify due_date varchar(50);

alter table jobs modify job_description varchar(500);

alter table application modify application_date timestamp default current_timestamp;

alter table application modify application_status varchar(20) not null ;

alter table jobs modify posting_date timestamp default current_timestamp;

select * from jobs;