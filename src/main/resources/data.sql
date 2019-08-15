create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);

INSERT into person values (10001, 'Ranga', 'Portugal', sysdate()); 
INSERT into person values (10002, 'Joao', 'Brasil', sysdate()); 
INSERT into person values (10003, 'Peter', 'Bruxelas', sysdate()); 