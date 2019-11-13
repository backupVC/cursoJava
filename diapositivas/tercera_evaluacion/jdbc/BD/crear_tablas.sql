PRAGMA foreign_keys = ON;

DROP TABLE IF EXISTS empleado;
CREATE TABLE empleado (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        nombre TEXT,
        puesto TEXT
);

DROP TABLE IF EXISTS departamento;
CREATE TABLE departamento (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        nombre TEXT,
        localizacion TEXT
);


DROP TABLE IF EXISTS trabaja;
CREATE TABLE trabaja (
        idEmpleado INTEGER,
        idDepartamento INTEGER,
        PRIMARY KEY(idEmpleado,idDeparatamento),
        FOREIGN KEY(idEmpleado) REFERENCES empleado(id) ON DELETE CASCADE,
        FOREIGN KEY(idDepartamento) REFERENCES departamento(id) ON DELETE CASCADE,
);
