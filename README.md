# robots_apocalypse
The year is 2050 and the world as we know it has been taken over by robots. Created as once friendly robots, have now turned against humankind, especially software engineers like yourself. Their mission is to transform everyone into mindless zombies for their entertainment. You as a resistance member (and the last survivor who knows how to code), was designated to develop a system to meet the following requirements

You will develop a REST API (yes, we care about architecture design even in the midst of a robot apocalypse!) which will store information about the survivors, as well as the resources they own.



	

 **Create MySQL database**


	create database robot_apocalypse_db


 **Change MySQL username and password as per your MySQL installation**

	+ open `src/main/resources/application.properties` file.

	+ change `spring.datasource.username` and `spring.datasource.password` properties as per your mysql installation
	
  

 **Run the app**

	You can run the spring boot app by typing the following command -

	```bash
	mvn spring-boot:run
	```

	The server will start on port 8080

	You can also package the application in the form of a `jar` file and then run it like so -

	```bash
	mvn package
	java -jar target/apocalypse 0.0.1-SNAPSHOT
  
   **Testing the Endpoints**
  . Use any API endpoint tester for my case I used Postman. The list of available endpoints are:

*Robots*
                   
   *List  All Robots: http://localhost:8080/robot/list*
   *List All flying robots: http://localhost:8080/robot/flying/list*



  *Survivors*
              
     *Add Survivor: http://localhost:8080/survivor/save*
     *List All Survivors: http://localhost:8080/survivor/list*
      *update survivors location: http://localhost:8080/survivor/location/update*
     *List Infected Survivors: http://localhost:8080/survivor/infected/list*
     *List Uninfected Survivors: http://localhost:8080/survivor/uninfected/list*
     *Survivors Infected Percentage: http://localhost:8080/survivor/infected/percentage*
     *Uninfected Survivors Percentage: http://localhost:8080/survivor/uninfected/percentage*
     *Flag Survivor As Infected: http://localhost:8080/survivor/flag/infected/{id}*
    *Find survivor by id: http://localhost:8080/survivor/find/by/{id}*
    *Delete survivor by id: http://localhost:8080/survivor/delete/{id}*
   
                     
   *List Land Robots: http://localhost:8080/robot/land/list*
 *list of robots*
*https://robotstakeover20210903110417.azurewebsites.net/robotcpu*
      
