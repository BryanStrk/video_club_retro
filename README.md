
```markdown
# 🎬 Video Club Retro

Sistema de gestión de películas desarrollado en **Java** siguiendo el patrón de diseño **MVC (Modelo-Vista-Controlador)**.
Este proyecto permite realizar operaciones básicas de persistencia en una base de datos MySQL.

## 🚀 Características
* **Arquitectura Limpia:** Separación de responsabilidades mediante MVC.
* **Persistencia:** Conexión a base de datos relacional (MySQL).
* **Gestión de Dependencias:** Configurado con **Maven**.
* **CRUD Básico:** Registro de nuevas películas y visualización de listados.

## 🛠️ Tecnologías utilizadas
* **Java 25** (o superior)
* **Maven** (Gestor de dependencias)
* **MySQL** (Base de datos)
* **JDBC** (Java Database Connectivity)

## 📋 Requisitos Previos
1. Tener instalado un servidor de MySQL.
2. Crear una base de datos llamada `video_club_db`.
3. Crear la tabla `movies` con la siguiente estructura:

```sql
CREATE TABLE movies (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    genre VARCHAR(100),
    anio INT,
    synopsis TEXT,
    image_url VARCHAR(255),
    director VARCHAR(255),
    rating DOUBLE
);
```

## ⚙️ Configuración
El proyecto utiliza las siguientes credenciales por defecto en la clase `DBManager`:
* **URL:** `jdbc:mysql://localhost:3306/video_club_db`
* **Usuario:** `root`
* **Contraseña:** `root`

## 📂 Estructura del Proyecto
* `src/main/java/com/daw/cicd/config`: Configuración de la conexión a la BBDD.
* `src/main/java/com/daw/cicd/model`: Clases de datos (POJOs).
* `src/main/java/com/daw/cicd/repository`: Lógica de acceso a datos (SQL).
* `src/main/java/com/daw/cicd/controller`: Intermediario entre vista y repositorio.
* `src/main/java/com/daw/cicd/view`: Interfaz de usuario por consola.
