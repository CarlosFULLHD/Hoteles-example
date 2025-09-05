# 📘 Tarea de Base de Datos + Spring Boot con JPA

Hola **Alberto** 👋,

Aquí tienes tu tarea paso a paso. La idea es que practiques cómo pasar de **SQL** (con tablas y datos) a **Spring Boot con entidades JPA**, usando **Lombok** y relaciones **OneToMany / ManyToOne**.

---

## 1️⃣ Base de datos lista para usar
Ya tienes en la carpeta `/db` los archivos:

- `01_create_schema.sql` → crea las tablas de la BD **alberto02**
- `02_insert_data.sql` → inserta datos de ejemplo

👉 Lo que debes hacer:
1. Abre **phpMyAdmin** en XAMPP.
2. Crea una abse de datos y despues inserta el contenido del archivo `01_create_schema.sql` y luego `02_insert_data.sql`.
3. Verifica que se hayan creado las tablas y que hay datos cargados.

---

## 2️⃣ Configuración del proyecto
En el proyecto ya está el archivo **`application.properties`** con un ejemplo de conexión.

👉 Lo que debes hacer:
- Revisar que el **usuario y contraseña** de MySQL coincidan con los tuyos.
- Asegurarte de que el nombre de la BD en el URL (`alberto02` o `hospital_db`) corresponda al que importaste.

No necesitas modificar nada más por ahora.

---

## 3️⃣ Entidades que debes crear

### Hospital
- **Hospital**
    - Campos: `id`, `nombre`, `direccion`, `nivel`, `tieneUci`
    - Relación: `@OneToMany` → un hospital tiene muchos pacientes

- **Paciente**
    - Campos: `id`, `nombre`, `apellido`, `fechaNacimiento`, `asegurado`, `hospital_id`
    - Relación: `@ManyToOne` → un paciente pertenece a un hospital

---

## 4️⃣ Lombok
En todas tus entidades usa las anotaciones de Lombok:
- `@Getter` y `@Setter` → para no escribir getters y setters a mano
- `@NoArgsConstructor` y `@AllArgsConstructor` → para constructores
- `@Builder` → para construir objetos de manera más limpia

