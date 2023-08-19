# RestApiReview

I will explain everything I do and why I do it. this project is in case in the next 4 days i get an interview about my
experience and I am at the family business. Please enjoy the comments and no judging i have started doing this at 12 am

tools used: Java, Spring boot, mySQL, CHATGPT

Updates to be done later:
- use VIN instead of ID as the primary key because the possibility of the car being sold again on the platform, we can refer to the old ID


### First Commit Aug/17

- Generated Spring from start.spring.io using
-
    - Java 17 (the language i enjoy working with)
-
    - Sprnig Boot (Framework and makes your life easy for real, read 4 books about it and yet i get paranoid as if i am
      new when someone asks me about it)
-
    - Maven (Builderrrrrrr, i know how to use it and i used to know how it works)
-
    - Few Dependencies (Dev Tools (No Restarts while Coding) , Spring Web (Well you cant say Rest without Spring Web))

### Second Commit Aug/17

- Created a Controller package (Still Don't know what i wanna do and its late and i am writting Python on Java LoL)
- DriverController created for test

### Third Commit Aug/17

- Fixed first commit and said what dependencies (added lombok too saves time with annotations about getters, setters,
  etc), you can see lombok use in Car class
- Created a model with Car Class
- showed path variable tech in ShowRoomController
- using req params and test with Postman (the tool we use to test the APIs)
- Created a Register Car Method in ShowRoomController
- Created a Remove Car Method in ShowRoomController
- added name and version in properties
- added app details GetMapping in ShowRoom
- used @Value annotation to get values (i put) in the application.properties
- added Update Method
- time for 1 hour nap

### Fourth Commit Aug/17
- Needed more sleep apparently
- after long thinking i am going to build a CarFax CLone
- added seller class for now
- Created a Service Class for getting list of Cars (interface and Implemntation)
- added static values to a list so we can test on Postman
- added /api/v1/ in properties (so it looks like i know what i am doing)
- Now i am taking a break from this for today and i want to start looking back at Python & Databases

### Fifth Commit Aug/19
- Modified the pom.xml where we excluded snake from spring
- Created a MYSQL DB
- Added few dependencies (MYSQL Driver : connect to mySQL DB, Spring Data JPA: connect to mySQL, ORM to interact with DB)
- added mySQL db info to the app properties
- in the car class assign the entity and table annotations and assign columns to variables
- added the id var and column because it's the primary key, but later I might use the vin as primary-key and the id for the website count (what if the same car get sold twice) 
- next commit will be working on the repository

### Sixth Commit Aug/19
- added CarRepository interface extending JPA Repo
- auto-wire the CarRepo in the service class and refer it in the getCars()
- Didn't work since i had to restart the spring and i forgot it act like that SMH spent 20 minutes thinking i was doing somthing wrong
- Another error because i wrote wrong table name opsss!
- you can't add variables not in the table of the model
- i am doing this while working ... confusing but it worked i can read the database
- in car class switch generation type to IDENTITY instead of auto as hypernet v5 or later doesn't work with it
- added Add A Car service
- added Remove A Car service
- added Update A Car Info service
- finally i am remembering how to write :)