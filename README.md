# robots_apocalypse
This is simple Spring boot REST API  which  stores information about the robot apocalypse survivors as well as the resources they own. It also consumes robot API and is able to keep track of all existing robots.
## Steps to Setup the Spring Boot Back end app (robots_apocalypse)

1. **Clone the application**

	

2. **Create MySQL database**


	create database robot_apocalypse_db


3. **Change MySQL username and password as per your MySQL installation**

	+ open `src/main/resources/application.properties` file.

	+ change `spring.datasource.username` and `spring.datasource.password` properties as per your mysql installation
	
  

4. **Run the app**

	You can run the spring boot app by typing the following command -

	```bash
	mvn spring-boot:run
	```

	The server will start on port 8080

	You can also package the application in the form of a `jar` file and then run it like so -

	```bash
	mvn package
	java -jar target/apocalypse 0.0.1-SNAPSHOT
  
  4. **Testing the Endpoints**
  5. Use any API endpoint tester for my case I used Postman. The list of available endpoints are:

*Robots*
                   
  22. **List  All Robots: http://localhost:8080/robot/list
  23. **List All flying robots: http://localhost:8080/robot/flying/list



  *Survivors*
              
    **Add Survivor: http://localhost:8080/survivor/save 
    **List All Survivors: http://localhost:8080/survivor/list
   **update survivors location: http://localhost:8080/survivor/location/update
   **List Infected Survivors: http://localhost:8080/survivor/infected/list
   **List Uninfected Survivors: http://localhost:8080/survivor/uninfected/list
   **Survivors Infected Percentage: http://localhost:8080/survivor/infected/percentage
   **Uninfected Survivors Percentage: http://localhost:8080/survivor/uninfected/percentage
    **Flag Survivor As Infected: http://localhost:8080/survivor/flag/infected/{id}
   **Find survivor by id: http://localhost:8080/survivor/find/by/{id}
   **Delete survivor by id: http://localhost:8080/survivor/delete/{id}
   
                     
   *List Land Robots: http://localhost:8080/robot/land/list
 
      
