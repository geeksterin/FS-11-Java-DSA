# create table
create table cats(
    name varchar(100),
    age int 
);

# show all the tables in current database
show tables;

# structure of the table
desc cats;
show columns from cats;

# delete the table
drop table cats;

create table pastries(
    name varchar(50),
    quantity int
    );
    
drop table pastries;

# insert into table
insert into cats(name,age) 
            values ('bruno',3);
insert into cats(age,name) 
            values (14,'jenny');

# read the table
select name,age from cats;
# * indicates all attributes
select * from cats; 
select name from cats;
select age from cats;
select age,name from cats;

#insert mutiple values into the table
insert into cats(name,age)
            values('Penny',3),
                  ('Tom',9);
                  
create table people(
    first_name varchar(20),
    last_name varchar(20),
    age int
);

insert into people(first_name,last_name,age)
            values('Tina','Belcher',13);
insert into people(first_name,last_name,age)
            values('Bob','Belcher',42);

insert into people(first_name,last_name,age)
            values('Linda','Belcher',45),
                  ('Philip','Frond',38),
                  ('Calvin','Fischoeder',70);
                  
insert into people(first_name,last_name)
            values('Bob','Jaiswal');
  
  
# default
create table cats2(
    name varchar(100),
    age int default 99
);

insert into cats2(name) values ('bruno');

create table cats3(
    name varchar(100) default 'akarsh',
    age int default 99
);            

insert into cats3(age) values (11);


# not null -> 
# (the attribute value should be there)
create table cats4(
    name varchar(100),
    age int not null
); 

insert into cats4(name) values ('bruno');
insert into cats4(age) values (10);

# primary key
create table cats5(
    cat_id int not null,
    name varchar(100),
    age int,
    primary key(cat_id)
);

insert into cats5(cat_id,name,age) 
            values (1,'bruno',3);
insert into cats5(cat_id,name,age) 
            values (2,'jenny',14);

# auto_increment 
create table cats6(
    cat_id int not null auto_increment,
    name varchar(100),
    age int,
    primary key(cat_id)
);

insert into cats6(cat_id,name,age) 
            values (1,'bruno',3);
insert into cats6(name,age) 
            values ('jenny',14);
insert into cats6(name,age) 
            values ('penny',2);
insert into cats6(name,age) 
            values ('jenny',14);
insert into cats6(name,age) 
            values ('penny',2);
            
insert into cats6(cat_id,name,age) 
            values (8,'bruno',3);
            
#alias 
select cat_id from cats6;
select cat_id as id from cats6;
select cat_id as 'id of cats' from cats6;

create table employees(
    id int auto_increment not null,
    first_name varchar(20) not null,
    last_name varchar(20) not null,
    middle_name varchar(20),
    age int not null,
    current_status varchar(20) 
    not null default 'employed',
    primary key(id)
);

insert into employees
    (id,first_name,last_name,age)
    values(1,'akarsh','jaiswal',11);


            





