DROP TABLE if exists STUDENT;

CREATE TABLE student
(
     s_id CHAR(9),
     name VARCHAR(48) NOT NULL,
     belong VARCHAR(20),
     phone VARCHAR(20),
     status INT DEFAULT 0,
     primary key (s_id)
);