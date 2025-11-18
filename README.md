

# 🛍️ Ecommerce Backend

Backend del ecosistema **Ecommerce**, desarrollado con **Java 17** y **Spring Boot** (última versión al momento), siguiendo una arquitectura modular, limpia y escalable.

---

## 🏗️ Estructura del Proyecto

```
ecommerce-backend/
├── src/
│   ├── main/
│   │   ├── java/com/ecommerce/        # Código fuente principal
│   │   │   ├── config/                # Configuraciones globales
│   │   │   ├── modules/               # Módulos independientes
│   │   │   │   ├── users/             # Módulo de usuarios/autenticación
│   │   │   │   ├── products/          # Módulo de productos
│   │   │   │   ├── orders/            # Módulo de órdenes
│   │   │   │   ├── payments/          # Módulo de pagos
│   │   │   │   └── inventory/         # Módulo de inventario
│   │   ├── resources/
│   │   │   ├── application.yml        # Configuración central
│   │   │   └── static/                # Recursos estáticos
│   └── test/                          # Tests unitarios e integrados
├── pom.xml                             # Configuración Maven
├── .gitignore                          # Archivos ignorados por Git
└── README.md                           # Documentación del proyecto
```

---

## 🚀 Tecnologías

**Backend:**

* Java 17
* Spring Boot 3.5.7
* Spring Web
* Spring Data JPA 
* Spring Security + JWT
* Base de datos relacional (MySQL)
* Maven como gestor de dependencias
* Validación con Jakarta Validation
* MapStruct / ModelMapper (opcional)

**Testing:**

* JUnit 5
* Mockito
* Testcontainers (opcional)

---

## 📦 Arquitectura

El proyecto sigue una arquitectura modular basada en **Domain-Driven Design (DDD)** y **Clean Architecture**:

### `modules/*`

Cada módulo contiene:

* `controller/`
* `service/`
* `repository/`
* `model/` (entities)
* `dto/`
* `mapper/`
* `exception/`

Ventajas:

* Alta separación de responsabilidades
* Escalabilidad para microservicios en el futuro
* Fácil mantenimiento y testing

---

## 🛠️ Instalación

### **Prerrequisitos**

* Java 17 instalado
* Maven 3.9+
* Docker (opcional para DB)
* MySQL ejecutándose

---

### 🔧 **Clonar el repositorio**

```sh
git clone <repository-url>
cd ecommerce-backend
```

---

### 📥 Instalar dependencias

```sh
mvn clean install
```

---

## 🎯 Comandos Disponibles

### **Compilar el proyecto**

```sh
mvn clean install
```

### **Ejecutar la aplicación**

```sh
mvn spring-boot:run
```

### **Ejecutar tests**

```sh
mvn test
```

### **Crear build final**

```sh
mvn package
```

---

## 🏃‍♂️ Desarrollo

### Ejecutar el backend en modo desarrollo:

```sh
mvn spring-boot:run
```

La API estará disponible en:

👉 **[http://localhost:8080](http://localhost:8080)**

### Swagger / OpenAPI (si activado):

👉 **[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)**

---

## 📁 Configuración

### application.yml 

```yml
server:
  port: 8080

spring:
  datasource:
    url: jdbc:mysql://localhost:3306/ecommerce
    username: root
    password: root
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate.format_sql: true
```

---

## 🔐 Seguridad

El proyecto incluye:

* Autenticación con **JWT**
* Rutas públicas/privadas configurables
* Filtros personalizados en caso de ser necesarios
* Manejo centralizado de excepciones

---

## 🧩 Módulos Principales

### **Users**

* Registro, login, roles y permisos
* JWT y refresh tokens

### **Products**

* CRUD de productos
* Categorías
* Búsqueda y filtrado

### **Orders**

* Creación de órdenes
* Manejo de estados
* Cálculo de totales

### **Payments**

* Flujo de confirmación/cancelación

### **Inventory**

* Control de stock
* Reservas y decrementos automáticos

---

---

## 📌 Estándares del Proyecto

* Código documentado con JavaDoc
* DTOs para todo el intercambio con API
* Validaciones en capa de servicios
* Excepciones controladas y respuesta consistente
* Uso de ResponseEntity para todas las rutas

---

## 🤝 Contribuyendo

1. Crear rama:

```sh
git checkout -b feature/mi-feature
```

2. Realizar cambios
3. Crear Pull Request

---


