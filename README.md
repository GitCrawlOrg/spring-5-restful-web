# spring-5-restful-web

Port used = 8089
```shell script
server.port=8089
```
1. HelloWorld using Request Mapping
```java
   @RequestMapping(method= RequestMethod.GET,path="/requestMapping")
```
http://localhost:8089/api/v0/hello-world/requestMapping

2. GetMapping
```java
@GetMapping(path="/getMapping")
```
http://localhost:8089/api/v0/hello-world/getMapping

3. GettMapping returning a bean (JSON Response)
```java
@GetMapping(path="/getBean")
public HelloWorldReturnBean helloWorldReturnBean() {
    return new HelloWorldReturnBean("Hello World - From HelloWorldReturnBean");
}
```
http://localhost:8089/api/v0/hello-world/getBean

4. Passing in a path variable in the GET request
```java
@GetMapping(path = "/pathVariable/{var_name}")
public String helloWorldPathVariable(@PathVariable("var_name") String name) {
    return String.format("The Value returned is %s", name);
}
```
http://localhost:8089/api/v0/hello-world/pathVariable/{var_name}

# URIs
Retrieve all Users - GET /users

Create a User - POST /users

Retrieve one User - GET /users/{id} -> /users/1

Delete a User - DELETE /users/{id} -> /users/1

Retrieve all posts for a User - GET /users/{id}/posts

Create a posts for a User - POST /users/{id}/posts

Retrieve details of a post - GET /users/{id}/posts/{post_id}
