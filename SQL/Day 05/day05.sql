-- database, table construction

DROP DATABASE IF EXISTS book_shop;

CREATE DATABASE book_shop;

CREATE TABLE books
(
    book_id INT NOT NULL,
    title VARCHAR(100),
    author_fname VARCHAR(100),
    author_lname VARCHAR(100),
    released_year INT,
    stock_quantity INT,
    pages INT,
    PRIMARY KEY(book_id)
);


INSERT INTO books 
(book_id,title, author_fname, author_lname,
released_year, stock_quantity, pages)
VALUES
(1,'The Namesake', 'Jhumpa', 'Lahiri', 2003, 32, 291),
(2,'Norse Mythology', 'Neil', 'Gaiman',2016, 43, 304),
(3,'American Gods', 'Neil', 'Gaiman', 2001, 12, 465),
(4,'Interpreter of Maladies', 'Jhumpa', 'Lahiri', 1996, 97,
198),
(5,'A Hologram for the King: A Novel', 'Dave', 'Eggers',
2012, 154, 352),
(6,'The Circle', 'Dave', 'Eggers', 2013, 26, 504),
(7,'The Amazing Adventures of Kavalier & Clay', 'Michael',
'Chabon', 2000, 68, 634),
(8,'Just Kids', 'Patti', 'Smith', 2010, 55, 304),
(9,'A Heartbreaking Work of Staggering Genius', 'Dave',
'Eggers', 2001, 104, 437),
(10,'Coraline', 'Neil', 'Gaiman', 2003, 100, 208),
(11,'Where Im Calling From: Selected Stories', 'Raymond',
'Carver', 1989, 12, 526),
(12,'White Noise', 'Don', 'DeLillo', 1985, 49, 320),
(13,'Cannery Row', 'John', 'Steinbeck', 1945, 95, 181),
(14,'Oblivion: Stories', 'David', 'Foster Wallace', 2004,
172, 329),
(15,'Consider the Lobster', 'David', 'Foster Wallace', 2005,
92, 343);


-- like
select * from books;

select title,author_fname,author_lname from books;

select title,author_fname,author_lname from books where author_fname like '%da%';

select title,author_fname,author_lname from books where author_fname like '%av%';

select title,author_fname,author_lname from books where author_fname like '_da%';

select title from books where title like '%the%';


-- count

select count(*) as "count of books" from books;

select author_fname from books;

select distinct author_fname from books;

select count(distinct author_fname) from books;

select count(concat(author_fname, author_lname)) from books;

select count(title) as "count of valid titles"  from books where title like '%the%';


-- min/max
select min(stock_quantity) from books;

select stock_quantity from books order by stock_quantity limit 1;

select max(stock_quantity) from books;

select stock_quantity from books order by stock_quantity desc limit 1;


-- subquery
select * from books where pages = 181;

-- select * from books where pages = x;

select * from books where pages = (select min(pages) from books);

select * from books order by pages limit 1;

-- groupby
select author_fname, author_lname, min(released_year) as "first released book year" from books 
group by author_fname,author_lname;













