# Apache Camel Experiment Demo

This project demonstrates the use of **Apache Camel** to fetch data from a REST API and save it to a file, using Spring Boot as the application framework.

---

## Table of Contents
- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [How It Works](#how-it-works)
- [Setup Instructions](#setup-instructions)

---

## Project Overview
The application:
1. Triggers a timer every 30 seconds.
2. Fetches data from `https://jsonplaceholder.typicode.com/posts`.
3. Logs the fetched data.
4. Saves the data to a file named `fetchedData.txt` in the `data` directory.

---

## Technologies Used
- **Java**: Programming language.
- **Apache Camel**: Integration framework.
- **Spring Boot**: Application framework for easy setup and configuration.
- **Maven**: Dependency management.

---

## How It Works
1. **Timer Trigger**: A Camel timer triggers the route every 30 seconds.
2. **API Call**: The route sends a GET request to `https://jsonplaceholder.typicode.com/posts` and retrieves the response body.
3. **Logging**: Logs are generated at each step to track the flow of execution.
4. **File Writing**: The fetched data is saved to a file in the `data` directory.

---

## Setup Instructions

1. Clone the repository to your local machine.

2. Navigate to the project directory where the `pom.xml` file is located.

## Build and Package the Application

To build and package the application into a JAR file, run the following command:

```bash
mvn package


java -jar target/camel-example-spring-boot-1.0-SNAPSHOT.jar Apache.Camel.Experiment.demo.CamelApplication
