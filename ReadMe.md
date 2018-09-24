# New York Time API Proof Of Concept

This utility is compiled to enable developers to kick-start new spring boot server within 5 minutes; saving the developers from writing all that boilerplate code. And that too as per swagger code standards.

## Purpose
Starting a new project takes time and energy. This utility will help you to generate spring boot based code project with the following advantages:

	
## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software and how to install them

```
* JDK 8+
* Maven
* GIT
```

### Installing

A step by step series of examples that tell you how to get a development env running

Clone the repository [POCAPIRepo](https://github.com/sardarwaqasahmed/POCAPIRepo.git) 

```
git clone https://github.com/sardarwaqasahmed/POCAPIRepo.git
```

Run the code generation utility

```
If on windows, Double click the �CodeGenerator.bat�. 
Otherwise, just edit the .bat file and run the commands.
```

Run the newly created project under "GeneratedProject"

```
cd GeneratedProject
mvn spring-boot:run
```

### Access the API - Get Article By ID

http://localhost:8080/api/v1/list/mostviewed/all-sections/7/100000006067838

### Access the API - Get All Articles

http://localhost:8080/api/v1/list/mostviewed/all-sections/7

- Port can be changed from GeneratedProject -> src -> main -> resources -> application.properties

## Team Members

* **Waqas Ahmed** 	- *Initial work* 	- 	architect_pakistan@hotmail.com
