drop table cats;

# create
create table cats(
    cat_id int not null auto_increment,
    name varchar(100),
    breed varchar(20),
    age int default 20,
    primary key(cat_id)
);

insert into cats(cat_id,name,breed,age)
values(4,'Bruno','Golden Retreiver',3);

insert into cats(name,breed,age) values
            ('Ringo', 'Tabby', 4),
            ('Cindy', 'Maine Coon', 10),
            ('Dumbledore', 'Maine Coon', 11),
            ('Egg', 'Persian', 4),
            ('Misty', 'Tabby', 13),
            ('George Michael', 'Ragdoll', 9),
            ('Jackson', 'Sphynx', 7);
  
  
  
  
# read
select * from cats where name='Ringo';

select * from cats where name='ringo';

select * from cats where age>10;



# update
update cats set breed='Beagle' 
where breed='Sphynx';

update cats set age = 7
where name='Bruno';

update cats set breed='loyal' 
where age = 7;

update cats set breed='loyal',name='Shinchan'
where age = 7;

update cats set name='Doraemon' 
where name='Shinchan';

update cats set cat_id=2
where name='Cindy';

insert into cats(cat_id,name,breed,age)
values(3,'Bruno','Golden Retreiver',3);

insert into cats(name,breed,age)
values('Bruno','Golden Retreiver',3);

select name,age from cats
where breed='tabby';



# delete
delete from cats where name = 'bruno';

delete from cats where age<=4;

delete from cats where age<cat_id;

delete from cats;


#String functions

# to execute all queries of sql files at once
# source book_shop.sql


#concat
select author_fname from books;
select author_lname from books;

select concat(author_fname, ' ', 
              author_lname)
              from books;
              
select concat(author_fname, ' ', 
              author_lname)
              as author_fullname
              from books;


#concat_ws
select concat(title, ' -> ',
              author_fname, ' -> ',
              author_lname)
              as info
              from books;
              
select concat_ws(' -> ', title, 
                 author_fname, author_lname) 
                 as info
                 from books;

# substring/substr 
select substring("Hello world",1,4);
select substring("Hello world",1);
select substring("Hello world",3);
select substring("Hello world",3,9999);

select substring(title,1,3) from books;

select concat(substring(title,1,3),"...")
as 'short title'
from books;



