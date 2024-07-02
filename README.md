# CalculatorWithExecutor

CalculatorWithExecutor is a Spring Boot application that demonstrates asynchronous execution of various mathematical calculations using an ExecutorService with a fixed thread pool. This project showcases how to leverage multithreading for concurrent tasks in Java Spring applications.

### Overview

The application includes a RESTful API endpoint `/api/calculator/calculate/{number}` that accepts an integer input and initiates several calculations concurrently:

- Calculate Square
- Calculate Cube
- Check Even/Odd
- Check Prime Number
- Calculate Factorial
- Calculate Reverse of the number
- Check Palindrome Number
- Check Armstrong Number

Each calculation is performed in its own thread to demonstrate multithreading capabilities.

## Technologies Used

- Java 8
- Spring Boot
- Maven

## Setup Instructions

1. **Clone the repository**

   ```bash
   git clone https://github.com/yourusername/CalculatorWithExecutor.git
   
## Usage

The application provides a RESTful API endpoint for performing various calculations asynchronously.

### Endpoint

- **URL**: `/calculatorapi/calculations/{number}`
- **Method**: `GET`
- **Description**: Initiates concurrent calculations for the given integer input.

### Example

To perform calculations for a specific number, send a GET request to the endpoint with the integer value:

 ## Contribution

If you have any suggestions or improvements, please feel free to create an issue or submit a pull request on GitHub.  
   
   
