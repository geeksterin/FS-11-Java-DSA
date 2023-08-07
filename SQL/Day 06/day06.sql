# sum
select sum(pages) from books;
select sum(book_id) from books;
select sum(stock_quantity) from books;

# sum with groupby
select sum(pages) as total_sum,
concat(author_fname, ' ', author_lname)
as author_fullname from books 
group by author_fullname;

select sum(stock_quantity) as total_sum,
concat(author_fname, ' ', author_lname)
as author_fullname from books 
group by author_fullname
order by total_sum desc;


# avg
select avg(stock_quantity) from books;
select sum(stock_quantity)/count(stock_quantity)
from books;

# avg with groupby
select avg(stock_quantity) as avg_sum,
concat(author_fname, ' ', author_lname)
as author_fullname from books 
group by author_fullname
order by avg_sum;

select sum(stock_quantity)/count(stock_quantity) as avg_sum,
concat(author_fname, ' ', author_lname)
as author_fullname from books 
group by author_fullname
order by avg_sum;

select avg(stock_quantity),released_year from books 
group by released_year;


# Relationships

create table customers(
    id int auto_increment primary key,
    first_name varchar(200),
    last_name varchar(200),
    email varchar(200)
);

create table orders(
    id int auto_increment primary key,
    order_date date,
    amount int,
    customer_id int,
    foreign key(customer_id) 
    references customers(id)
);

INSERT INTO customers 
(first_name, last_name, email)
VALUES 
('Boy', 'George', 'george@gmail.com'),
('George', 'Michael', 'gm@gmail.com'),
('David', 'Bowie', 'david@gmail.com'),
('Blue', 'Steele', 'blue@gmail.com'),
('Bette', 'Davis', 'bette@aol.com');

INSERT INTO orders 
(order_date, amount, customer_id)
VALUES 
('2016/02/10', 99.99, 1),
('2017/11/11', 35.50, 1),
('2014/12/12', 800.67, 2),
('2015/01/03', 12.50, 2),
('1999/04/11', 450.25, 5);

INSERT INTO orders 
(order_date, amount, customer_id)
VALUES 
('2016/02/10', 99.99, 10);


# inner join
select * from customers inner join orders on 
customers.id = orders.customer_id;

select * from customers join orders on 
customers.id = orders.customer_id;


# left join
select * from customers left join orders on 
customers.id = orders.customer_id;


# right join
select * from customers right join orders on 
customers.id = orders.customer_id;







