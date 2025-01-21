# ForoHubChallengeBackEnd

# API REST de ForoAPIrest

Este proyecto es una API RESTful construida con **Spring Boot 3** para la empresa **foroapirest**, que permite gestionar usuarios y tópicos de foro, usando autenticación basada en **JWT**.

## <b>Descripción General</b>

La API fue desarrollada con el objetivo de proporcionar una interfaz segura para la autenticación de usuarios y la gestión de contenido de foros. La autenticación se maneja mediante un sistema de **JWT (JSON Web Tokens)**, lo que garantiza que solo los usuarios autenticados puedan interactuar con los recursos.

Ha sido una gran experiencia trabajar en este proyecto, implementando la seguridad, los endpoints y optimizando la interacción con la base de datos.

## <b>Endpoints Implementados</b>

### <b>/auth/login</b> - **Iniciar sesión**

- **Método:** POST
- **Descripción:** Permite a un usuario autenticado iniciar sesión en la aplicación proporcionando su nombre de usuario y contraseña. Si la autenticación es exitosa, se genera un token JWT que debe usarse para futuras solicitudes.
- **Cuerpo de la solicitud:**
    ```json
    {
      "username": "usuario1",
      "password": "contraseña123"
    }
    ```
- **Respuesta exitosa:**
    ```json
    {
      "token": "jwt_token_aqui"
    }
    ```

### <b>/auth/register</b> - **Registrar usuario**

- **Método:** POST
- **Descripción:** Permite registrar un nuevo usuario en el sistema. Requiere que se proporcionen un nombre de usuario, una contraseña y otros detalles básicos.
- **Cuerpo de la solicitud:**
    ```json
    {
      "username": "nuevo_usuario",
      "password": "contraseñaSegura",
      "email": "usuario@correo.com"
    }
    ```
- **Respuesta exitosa:**
    ```json
    {
      "message": "Usuario registrado exitosamente"
    }
    ```

### <b>/topics</b> - **Obtener todos los tópicos**

- **Método:** GET
- **Descripción:** Devuelve una lista de todos los tópicos disponibles en el foro. Este endpoint requiere que el usuario esté autenticado.
- **Encabezados requeridos:**
    ```text
    Authorization: Bearer <jwt_token>
    ```
- **Respuesta exitosa:**
    ```json
    [
      {
        "id": 1,
        "titulo": "¿Cómo implementar Spring Boot?",
        "mensaje": "Este es un tema sobre la implementación de Spring Boot...",
        "fecha_creacion": "2025-01-01T10:00:00"
      },
      {
        "id": 2,
        "titulo": "Errores comunes en Java",
        "mensaje": "Aquí compartimos los errores más comunes en programación Java...",
        "fecha_creacion": "2025-01-02T15:00:00"
      }
    ]
    ```

### <b>/topics/{id}</b> - **Obtener un tópico por ID**

- **Método:** GET
- **Descripción:** Obtiene los detalles de un tópico específico a partir de su ID. Este endpoint también requiere autenticación.
- **Parámetros de la URL:**
    - `id`: ID del tópico a recuperar.
- **Encabezados requeridos:**
    ```text
    Authorization: Bearer <jwt_token>
    ```
- **Respuesta exitosa:**
    ```json
    {
      "id": 1,
      "titulo": "¿Cómo implementar Spring Boot?",
      "mensaje": "Este es un tema sobre la implementación de Spring Boot...",
      "fecha_creacion": "2025-01-01T10:00:00"
    }
    ```

### <b>/topics</b> - **Crear un nuevo tópico**

- **Método:** POST
- **Descripción:** Permite a un usuario autenticado crear un nuevo tópico en el foro.
- **Cuerpo de la solicitud:**
    ```json
    {
      "titulo": "Nuevo Tópico sobre Spring Security",
      "mensaje": "Aquí discutiremos la seguridad en aplicaciones Spring Boot..."
    }
    ```
- **Encabezados requeridos:**
    ```text
    Authorization: Bearer <jwt_token>
    ```
- **Respuesta exitosa:**
    ```json
    {
      "message": "Tópico creado exitosamente",
      "id": 3
    }
    ```

### <b>/topics/{id}</b> - **Actualizar un tópico por ID**

- **Método:** PUT
- **Descripción:** Permite actualizar un tópico existente. Solo el propietario del tópico o un administrador puede hacer esta operación.
- **Parámetros de la URL:**
    - `id`: ID del tópico a actualizar.
- **Cuerpo de la solicitud:**
    ```json
    {
      "titulo": "Actualización en Spring Boot",
      "mensaje": "Este es un mensaje actualizado sobre Spring Boot"
    }
    ```
- **Encabezados requeridos:**
    ```text
    Authorization: Bearer <jwt_token>
    ```
- **Respuesta exitosa:**
    ```json
    {
      "message": "Tópico actualizado exitosamente"
    }
    ```

### <b>/topics/{id}</b> - **Eliminar un tópico por ID**

- **Método:** DELETE
- **Descripción:** Permite eliminar un tópico por su ID. Esta operación requiere autenticación.
- **Parámetros de la URL:**
    - `id`: ID del tópico a eliminar.
- **Encabezados requeridos:**
    ```text
    Authorization: Bearer <jwt_token>
    ```
- **Respuesta exitosa:**
    ```json
    {
      "message": "Tópico eliminado exitosamente"
    }
    ```

## <b>Conclusión</b>

Este proyecto ha sido una gran experiencia. A lo largo del desarrollo, se implementaron funcionalidades clave como la autenticación segura con JWT, la creación de tópicos y la gestión de contenido dentro de la API REST, permitiendo una interacción fluida y segura para los usuarios. Gracias a **Spring Boot 3**, la implementación de la seguridad y la creación de endpoints fue sencilla y eficiente.

Esperamos que esta API sea útil para la empresa **foroapirest** y brinde una excelente experiencia a sus usuarios. ¡Gracias por confiar en este proyecto!
