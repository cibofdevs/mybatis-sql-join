### Complete Guide to SQL Join Using MyBatis and Spring Boot

Create `Employee` and `Department` Tables:

```sql
CREATE TABLE Employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    department_id INT
);

CREATE TABLE Department (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

```

Insert sample data:

```sql
INSERT INTO Employee (name, department_id) VALUES 
('John Doe', 1), 
('Jane Smith', 2),
('Michael Johnson', NULL),
('Emily Davis', 3),
('William Brown', 1);

INSERT INTO Department (name) VALUES 
('HR'), 
('Finance'), 
('IT');

```

Article Link: https://medium.com/@cibofdevs/complete-guide-to-sql-join-using-mybatis-and-spring-boot-e9cbc28fe8a3