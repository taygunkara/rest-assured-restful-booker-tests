# [Restful-Booker](https://restful-booker.herokuapp.com/) API Automation

[![Codacy Badge](https://app.codacy.com/project/badge/Grade/287d42d255ee447da31f8f92bb554a12)](https://app.codacy.com?utm_source=gh&utm_medium=referral&utm_content=&utm_campaign=Badge_grade)

<a href="https://rest-assured.io/"><img src="https://avatars.githubusercontent.com/u/19369327?s=280&v=4" width="40" alt="Rest Assured"/></a>
<a href="https://testng.org/"><img src="https://e7.pngegg.com/pngimages/640/776/png-clipart-testng-logo-software-testing-software-framework-computer-icons-automation-testing-angle-text.png" height="40" alt="TestNG"/></a>
<a href="https://allurereport.org//"><img src="https://s3.eu-west-1.amazonaws.com/matrix.assets/cbnapp7fuq7flsqwoc9gn8hpo7ql" width="71" alt="Allure Report"/></a>

Welcome to the Booking API Automation project! This project is designed to perform automated tests for a booking system API using Java. It includes API tests and follows a structured approach for managing test data and configurations.

## Table of Contents
- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Maven Libraries Used](#maven-libraries-used)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Running Tests from Terminal](#running-tests-from-terminal)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Introduction

This project focuses on automating the testing of a booking API developed using Java and configured with Maven. The tests cover various operations such as creating, retrieving, updating, and deleting bookings.

### Key Features
- Comprehensive API tests for booking management
- Singleton pattern for managing configurations and data generation
- Support for partial and full updates, as well as health checks

## Technologies Used

- [Rest Assured](https://rest-assured.io/)
- [TestNG](https://testng.org/)
- [Allure Report](https://allurereport.org/)

## Maven Libraries Used
- [Rest Assured](https://mvnrepository.com/artifact/io.rest-assured/rest-assured)
- [TestNG](https://mvnrepository.com/artifact/org.testng/testng)
- [Maven Surefire](https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-surefire-plugin)
- [Faker](https://mvnrepository.com/artifact/com.github.javafaker/javafaker)
- [Jackson Databind](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind)
- [JSON In Java](https://mvnrepository.com/artifact/org.json/json)

## Project Structure

The project consists of the following main components:

- `apis`: Classes used for API calls and token management
- `models`: Data models representing booking and related information
- `tests`: Test cases for different booking operations
- `utils`: Utility classes for configuration and data generation
- `resources`: Configuration files and test resources

```plaintext
.
├── pom.xml
├── README.md
├── src
│   ├── main
│   └── test
│       ├── java
│       │   ├── apis
│       │   │   ├── applicationApi
│       │   │   │   ├── BookingApi.java
│       │   │   │   └── BookingHelper.java
│       │   │   ├── RestResources.java
│       │   │   ├── Routes.java
│       │   │   ├── SpecBuilder.java
│       │   │   └── TokenManager.java
│       │   ├── models
│       │   │   ├── Bookingdates.java
│       │   │   ├── Booking.java
│       │   │   └── BookingResponse.java
│       │   ├── tests
│       │   │   ├── CreateBookingTests.java
│       │   │   ├── DeleteBookingTests.java
│       │   │   ├── GetBookingIdsTests.java
│       │   │   ├── GetBookingTests.java
│       │   │   ├── HealthCheckTests.java
│       │   │   ├── PartialUpdateBookingTests.java
│       │   │   └── UpdateBookingTests.java
│       │   └── utils
│       │       ├── ConfigUtils.java
│       │       ├── FakerUtils.java
│       │       └── PropertiesUtils.java
│       └── resources
│           ├── config.properties
│           └── testng.xml
.
```
## Installation

To set up the project, follow these steps:
1. **Clone the repository**:
```bash
git clone https://github.com/taygunkara/rest-assured-restful-booker-tests.git
cd rest-assured-restful-booker-tests
```

2. **Open the project in your preferred Java IDE** (e.g., IntelliJ, Eclipse).
3. **Install the required dependencies** (Rest Assured, TestNG) using Maven. "Maven" -> "Update Project."

## Running Tests from Terminal

- **Run tests with parallel:**
```bash
mvn test -DsuiteXmlFile=testng.xml
```

- **View the Allure report in your browser:**
```bash
allure serve allure-results
```

## Contributing
Contributions are welcome! If you have any suggestions, bug reports, or feature requests, please open an issue or submit a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact
For any inquiries or further information, please contact me at:
- [Email](mailto:kara.taygun@gmail.com)
- [LinkedIn](https://www.linkedin.com/in/taygunkara/) 
