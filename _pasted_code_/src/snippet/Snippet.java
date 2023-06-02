package snippet;

public class Snippet {
	spring:
	  datasource:
	    url: jdbc:h2:mem:mydb
	    username: sa
	    password: password
	    driverClassName: org.h2.Driver
	  jpa:
	    spring.jpa.database-platform: org.hibernate.dialect.H2Dialec
}

