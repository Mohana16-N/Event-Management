# Event Management Application

This is a Spring Boot-based Event Management application designed to simplify the organization and management of events. It includes robust features for managing feedback, user registrations, and event administration.

## Features

- **Event Creation**: Organizers can create new events with details such as name, date, location, and description.
- **User Registration**: Users can register for events and receive confirmations.
- **Feedback Management**: Users can provide feedback for events, and organizers can view and manage feedback submissions.
- **Admin Dashboard**: Admins can manage events, view registrations, and oversee feedback submissions.

## Prerequisites

Before running the application, ensure you have the following installed:

- [Java Development Kit (JDK) 8 or higher](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [MySQL](https://dev.mysql.com/downloads/)

## Getting Started

1. **Clone the repository**:

   ```bash
   git clone https://github.com/Mohana16-N/Event-Management.git
   cd Event-Management



## Configure the database:

**Create a MySQL database named event_management**.

Update the database configuration in src/main/resources/application.properties:

```properties 
spring.datasource.url=jdbc:mysql://localhost:3306/event_management
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password


Build the application:
```bash
mvn clean install

## Run the application:
```bash
mvn spring-boot:run
The application will start on http://localhost:8080.

## Usage
Access the application at http://localhost:8080.
Navigate through the interface to explore features such as event management, user registrations, and feedback collection.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact
For any inquiries or support, please contact [gagankotian890@gmail.com, mohanan16122003@gmail.com ](mailto:gagankotian890@gmail.com).
