drop table if exists professor;



create table professor(
id int primary key auto_increment,
name varchar(20) not null,
belong varchar(200),
phone varchar(20)
);


insert into professor (name, belong, phone)
values('유재석','COMPUTER','010-1234-5678'),
('황영조','SPORTS','010-2134-2443'),
('케이멀','DANCE','010-2342-4343'),
('호날두','ENGLISH','010-3434-3222'),
('김형민','COMPUTER','010-2343-2432');