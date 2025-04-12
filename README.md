# HealthTrack - Patient Medical Record System

A comprehensive healthcare management system built with Spring Boot and Java 17, designed to streamline patient medical records, appointments, and prescriptions.

## Features

- **User Management**
  - Patient registration and profile management
  - Doctor registration and profile management
  - Role-based access control (Admin, Doctor, Patient)

- **Appointment Management**
  - Schedule, reschedule, and cancel appointments
  - Real-time appointment status tracking
  - Appointment history and future bookings

- **Prescription Management**
  - Digital prescription creation and management
  - PDF prescription generation
  - Medication tracking and history

- **Security**
  - JWT-based authentication
  - Role-based authorization
  - Secure password encryption

## Tech Stack

- **Backend**
  - Java 17
  - Spring Boot 3.2.3
  - Spring Security
  - Spring Data JPA
  - MySQL Database
  - JWT Authentication
  - iText PDF Generation
  - Swagger/OpenAPI Documentation

## Prerequisites

- Java 17 or higher
- MySQL 8.0 or higher
- Maven 3.8.4 or higher

## Installation

1. Clone the repository:
```bash
git clone https://github.com/UDDITwork/HealthTrack4.git
```

2. Configure the database:
- Create a MySQL database named `healthtrack_db`
- Update the database credentials in `application.properties`

3. Build the project:
```bash
mvn clean install
```

4. Run the application:
```bash
mvn spring-boot:run
```

## API Documentation

Once the application is running, access the Swagger UI at:
```
http://localhost:8080/swagger-ui.html
```

## Project Structure

```
src/main/java/com/healthtrack/
├── config/           # Configuration classes
├── controller/       # REST API controllers
├── model/           # Entity and DTO classes
├── repository/      # JPA repositories
├── service/         # Business logic
├── security/        # Security configuration
└── exception/       # Exception handling
```

## API Endpoints

### Authentication
- `POST /api/auth/register/patient` - Register patient
- `POST /api/auth/register/doctor` - Register doctor
- `POST /api/auth/login` - User login
- `POST /api/auth/refresh-token` - Refresh JWT token

### Patient
- `GET /api/patients/profile` - Get patient profile
- `PUT /api/patients/profile` - Update patient profile
- `GET /api/patients/appointments` - Get appointments
- `GET /api/patients/prescriptions` - Get prescriptions

### Doctor
- `GET /api/doctors/profile` - Get doctor profile
- `PUT /api/doctors/profile` - Update doctor profile
- `GET /api/doctors/appointments` - Get appointments
- `POST /api/doctors/appointments` - Create appointment
- `POST /api/doctors/prescriptions` - Create prescription

### Admin
- `GET /api/admin/users` - Get all users
- `GET /api/admin/users/{id}` - Get user by ID
- `PUT /api/admin/users/{id}` - Update user status

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Contact

UDDIT - [@UDDITwork](https://github.com/UDDITwork) 