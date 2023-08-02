use book_shop;


# replace
select replace('Hello world','Hell','X');

select replace('hello world','Hell','X');

select replace('Hello world Hell Hell','Hell','X');

select replace(title,'The','A') 
as titled from books;


# reverse
select reverse('akarsh');

select reverse(title) from books;
select reverse(concat(author_fname, ' ', author_lname))
from books;

select concat('akarsh',reverse('akarsh')) 
as 'palindromic string';

# char_length
select char_length('akarsh');
select char_length(title) from books;

select char_length(title),author_fname from books;

select char_length(title) as len,title 
from books;

select concat(title,' -> ',char_length(title))
from books;

select concat(
    concat(author_fname, ' ', author_lname),
           ' -> ',char_length(title)) as info
            from books;
            
#upper 
select upper('heLLO woLH');
select upper(title) from books;

#lower
select lower('heLLO woLH');
select lower(title) from books;

select concat(lower(title), '....') 
from books;


# selection refining

INSERT INTO books
(title, author_fname, author_lname, released_year,
stock_quantity, pages)
VALUES ('10% Happier', 'Dan', 'Harris', 2014, 29,
256),
('fake_book', 'Freida', 'Harris', 2001, 287,
428),
('Lincoln In The Bardo', 'George', 'Saunders',
2017, 1000, 367);

# distinct
select released_year from books;
select distinct released_year from books;

select author_fname from books;
select distinct author_fname from books;

select concat(author_fname, ' ', author_lname)
as full_name from books;

select distinct concat(author_fname, ' ', author_lname)
as full_name from books;


# order by
select author_fname from books
order by author_fname;

select author_fname from books
order by author_fname desc;

select released_year from books
order by released_year;

select released_year from books
order by released_year desc;

select title,released_year from books
order by released_year;

select title,released_year from books
order by 2;

select title,released_year from books
order by 2,1;

select title,released_year from books
order by released_year,stock_quantity;


# limit
select title from books limit 3;
select title,stock_quantity from books 
order by stock_quantity desc limit 3;

select book_id,stock_quantity from books
limit 7,10;

select book_id,stock_quantity from books
limit 7,100;

select book_id,stock_quantity from books
limit 117,100;
