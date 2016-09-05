#momentous-api

## Status

[![Build Status](https://travis-ci.com/agrojas/momentous-api.svg?token=EbKmqbdiPyUppeAsrpJo&branch=master)](https://travis-ci.com/agrojas/momentous-api)

## Getting Started

To get you started you can simply clone the momentous-api repository and install the dependencies:

### Use API

You can use API in [https://momentous-api.herokuapp.com/menus](https://momentous-api.herokuapp.com/menus) 

Group By options:
```
momentous-api.herokuapp.com/menus?groupBy=<field>
<field> = [price]

```

### Prerequisites

You need git to clone the angular-seed repository. You can get git from
[http://git-scm.com/](http://git-scm.com/).

You need java to run 
[http://git-scm.com/](https://www.java.com).

You need maven
[http://git-scm.com/](https://maven.apache.org/).

### Clone momentous-api

Clone the momentous-api repository using [git](http://git-scm.com/):

```
git clone https://github.com/agrojas/momentous-api.git
cd momentous-api
```

### Compile

Run maven command

```
mvn compile
```

### Install

Run maven command

```
mvn clean install
```
### Run

Run maven command

```
mvn spring-boot:run
```

## Directory Layout

```
|-src
   |---main
   |-----java
   |-------com
   |---------agrojas
   |-----------controller
   |-----------exception
   |-----------filter
   |-----------model
   |-----------service
   |-----resources
   |-------static
   |---test
   |-----java
   |-------com
   |---------agrojas
   |-target
   |---classes
   |-----com
   |-------agrojas
   |---------controller
   |---------exception
   |---------filter
   |---------model
   |---------service
   |-----META-INF
   |-------maven
   |---------com.agrojas
   |-----------momentous-api
   |-----static
   |-------css
   |-------js
   |---------menu
   |---generated-sources
   |-----annotations
   |---generated-test-sources
   |-----test-annotations
   |---maven-archiver
   |---maven-status
   |-----maven-compiler-plugin
   |-------compile
   |---------default-compile
   |-------testCompile
   |---------default-testCompile
   |---surefire-reports
   |---test-classes
   |-----com
   |-------agrojas


```


## Testing


### Running Unit Tests

The momentous-api comes preconfigured with unit tests. These are written in
[JUnit](http://junit.org/junit4/) 
The easiest way to run the unit tests is:

```
mvn test
```

## Continuous Integration

### Travis CI

[Travis CI](https://travis-ci.com) is a continuous integration service, which can monitor GitHub for new commits
to your repository and execute scripts such as building the app or running tests. The angular-seed
project contains a Travis configuration file, `.travis.yml`, which will cause Travis to run your
tests when you push to GitHub.

You will need to enable the integration between Travis and GitHub. See the Travis website for more
instruction on how to do this.


## Deploy

### Heroku
```
heroku create
git push heroku master
heroku open
```
