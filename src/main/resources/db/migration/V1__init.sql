CREATE TABLE IF NOT EXISTS AUTHOR (
    id long NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(20),
    age int NOT NULL
);


CREATE TABLE IF NOT EXISTS BOOK (
    id long NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title varchar(20) NOT NULL
);