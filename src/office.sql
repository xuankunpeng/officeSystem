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
insert into product(name,price,amount,description)values('Ǧ��',1.5,10,'����������');
insert into product(name,price,amount,description)values('A4ֽ',10,30,'������ӡ��');
insert into product(name,price,amount,description)values('���Ա�',2,30,'����д�ֵ�');
insert into product(name,price,amount,description)values('����',4000,50,'�����ô����');
insert into product(name,price,amount,description)values('��ӡ��',3000,5,'������ӡ��');
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