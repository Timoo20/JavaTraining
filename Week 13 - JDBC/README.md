# Week 13 - Database Connectivity (JDBC)

Full task instructions: see `WEEK 13 - Practical - JDBC.docx` in the PRACTICALS folder.

**Files in this folder**

- `DBConnection.java` - connects to a MySQL database called `student_db`. Update the username/password if yours differ, and make sure the MySQL Connector/J driver is on your project's classpath.
- `InsertStudent.java` - inserts one student record using a PreparedStatement.
- `ViewStudents.java` - queries and prints every row in the `students` table.

Before running any of these, create the database and table yourself in MySQL:

```
CREATE DATABASE student_db;
USE student_db;
CREATE TABLE students (
    reg_no VARCHAR(20) PRIMARY KEY,
    name VARCHAR(100),
    course VARCHAR(100)
);
```
