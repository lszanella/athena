FROM tomcat:8.0
MAINTAINER lucas
# COPY path-to-your-application-war path-to-webapps-in-docker-tomcat
COPY /target/backend.war /usr/local/tomcat/webapps/