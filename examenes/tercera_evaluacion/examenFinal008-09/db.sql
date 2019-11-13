PRAGMA FOREIGN_KEYS=ON;

DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
	firstName TEXT NOT NULL,
	lastName  TEXT NOT NULL,
	ein_employee TEXT PRIMARY KEY,
	salary    REAL NOT NULL
);

DROP TABLE IF EXISTS accounting;

CREATE TABLE accounting(
	ein_accounting TEXT PRIMARY KEY,
	workday INTEGER NOT NULL,
	FOREIGN KEY (ein_accounting) REFERENCES employee(ein_employee) ON DELETE CASCADE ON UPDATE CASCADE
);

DROP TABLE IF EXISTS rrhh;

CREATE TABLE rrhh(
        ein_rrhh TEXT PRIMARY KEY,
	career INTEGER NOT NULL,
        FOREIGN KEY ( ein_rrhh) REFERENCES employee(ein_employee) ON DELETE CASCADE ON UPDATE CASCADE
);


