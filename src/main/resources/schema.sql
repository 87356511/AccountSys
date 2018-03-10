

CREATE TABLE account(
  id INT  not NULL  PRIMARY KEY AUTO_INCREMENT
  ,number INT not NULL
  ,pwd VARCHAR (20)
  ,money DOUBLE
  ,status TINYINT
  ,time TIMESTAMP
);
INSERT INTO account(number, pwd, money, status, time)
VALUES ('1234567890','123456',1.11,'0',now());
INSERT INTO account(number, pwd, money, status, time)
VALUES ('87356511','123456',12.01,'1',now());


