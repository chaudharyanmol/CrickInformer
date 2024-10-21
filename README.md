CrickInformer - Live Scores and Match Analysis

It is a comprehensive solution designed to provide real-time live scores, player statistics, and in-depth match analysis. The application is built using Spring Boot, Spring JPA, Hibernate, MySQL, Angular, Tailwind CSS to ensure high performance and ease of development.

Features

Live Scores: Provides real-time score updates for ongoing matches. Match Analysis: Insightful analysis based on current and historical match data. Responsive UI: Built using Angular and Tailwind css, the user interface is responsive and accessible across devices. Backend: Spring Boot with Spring JPA and Hibernate for handling the persistence layer, making the application fast and scalable. Database: MySQL is used as the relational database to store match data, player information, and statistics.

**Tech Stack **

Backend: Spring Boot Spring JPA Hibernate ORM MySQL Frontend: Angular Tailwind css

Other Tools: Maven REST APIs

Project Setup

Clone the Repository

git clone https://github.com/your-repo/matchupdates.git
Backend Setup
Navigate to the CrickInformerbackend folder and build the Spring Boot application:
import the project to any ide like eclipse ide

Configure application.properties with your MySQL database details:

spring.datasource.url=jdbc:mysql://localhost:3306/databse name spring.datasource.username=your-username spring.datasource.password=your-password

Run the spring project

Frontend Setup
Navigate to the Crickinformerfrontend folder and install dependencies:
open project with any ide like vscode

Run the Angular Application:
bash ng serve 

Access the Application The app will be running on:
Frontend: http://localhost:prt-number Backend: http://localhost:8080/

Database Design Done by Hibernate automatically

Contributions

Contributions are welcome! Please follow the usual GitHub forking and pull request process.

Let me know if you'd like to add more details!
