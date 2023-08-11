# not equal 
select released_year,title from books;

select released_year,title from books
where released_year!=2004;

select released_year,title from books
where released_year!=2004
order by released_year;

select title,author_fname from books;

select title,author_fname from books
where author_fname!='David';


# not like
select title from books;

select title from books
where title not like '%War%';

select title from books
where title not like '%Kid%';

select title,released_year from books 
where released_year not like '20%';

select title,pages from books 
where pages not like '__';

select title,pages from books 
where pages like '__';


# greater than
# greater than or equal to
select title,released_year from books 
where released_year>2005;

select title,released_year from books 
where released_year >= 2005;

select 99>1;
select -24 > -10;
select 'z'>'a';
select 'Z'>'a'; #case insensitive

select title,stock_quantity from books 
where stock_quantity>84;


# lesser than
# lesser than or equal to
select title,released_year from books 
where released_year<2005;

select title,released_year from books 
where released_year <= 2005;


# logical operators 

# and
select title,released_year,author_fname
from books
where author_fname='Neil' and released_year>2005;

select title,released_year,author_fname
from books
where author_fname='Neil' and 
      released_year>2005 and
      pages>200;

select title,released_year,author_fname
from books
where author_fname='Neil' and 
      released_year>2005 and
      pages>500;


#or
select title,released_year,author_fname
from books
where author_fname='Neil' or 
      released_year>2005;
      
select title,released_year,author_fname,pages
from books
where author_fname='Neil' or 
      released_year>2005;
      
select 
title,released_year,author_fname,stock_quantity
from books
where author_fname='Neil' or 
      released_year>2005 or 
      stock_quantity=1000;
      
      
# between/ not between
select title,released_year from books 
where released_year between 2005 and 2016;

select title,released_year from books 
where released_year>2005 and released_year<2016;

select title,released_year from books 
where 
released_year>=2005 and released_year<=2016;

# between query on dates
select name,birthdate from people
where 
birthdate between '2023-07-01' and '2023-08-11';

select name,birthdate from people
where 
birthdate between '2023-07-01' and current_date();

select current_date();


# in/not in
select name from people
where 
name='akarsh' or 
name='abhay' or 
name='abhishek';

select name from people 
where 
name in ('Akarsh','Abhay','Abhishek');


select name from people 
where 
name not in ('Akarsh','Abhay','Abhishek');