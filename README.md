
## REST Web Service using Spring Boot + JPA + Hibernate + H2 database for Angular 6 application

REST web service will expose methods for create, read, update and delete operation. If the client application is running on different domain from web service domain, then the Spring Boot web service controller will configure client domain URL using @CrossOrigin annotation to handle Cross-Origin-Resource-Sharing (CORS). If the client is running on http://localhost:4200, @CrossOrigin(origins = {"http://localhost:4200"}) will be added to public class ArticleController as annotation.

>1.	http://start.spring.io/ check Spring Boot Development Tools, Full-stack web development with Tomcat, Spring MVC, Document RESTful services by combining hand-written and auto-generated documentation
Java Persistence API including spring-data-jpa, spring-orm and Hibernate
H2 database (with embedded support)

>2.	create mvn project in Intellij with folder created from step 1

>3.	create Entity, DAO, Service and Controller interfaces and classes. 

>4.	do mvn clean build

>5.	deploy jar by java –jar –Dserver.port=8080 target/xxxx.jar

>6.	Postman http://localhost:8080//user/all-articles “GET”

>[
    {
        "articleId": 4,
        "title": "Newton's Laws - HyperPhysics Concepts",
        "url": "http://hyperphysics.phy-astr.gsu.edu/hbase/Newt.html",
        "category": "Physics"
    },
    {
        "articleId": 3,
        "title": "Newton's Second Law",
        "url": "https://isaacphysics.org/concepts/cp_newtonii",
        "category": "Physics"
    },
    {
        "articleId": 2,
        "title": "Java Tutorial",
        "url": "https://www.tutorialspoint.com/java/",
        "category": "Computer Science"
    },
    {
        "articleId": 1,
        "title": "Angular 2 - CLI",
        "url": "https://www.tutorialspoint.com/angular2/angular2_cli.htm",
        "category": "Computer Science"
    }  
]  

===========================
just add another repository
+To add method patch
