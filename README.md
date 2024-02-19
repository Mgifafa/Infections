# Infections
this is the end of my world
# Zombie Apocalypse Survivor API

Welcome to the Zombie Apocalypse Survivor API! This API is designed to help survivors manage their resources and provide reports on the status of survivors and robots during the apocalypse.

## Table of Contents
- [Getting Started](#getting-started)
- [Endpoints](#endpoints)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

### Prerequisites
- Java 8 or higher
- Maven
- Git

### Installation
1. Clone the repository:

   git clone https://github.com/mgifafa/infections.git
Navigate to the project directory:
sh
Copy code
cd your-repo
Build the project using Maven:
sh
Copy code
mvn clean install
Running the Application
Run the Spring Boot application:
sh
Copy code
mvn spring-boot:run
The application will start on http://localhost:8080.
Endpoints
Survivor Management
POST /api/survivors: Add a new survivor to the database.
PUT /api/survivors/{id}/update-location: Update the last location of a survivor.
PUT /api/survivors/{id}/flag-infected: Flag a survivor as infected.
Reports
GET /api/reports/percentage-infected-survivors: Get the percentage of infected survivors.
GET /api/reports/percentage-non-infected-survivors: Get the percentage of non-infected survivors.
GET /api/reports/infected-survivors: Get a list of infected survivors.
GET /api/reports/non-infected-survivors: Get a list of non-infected survivors.
GET /api/reports/robots: Get a list of all robots.
Usage
Make HTTP requests to the provided endpoints using tools like cURL, Postman, or your preferred HTTP client.
Ensure proper data formatting and validation when sending requests to the API.
