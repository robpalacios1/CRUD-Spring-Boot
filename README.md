# CRUD API de Estudiantes con Spring Boot

Imagina que tienes una libreta de contactos digital solo para estudiantes. Este proyecto es exactamente eso. Es un programa que te permite **agregar**, **ver**, **buscar** y **eliminar** la información de los estudiantes de una lista.

Toda la comunicación con este programa se hace a través de una API.

## ✨ Herramientas Utilizadas


* **Spring Boot**: Es el "cerebro" del proyecto. Un sistema que nos ayuda a construir la aplicación de forma muy rápida y eficiente.
* **Spring Web**: Es la parte que se encarga de recibir las "órdenes" o peticiones que llegan por internet (por ejemplo, "quiero ver la lista de estudiantes").
* **Spring Data JPA**: Es el encargado de hablar con la base de datos. Su trabajo es guardar, buscar y borrar la información de los estudiantes.
* **Lombok**: Una herramienta que nos ahorra escribir mucho código que suele ser repetitivo y aburrido.
* **Postman**: El programa que usamos para enviar las "órdenes" a nuestra aplicación y probar que todo funcione correctamente.

---

## 🔌 Las Órdenes que Entiende el Programa

Para interactuar con el programa, debes usar la siguiente dirección base en tus peticiones locales: `http://localhost:8080/api/v1/students`

| Qué quieres hacer                      | Orden (Método y Endpoint) | Explicación                                                               |
| :------------------------------------- | :------------------------ | :-------------------------------------------------------------------------|
| **Ver la lista completa**              | `GET`  `/`                | Pide la lista con la información de todos los estudiantes.                |
| **Buscar un solo estudiante**          | `GET`  `/{id}`            | Pide los datos de un estudiante usando su número de identificación.       |
| **Agregar un nuevo estudiante**        | `POST` `/`                | Envía los datos de un estudiante nuevo para guardarlo en la lista.        |
| **Eliminar un estudiante**             | `DELETE` `/{id}`          | Da la orden de borrar a un estudiante usando su número de identificación. |

---

## 🚀 Cómo Probarlo con Postman

Postman es una aplicación que nos permite "hablar" con nuestro programa. Así es como le das cada orden:

### **1. Agregar un Estudiante Nuevo (POST)**

* **Tipo de orden:** `POST`
* **Dirección:** `http://localhost:8080/api/v1/students`
* En la sección **Body** -> **raw** -> **JSON**, escribe los datos del nuevo estudiante:

```json
{
    "firstName": "Julian",
    "lastName": "Mancilla",
    "email": "julian@example.com"
}
```

* Respuesta del programa: Te devolverá los mismos datos, pero ahora con un número de identificación (studentId).

```json
{
    "studentId": 1,
    "firstName": "Julian",
    "lastName": "Mancilla",
    "email": "julian@example.com"
}
```

### 2. Pedir la Lista Completa de Estudiantes (GET)
* **Tipo de orden:**: `GET`
* **Dirección:**: `http://localhost:8080/api/v1/students`
* **Respuesta del programa**: Te mostrará una lista con todos los estudiantes que has guardado.

```json
[
    {
        "studentId": 1,
        "firstName": "Julian",
        "lastName": "Mancilla",
        "email": "julian@example.com"
    },
    {
        "studentId": 2,
        "firstName": "Maria",
        "lastName": "Contreras",
        "email": "maria@example.com"
    }
]
```

### 3. Pedir un Estudiante por su ID (GET)
* **Tipo de orden**: `GET`
* **Dirección**: `http://localhost:8080/api/v1/students/1` (el 1 es el ID del estudiante que buscas).
* **Respuesta del programa**: Te dará la información únicamente del estudiante con ese ID.

```json
{
    "studentId": 1,
    "firstName": "Julian",
    "lastName": "Mancilla",
    "email": "julian@example.com"
}
```

### 4. Eliminar un Estudiante (DELETE)
* **Tipo de orden**: `DELETE`
* **Dirección**: `http://localhost:8080/api/v1/students/1` (el 1 es el ID del estudiante que quieres borrar).
* **Respuesta del programa**: Si todo sale bien, no te mostrará ningún dato, solo un mensaje de "OK", confirmando que el estudiante fue eliminado.
