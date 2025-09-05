-- Base de datos de práctica Hospital
CREATE DATABASE IF NOT EXISTS hospital_db
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE hospital_db;

DROP TABLE IF EXISTS paciente;
DROP TABLE IF EXISTS hospital;

CREATE TABLE hospital (
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(150) NOT NULL,
direccion VARCHAR(200) NOT NULL,
nivel VARCHAR(20) NOT NULL,         -- p.ej. "Primario", "Secundario", "Terciario"
tiene_uci BOOLEAN NOT NULL DEFAULT 0,
PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE paciente (
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(100) NOT NULL,
apellido VARCHAR(100) NOT NULL,
fecha_nacimiento DATE NOT NULL,
asegurado BOOLEAN NOT NULL DEFAULT 1,
hospital_id INT NOT NULL,
PRIMARY KEY (id),
CONSTRAINT fk_paciente_hospital
FOREIGN KEY (hospital_id) REFERENCES hospital(id)
ON DELETE CASCADE
) ENGINE=InnoDB;
