PRAGMA FOREIGN_KEYS=ON;

DROP TABLE IF EXISTS person;

CREATE TABLE person (
	firstName TEXT NOT NULL,
	lastName  TEXT NOT NULL,
	emailPerson TEXT PRIMARY KEY,
	gender    TEXT NOT NULL
);

DROP TABLE IF EXISTS teacher;

CREATE TABLE teacher(
	emailTeacher TEXT PRIMARY KEY,
	subject TEXT NOT NULL,
	FOREIGN KEY (emailTeacher) REFERENCES person(emailPerson) ON DELETE CASCADE ON UPDATE CASCADE
);

DROP TABLE IF EXISTS substituteTeacher;

CREATE TABLE substituteTeacher(
        emailSubstituTeacher TEXT PRIMARY KEY,
	career INTEGER NOT NULL,
        FOREIGN KEY (emailSubstituTeacher) REFERENCES teacher(emailTeacher) ON DELETE CASCADE ON UPDATE CASCADE
);


DROP TABLE IF EXISTS principalTeacher;

CREATE TABLE principalTeacher(
        emailPrincipalTeacher TEXT PRIMARY KEY,
        contract TEXT NOT NULL,
        FOREIGN KEY (emailPrincipalTeacher) REFERENCES teacher(emailTeacher) ON DELETE CASCADE ON UPDATE CASCADE
);


DROP TABLE IF EXISTS student;

CREATE TABLE student(
	emailStudent TEXT PRIMARY KEY,
	course TEXT NOT NULL,
	FOREIGN KEY (emailStudent) REFERENCES person(emailPerson) ON DELETE CASCADE ON UPDATE CASCADE
);

DROP VIEW IF EXISTS student_view;
CREATE VIEW student_view AS SELECT firstName, lastName , emailPerson , gender , course FROM person , student WHERE person.emailPerson = student.emailStudent;

DROP VIEW IF EXISTS substituteTeacher_view;
CREATE VIEW substituteTeacher_view AS SELECT firstName, lastName , emailPerson , gender , subject, career from person , substituteTeacher, teacher WHERE person.emailPerson = teacher.emailTeacher AND teacher.emailTeacher = substituteTeacher.emailSubstituTeacher;

DROP VIEW IF EXISTS principalTeacher_view;
CREATE VIEW principalTeacher_view AS SELECT firstName, lastName , emailPerson , gender , subject, contract from person , principalTeacher, teacher WHERE person.emailPerson = teacher.emailTeacher AND teacher.emailTeacher = principalTeacher.emailPrincipalTeacher;

DROP TABLE IF EXISTS record;
CREATE TABLE record (
    firstName TEXT NOT NULL,
    lastName  TEXT NOT NULL,
    emailPerson TEXT PRIMARY KEY,
    gender    TEXT NOT NULL,
    date TEXT NOT NULL 
);

DROP TRIGGER IF EXISTS after_del;
CREATE TRIGGER after_del  AFTER DELETE 
 ON person
 BEGIN 
   INSERT INTO record VALUES (old.firstName, old.lastName, old.emailPerson, old.gender, datetime('now'));
 END;
 INSERT INTO record VALUES (old.firstName, old.lastName, old.emailPerson, old.gender, datetime('now'));
 END ;


