drop table if exists USERS;

create table USERS (
	userId		varchar(12) not null,
	password	varchar(12) not null,
	name		varchar(20) not null,
	email		varchar(50),
	
	primary key	(userId)
);

insert into USERS values ('jaayou', 'password', '자유', 'jaayou@email.com');