mysql -uroot -p132135138zsl

create database ems character set utf8 collate utf8_bin;

use ems;

create table emp(
	id int primary key auto_increment,
	nickname varchar(32),
	password varchar(32),
	gender char(2),
	salary double
);

insert into emp values(null, 'sire', '')