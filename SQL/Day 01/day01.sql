# to start the sql server
mysql-ctl cli;

# create database
# create database <database-name>;
create database hello_world;

# to view all the databases
show databases;

# delete the database
# drop database <database-name>;
drop database hello_world;

# use <database-name>;
use hello_world;

# to know current database
select database();
