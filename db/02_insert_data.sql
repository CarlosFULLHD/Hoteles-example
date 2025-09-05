USE hospital_db;

INSERT INTO hospital (nombre, direccion, nivel, tiene_uci) VALUES
('Hospital Arcoiris', 'Av. Central 123, La Paz', 'Secundario', 1),
('Clínica Los Andes', 'C. 10 #45, Cochabamba', 'Terciario', 1),
('Centro de Salud Villa Real', 'Barrio Norte s/n, Santa Cruz', 'Primario', 0);

INSERT INTO paciente (nombre, apellido, fecha_nacimiento, asegurado, hospital_id) VALUES
('María', 'Gutiérrez', '1990-05-14', 1, 1),
('José', 'Mamani',    '1985-11-20', 0, 1),
('Luisa', 'Rojas',    '2001-01-02', 1, 2),
('Carlos','Fernández','1978-09-08', 1, 2),
('Ana',   'Salazar',  '1995-03-25', 0, 3);
