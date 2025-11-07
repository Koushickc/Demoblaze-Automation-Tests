Demoblaze Automation Tests

Project Overview
This project contains automated test scripts for the (https://www.demoblaze.com/) web application.  
The goal of this project is to test key user flows such as Signup, Login, Product Selection, Add to Cart, and Purchase using Selenium and TestNG.

---

Tools and Technologies Used
- **Programming Language:** Java  
- **Automation Tool:** Selenium WebDriver  
- **Testing Framework:** TestNG  
- **Build Tool:** Maven  
- **Design Pattern:** Page Object Model (POM)  
- **Browser Used:** Google Chrome  


**How to Run the Tests**

Prerequisites
Before running the tests, make sure you have the following installed:
1. **Java JDK 11 or higher**  
2. **Apache Maven**  
3. **Google Chrome** browser  
4. **ChromeDriver** 


Steps to Execute
1. **Clone this repository**
   bash
   git clone https://github.com/Koushickc/Demoblaze-Automation-Tests.git

2. Open the project in your preferred IDE (Eclipse)

3. Install dependencies
4.  Maven will automatically download all dependencies from the pom.xml file.

5. Run the tests

6. Open the testng.xml file

7. Right-click and select Run As → TestNG Suite

8. View Test Reports

9. TestNG report is generated inside the folder:
test-output/index.html

10. If using Extent Reports, check the Reports folder.


**Test Scenarios Covered**
Signup Functionality

Verify signup popup opens correctly

Create a new user with valid data

Handle existing username error

Validate empty field warnings

Close popup without entering data

Login Functionality

Login with valid credentials

Login with invalid credentials

Login with empty fields

Validate alert handling for invalid users

Product Navigation & Cart

View products under Phones, Laptops, and Monitors

Add product to cart and verify success alert

Place an order successfully

Validate total amount and confirmation message
