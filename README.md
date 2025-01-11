# Project: Amit3

This project is designed to automate the signup process using Selenium, TestNG, Cucumber, and Extent Reports.

## Project Structure
This project uses Maven as the build tool and contains the following components:

- **Selenium**: For web automation.
- **TestNG**: For test execution and reporting.
- **Cucumber**: For BDD-style test definitions.
- **Extent Reports**: For detailed test reporting.

## Prerequisites
Make sure you have the following installed:

- Java 23 or later
- Maven
- A compatible web driver (e.g., ChromeDriver)

## Dependencies

The project includes the following dependencies:

- **Selenium**: For web browser automation.
- **TestNG**: For test management.
- **Cucumber**: For Behavior-Driven Development (BDD).
- **ExtentReports Cucumber Adapter**: For generating rich test reports with Cucumber integration.

## Setup Instructions

### Clone the repository
```bash
git clone https://github.com/your-username/Amit3.git
cd Amit3
```

### Build the Project

To build the project, use Maven:

```bash
mvn clean install
```

### Run the Tests

To run the Cucumber tests, you can use the following Maven command:

```bash
mvn test
```

This will trigger the execution of the test scenarios written in Cucumber.

## Feature: SignUp

The application automates the user signup process, with two primary scenarios:

1. **Valid SignUp**: This scenario tests if the user can sign up with correct details.
2. **Invalid SignUp**: This scenario tests different invalid signup cases by using a variety of inputs in the examples.

### Scenarios

#### Scenario 1: Valid SignUp

```gherkin
Feature: SignUp

  Scenario: valid SignUp
    Given user clicks on login signup button
    When user enters name
    And user enters Email
    And user clicks on signup button
    When user enters password
    And user enters First name
    And user enters Last name
    And user enters Address
    And user selects country
    And user enters State
    And user enters City
    And user enters zipcode
    And user enters Mobile Number
    And user clicks on Create Account button
    Then user can sign up successfully
```

#### Scenario 2: Invalid SignUp (with examples)

```gherkin
  Scenario Outline: invalid SignUp
    Given user clicks on login signup button
    When user enters name
    And user enters Email "<Email>"
    And user clicks on signup button
    When user enters password
    And user enters first name "<First name>"
    And user enters last name "<Last name>"
    And user enters Address "<Address>"
    And user selects "<country>"
    And user enters State
    And user enters City
    And user enters zipcode
    And user enters Mobile Number
    And user clicks on Create Account button
    Then user cannot sign up successfully

  Examples:
    | First name | Last name  | Address | country | Email                      |
    | ali        | 666666666  | ####### | Egypt   | ahmed2g2@gmail.com          |
    | 666666666  | 666666666  | ####### | Canada  | ahmed2a2h@gmail.com         |
```

### Directory Structure
- **src/main/java**: Contains Java code for the automation framework.
- **src/test/resources**: Contains feature files written in Gherkin syntax.
- **target**: Generated reports and compiled class files.

### Report Generation

After running the tests, ExtentReports will generate detailed reports. You can find the reports in the `target` directory.

## Maven Configuration

The `pom.xml` file includes the necessary configurations to run the project with Maven. It specifies the following:

- **Selenium** version 4.27.0
- **TestNG** version 7.10.2
- **Cucumber** version 7.20.1
- **Extentreports Cucumber Adapter** version 1.14.0

It also configures Maven to compile the project with Java 23.

## Example pom.xml Dependencies

```xml
<dependencies>
    <!-- selenium -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.27.0</version>
    </dependency>

    <!-- testng -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.10.2</version>
        <scope>test</scope>
    </dependency>

    <!-- cucumber -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.20.1</version>
    </dependency>

    <!-- cucumber testng -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-testng</artifactId>
        <version>7.20.1</version>
    </dependency>

    <!-- ExtentReports Cucumber Adapter -->
    <dependency>
        <groupId>tech.grasshopper</groupId>
        <artifactId>extentreports-cucumber7-adapter</artifactId>
        <version>1.14.0</version>
    </dependency>
</dependencies>
```

## Conclusion

This project provides a framework for automating a user signup process with Selenium WebDriver, TestNG, and Cucumber, along with detailed reporting using Extent Reports. It includes valid and invalid signup scenarios and is easily customizable for different testing needs.

---

If you encounter any issues, feel free to open an issue in the repository.