PRAGMA FOREIGN_KEYS=ON;

DROP TABLE IF EXISTS user;
--tabla usuario
CREATE TABLE user(
	id_user INTEGER PRIMARY KEY AUTOINCREMENT,
	firstName TEXT,
	lastName  TEXT,
	email TEXT
);
--tabla invitado
DROP TABLE IF EXISTS guest;
--se controla el número de acceso
CREATE TABLE guest(
	id_guest INTEGER,
	numberAccess INTEGER,
	FOREIGN KEY (id_guest) REFERENCES user(id_user) ON DELETE CASCADE ON UPDATE CASCADE
);

--tabla usuario registrado
DROP TABLE IF EXISTS registeredUser;
-- se controla el último acceso
CREATE TABLE registeredUser(
        id_registered,
	lastAccessDate TEXT,
        FOREIGN KEY (id_registered) REFERENCES user(id_user) ON DELETE CASCADE ON UPDATE CASCADE
);


