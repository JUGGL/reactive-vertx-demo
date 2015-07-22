# Reactive Programming With Vert.x

## Overview
A simple example of Vert.x using the web API, request router, and event bus. There is 
also a class (Main.java) which shows how to start Vert.x from within a JavaSE/JavaEE 
application so that you can use Vert.x in conjunction with an existing Java application.

## Prerequisites
* Java >= 1.8.x
* Maven >= 3.0.0
* Internet Access

## Building
```bash
mvn clean package
```

## Running The Native Vert.x Application
```bash
mvn exec:java
```

## Running Vert.x From JavaSE
```bash
mvn clean package
java -jar target/vertx-1.0-SNAPSHOT-fat.jar us.juggl.reactive.vertx.Main
```
