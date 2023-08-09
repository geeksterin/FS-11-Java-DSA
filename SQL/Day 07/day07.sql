# decimal
create table items(
    price decimal(5,2)
);
# 
insert into items(price) values(7);
insert into items(price) values(7654321);
insert into items(price) values(3.14);
insert into items(price) values(3.1428);
insert into items(price) values(99.9999);
insert into items(price) values(500000.99);
insert into items(price) values(500.99);
insert into items(price) values(500.999);


# float and double
create table itemsFloat(
    price float
);


create table itemsDouble(
    price double
);

insert into itemsFloat(price) values(88.96);
insert into itemsDouble(price) values(88.96);

insert into itemsFloat(price) values(8888.967);
insert into itemsFloat(price) values(8888.962);

insert into itemsFloat(price) values(8888950890);
insert into itemsDouble(price) values(8888950890);


# date time
create table people(
    name varchar(200),
    birthdate date,
    birthtime time,
    birthdt datetime
);

insert into people(name,birthdate,birthtime,birthdt)
values
('Akarsh','2023-07-24','21:11:32','2023-07-24 21:11:32'),
('Abhay','2022-07-24','01:11:32','2022-07-24 01:11:32'),
('Aastha','2023-06-24','11:22:44','2023-06-24 11:22:44');


insert into people(name,birthdate,birthtime,birthdt)
values
('Abhishek',curdate(),curtime(),now());


# date and time formatting using functions 
select birthdate, day(birthdate) from people;
select birthdate, dayname(birthdate) from people;
select birthdate, month(birthdate) from people;

select birthdate, monthname(birthdate) 
from people;

select last_day(birthdate),monthname(birthdate)
from people;


#date format function
select date_format(birthdate,'%M') from people;

select date_format(birthdate,'was born in %M') 
from people;

select concat(name,
              date_format(birthdate,' was born in %M')
             ) as comment
            from people;
            
select concat(name,
              date_format(birthdate,' was born in %M'),
              date_format(birthdate,' on %W')
             ) as comment,
             birthdate
            from people;



