CREATE TABLE IF NOT EXISTS AUTHOR (
    id long NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name varchar(20) NOT NULL,
    last_name varchar(20),
    age int NOT NULL,
    country varchar(20),
    email_id varchar(20)
);


CREATE TABLE IF NOT EXISTS BOOK (
    id long NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title varchar(20) NOT NULL,
    publication varchar(20) NOT NULL,
    pages int NOT NULL
);