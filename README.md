
---

# Stock Management Website

A web application developed using **Spring Boot** that allows users to manage stock data. The application supports full **CRUD** (Create, Read, Update, Delete) operations for stocks, with data stored in a SQL database. 

## Features

- **Add Stock**: Form to add new stock records.
- **View Stocks**: List all stocks with details.
- **Update Stock**: Edit details of existing stocks.
- **Delete Stock**: Remove stocks from the list.
- **Data Storage**: Stocks data is stored in a SQL database.
- **User Interface**: Modern and responsive design using **Thymeleaf**, **HTML**, **CSS**, and **Bootstrap**.

## Technologies Used

- **Spring Boot**: Backend framework for creating RESTful APIs and managing application logic.
- **Thymeleaf**: Server-side template engine for rendering HTML pages.
- **HTML/CSS**: For creating and styling the user interface.
- **Bootstrap**: Provides responsive design elements.
- **SQL Database**: Stores stock data.

## Getting Started

To get a local copy of the project up and running, follow these steps:

### Prerequisites

- **Java 11** or newer
- **Maven** for dependency management
- **SQL Database** (e.g., H2, MySQL)

### Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/Rohan-Rathod/Stock-Management-website.git
   ```
   
2. **Navigate to the Project Directory**
   ```bash
   cd Stock-Management-website
   ```
   
3. **Install Dependencies**
   ```bash
   ./mvnw install
   ```
   
4. **Run the Application**
   ```bash
   ./mvnw spring-boot:run
   ```

5. **Access the Application**
   Open your web browser and go to `http://localhost:8080`.

## Configuration

Update the `application.properties` file in `src/main/resources` to configure your SQL database connection.

Example for an MYSQL database:
```properties
spring.application.name=stocks
spring.datasource.url=jdbc:mysql://localhost:3306/stocks
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

```

## Usage

- **Add Stock**: Navigate to `/stocks/add` to add a new stock.
- **View Stocks**: Navigate to `/stocks` to view the list of stocks.
- **Update Stock**: Click on "Edit" next to a stock to update its details.
- **Delete Stock**: Click on "Delete" next to a stock to remove it.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.


## Contact

For any questions or feedback, please contact:

- **Email**: [your-email@example.com](mailto:rathodrohan8242@gmail.com)
- **LinkedIn**: [Your LinkedIn Profile](linkedin.com/in/rathodrohan222)

---
