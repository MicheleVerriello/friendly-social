# Use a base image with Tomcat
FROM tomcat:latest

# Remove the existing ROOT application
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Copy the Spring Boot application WAR file into the Tomcat webapps directory
COPY target/friend-events-apis-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Expose the port on which the Tomcat server will run
EXPOSE 8081

# Start Tomcat when the container starts
CMD ["catalina.sh", "run"]