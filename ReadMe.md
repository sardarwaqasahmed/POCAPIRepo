#Project Title

#NY Times Most Popular Articles Proof Of Concept

We'll be going to use the "most viewed section" of NY Times API and build a Master/Detail APP for articles available.

## Purpose

Purpose of this POC project is to build a simple app that will hit NY Times Most Popular Articles API, and show a list of articles.
Once articles are showed as list on device then user will tapped on list and the article details will be shown for that particular article.
	
## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software and how to install them

```
* JDK 8+
* Maven
* GIT
* Spring Boot 2.0
* Spring WebFlux 2.0.5
* Spring Tool Suite
```

### Installing

A step by step series of examples that tell you how to get a development env running

Clone the repository [POCAPIRepo](https://github.com/sardarwaqasahmed/POCAPIRepo.git) 

```
git clone https://github.com/sardarwaqasahmed/POCAPIRepo.git
```

Import the project in Spring tool suite as maven project

```
Right click on project in project explorer and run using spring boot
Run As -> Spring Boot App
```

Or if you have maven env var configure in your local machine then

```
cd Go to NYTimesAPI root directoy and issue below command
mvn spring-boot:run
```

### Access the API - Get All Articles

http://localhost:8080/api/v1/list/mostviewed/all-sections/7

### Access the API - Get ArticleDetail By ID

http://localhost:8080/api/v1/list/mostviewed/all-sections/7/100000006114484


## Team Members

* **Waqas Ahmed** 	- *Initial work* 	- 	architect_pakistan@hotmail.com
