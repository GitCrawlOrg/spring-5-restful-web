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

3. 

Retrieve all Users - GET /users

Create a User - POST /users

Retrieve one User - GET /users/{id} -> /users/1

Delete a User - DELETE /users/{id} -> /users/1

Retrieve all posts for a User - GET /users/{id}/posts

Create a posts for a User - POST /users/{id}/posts

Retrieve details of a post - GET /users/{id}/posts/{post_id}
