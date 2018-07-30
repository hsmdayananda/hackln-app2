from java:8
expose 8080
add /target/app2-1.0-SNAPSHOT.jar /opt/app2-1.0-SNAPSHOT.jar
workdir /opt
entrypoint ["java","-jar","app2-1.0-SNAPSHOT.jar"]