# :email: Email Generation

![Custom badge](https://img.shields.io/badge/build-passing-brightgreen)
![Custom badge](https://img.shields.io/badge/build%20tool-maven-brightgreen)
![Custom badge](https://img.shields.io/badge/code%20analysis%20tools-spotbugs,%20checkstyle-orange)
![Custom badge](https://img.shields.io/badge/test%20framework-JUnit-blue)

This project implements an application for email auto-generation based on specific customer types. A company needs to
send customer specific emails to their different types of customers, i.e., Business, Returning, Frequent, New, and VIP.
This application generates emails from a base template for these different types of customers.

## Contents

- [Technologies](#technologies)
- [Implementation description](#implementation-description)
- [Installation](#installation)

## Technologies

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Maven](	https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

## Implementation description

### Factory Method Pattern

This project uses the factory method pattern, which 
defines an interface for creating an object, but let subclasses decide which class to instantiate.
This application has the following participants:

- Product: Customer
- ConcreteProduct: Business, Returning, Frequent, New, VIP
- Creator: Factory
- ConcreteCreator: CustomerFactory

### Software Design Principles

- Flexibility: Creating objects using factory method is more flexible than creating an object directly. 
  - ConcreteCustomer objects are created at runtime, which adds flexibility. 
  - Future products (i.e, type of customer) can be added by simply implementing the Customer interface. 
- Modularity: This application is divided into well-defined parts - creator and product.  
- Cohesion: Like-minded class are grouped together. For example, Business, Returning, etc. are in the product package.


## Installation

### How to compile the project

We use Apache Maven to compile and run this project.

You need to install Apache Maven (https://maven.apache.org/)  on your system.

Type on the command line:

```bash
mvn clean compile
```

### How to create a binary runnable package

```bash
mvn clean compile assembly:single
```

### How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" 
```

### Run all the unit test classes.

```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

### Using Spotbugs to find bugs in your project

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using

```bash
mvn spotbugs:gui 
```

or

```bash
mvn spotbugs:spotbugs
```

```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs.

For more info see
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.

### Run Checkstyle

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code
style. You can change it to other styles like sun checkstyle.

To analyze this example using CheckStyle run

```bash
mvn checkstyle:check
```

This will generate a report in XML format

```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser.

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```


