create table admin(
id int primary key auto_increment,
username varchar(50) unique,
pwd varchar(30))ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into admin(username,pwd)values('xuan','xkp123');

DROP TABLE IF EXISTS product;
CREATE TABLE product (
  id int(12) PRIMARY KEY auto_increment,
  name varchar(50) NOT NULL unique,
  price double NOT NULL,
  amount int(10)  default '0',
  description varchar(50)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into product(name,price,amount,description)values('铅笔',1.5,10,'用来画画的');
insert into product(name,price,amount,description)values('A4纸',10,30,'用来打印的');
insert into product(name,price,amount,description)values('油性笔',2,30,'用来写字的');
insert into product(name,price,amount,description)values('电脑',4000,50,'用来敲代码的');
insert into product(name,price,amount,description)values('打印机',3000,5,'用来打印的');
insert into product(name,price,description)values('diannao',4000,'uer');
DROP TABLE IF EXISTS record;
CREATE TABLE record(
  id int(12) PRIMARY KEY auto_increment,
  productid int(12),
  time TIMESTAMP NOT NULL DEFAULT NOW(),
  name varchar(50),
  price double,
  amount int(30),
  username varchar(30),
  FOREIGN KEY(productid) REFERENCES product(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
set names gbk;