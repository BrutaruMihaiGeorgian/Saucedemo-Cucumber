---

## 📖 Descriere proiect

Acest proiect este o suită de teste automatizate pentru aplicația web **Saucedemo**, construită folosind **Java**, **Selenium WebDriver** și **Cucumber**. Scopul proiectului este de a valida funcționalitățile principale ale aplicației, precum autentificarea utilizatorilor, gestionarea produselor în coș, finalizarea comenzilor și navigarea între pagini.

Testele sunt organizate în scenarii BDD (Behavior-Driven Development), folosind fișiere `.feature` care descriu comportamentul așteptat al aplicației, și implementate în clase de tip **Step Definition** și **Page Object**, pentru o întreținere mai ușoară și un cod mai clar.

Structura proiectului permite rularea testelor individuale sau în grup, oferind rapoarte detaliate despre succesul sau eșecul fiecărui scenariu, facilitând astfel procesul de QA și verificarea regresiilor.


# Projects Automation Testing

This project contains automated tests for a web application using Selenium WebDriver and Java, following the Page Object Model (POM) design pattern.

## Test Overview
https://www.saucedemo.com
---

| Test Class           | Description                           |
|----------------------|---------------------------------------|
| `LoginTest`          | Validates the login functionality     |
| `AddToCartTest`      | Test adding one product to the cart   |
| `AddSixProductsTest` | Test adding six products to the cart  |
| `CheckoutTest`       | Full checkout flow including verification |
| `LogoutTest`         | Test the logout functionality         |
| `RemoveProductTest`  | Test remove product to the cart       |
---

## Project Structure

### Pages (Page Objects)

- **LoginPage.java** — handles login page interactions
- **InventoryPage.java** — handles inventory/products page actions
- **CartPage.java** — manages the shopping cart page interactions
- **CheckoutPage.java** — handles checkout page functionality
---
### Tests

- **BaseTest.java** — sets up and tears down WebDriver for tests
  - **LoginTest.java** — verifies user login functionality
  - **AddTocartTest.java** — tests adding a single product to the cart
  - **AddSixProductsTest.java** — tests adding six products to the cart
  - **CheckoutTest.java** — covers the full checkout process, including:
      - logging in
      - adding products to cart
      - filling checkout form
      - verifying overview page
      - completing order and validating confirmation
  - **LogoutTest.java** — verifies that the user is successfully logged out and redirected appropriately   
  - **RemoveFromCartTest.java** — tests removing products from the cart, including:
    logging in


---

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or higher
- Maven (for dependencies and running tests)
- An IDE such as IntelliJ IDEA (recommended)

### Installation

1. Clone the repository:

   ```bash
   git clone git clone https://github.com/BrutaruMihaiGeorgian/Projects_Automation_Testing.git

   ```

2. Open the project in your IDE.

3. Make sure Maven downloads dependencies.

### Running Tests

- Run tests from your IDE’s JUnit test runner
- Or run from command line with Maven:

  ```bash
  mvn test
  ```


## Future Enhancements

- Add more test cases for additional workflows
- Integrate test reporting and logs
- Connect with CI/CD for automated testing



## Author

**Mihai Brutaru**

Feel free to open issues or submit pull requests for improvements.



*Thank you for checking out this project!*
