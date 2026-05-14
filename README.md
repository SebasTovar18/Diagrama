# 🎓 Plataforma de Gestión de Cursos Online

## 📖 Descripción del Sistema

Este proyecto representa una plataforma de cursos online desarrollada en Java aplicando Programación Orientada a Objetos (POO), diagramación UML y principios SOLID.

El sistema permite gestionar:
- Usuarios
- Cursos
- Módulos
- Contenidos educativos
- Comentarios
- Notificaciones
- Recursos descargables
- Exámenes evaluables

Además, se implementan relaciones UML como herencia, composición, asociación e interfaces.

---

# 👥 Integrantes

| Nombre | Correo |
|--------|--------|
| Sebastian Tovar | sebastian@gmail.com |

---

# 📊 Diagrama UML

Imagen


<img width="14611" height="13524" alt="DiagramaCursos" src="https://github.com/user-attachments/assets/f2f47073-44fa-4c49-8ef3-1976beec9b0f" />



Archivo:

# 📁 Estructura del Proyecto

```text
src/
└── com/
    └── plataforma/
        ├── interfaces/
        │   ├── Descargable.java
        │   ├── Evaluable.java
        │   └── Notificable.java
        │
        ├── model/
        │   ├── Usuario.java
        │   ├── Estudiante.java
        │   ├── Instructor.java
        │   ├── Administrador.java
        │   ├── Curso.java
        │   ├── Modulo.java
        │   ├── ContenidoCurso.java
        │   ├── Leccion.java
        │   ├── Actividad.java
        │   ├── Recursos.java
        │   ├── Examen.java
        │   ├── Comentario.java
        │   └── Notificacion.java
        │
        ├── service/
        │   └── ServicioNotificacion.java
        │
        └── Main.java
```

---

# 🔗 Explicación de Relaciones UML

## 🔹 Herencia (──▷)

### Usuario
Las clases:
- Estudiante
- Instructor
- Administrador

heredan de la clase `Usuario`.

### Justificación
Comparten atributos comunes:
- id
- nombre
- email
- contraseña

pero cada una tiene características específicas.

---

### ContenidoCurso
Las clases:
- Leccion
- Actividad
- Recursos
- Examen

heredan de la clase abstracta `ContenidoCurso`.

### Justificación
Todos son tipos de contenido educativo y comparten:
- id
- titulo
- duracion
- completado

---

# 🔹 Composición (◆───)

## Curso ◆─── Modulo

### Multiplicidad
- 1 Curso → 1..* Modulos

### Justificación
Un módulo pertenece a un curso y no tiene sentido fuera de él.

---

## Modulo ◆─── ContenidoCurso

### Multiplicidad
- 1 Modulo → 0..* Contenidos

### Justificación
Los contenidos existen dentro de un módulo específico.

---

# 🔹 Asociación (─────)

## Comentario ───── Estudiante

### Multiplicidad
- 1 Estudiante → 0..* Comentarios

---

## Comentario ───── Curso

### Multiplicidad
- 1 Curso → 0..* Comentarios

---

## Notificacion ───── Usuario

### Multiplicidad
- 1 Usuario → 0..* Notificaciones

### Justificación
Las notificaciones y comentarios dependen de usuarios y cursos para existir dentro del sistema.

---

# 🔹 Interfaces e Implementación (- - -▷)

## Recursos implementa Descargable
Permite descargar archivos educativos.

---

## Examen implementa Evaluable
Permite presentar evaluaciones dentro del sistema.

---

## ServicioNotificacion implementa Notificable
Permite enviar notificaciones a los usuarios.

---

# 🔢 Multiplicidades UML

| Multiplicidad | Significado |
|---|---|
| 1 | Exactamente uno |
| 0..* | Cero o muchos |
| 1..* | Uno o muchos |
| 0..1 | Opcional |

### Ejemplo
Un curso puede tener muchos módulos, pero cada módulo pertenece únicamente a un curso.

---

# 🛠️ Aplicación de Principios SOLID

En esta entrega se aplicaron los principios SOLID para mejorar la organización, mantenibilidad y escalabilidad del sistema.

### 1. Single Responsibility Principle (SRP)
Cada clase tiene una única responsabilidad dentro del sistema.

- `ServicioNotificacion` se encarga únicamente del envío de notificaciones.
- `Curso` administra módulos.
- `Modulo` administra contenidos.
- `Comentario` representa únicamente los comentarios realizados por estudiantes.

Esto evita mezclar múltiples responsabilidades en una sola clase.

---

### 2. Open/Closed Principle (OCP)
El sistema está abierto a la extensión pero cerrado a la modificación.

Gracias a la clase abstracta `ContenidoCurso`, es posible crear nuevos tipos de contenido como `Taller` o `Quiz` sin modificar las clases existentes.

Actualmente las clases:
- `Leccion`
- `Actividad`
- `Recursos`
- `Examen`

extienden de `ContenidoCurso` y reutilizan su estructura base.

---

### 3. Liskov Substitution Principle (LSP)
Las subclases pueden reemplazar a su clase padre sin afectar el funcionamiento del sistema.

Por ejemplo:
- `Leccion`
- `Actividad`
- `Recursos`
- `Examen`

pueden utilizarse como objetos de tipo `ContenidoCurso` dentro de la lista de contenidos del `Modulo`.

Esto permite manejar diferentes tipos de contenido de forma polimórfica.

---

### 4. Interface Segregation Principle (ISP)
El sistema utiliza interfaces pequeñas y específicas para evitar implementar métodos innecesarios.

- `Recursos` implementa `Descargable`
- `Examen` implementa `Evaluable`
- `ServicioNotificacion` implementa `Notificable`

Cada clase implementa únicamente el comportamiento que realmente necesita.

---

### 5. Dependency Inversion Principle (DIP)
Las clases dependen de abstracciones y no de implementaciones concretas.

Por ejemplo, `ServicioNotificacion` trabaja mediante la interfaz `Notificable`, permitiendo cambiar el sistema de notificaciones sin afectar otras partes del proyecto.

Esto facilita el desacoplamiento y futuras mejoras del sistema.

---

# 🧩 Clases Implementadas

| Clase | Tipo | Descripción |
|---|---|---|
| Usuario | Base | Clase base para usuarios |
| Estudiante | Concreta | Representa estudiantes |
| Instructor | Concreta | Representa instructores |
| Administrador | Concreta | Representa administradores |
| ContenidoCurso | Abstracta | Clase base para contenidos |
| Leccion | Concreta | Lecciones en video |
| Actividad | Concreta | Actividades académicas |
| Recursos | Concreta | Recursos descargables |
| Examen | Concreta | Evaluaciones del curso |
| Curso | Concreta | Gestión de cursos |
| Modulo | Concreta | Organización de contenidos |
| Comentario | Concreta | Comentarios de estudiantes |
| Notificacion | Concreta | Mensajes para usuarios |
| ServicioNotificacion | Servicio | Envía notificaciones |

---

# ▶️ Ejecución del Proyecto

Compilar:

```bash
javac com/plataforma/Main.java
```

Ejecutar:

```bash
java com.plataforma.Main
```

---

# 💻 Tecnologías Utilizadas

- Java
- UML
- Visual Studio Code
- GitHub

---

# 📌 Conceptos Aplicados

- Programación Orientada a Objetos
- Herencia
- Polimorfismo
- Encapsulamiento
- Abstracción
- Interfaces
- Clases abstractas
- Relaciones UML
- Principios SOLID

---

# 📚 Proyecto Académico

Proyecto realizado para la asignatura:

**Programación y Diseño Orientado a Objetos**  
Corhuila — 2026
