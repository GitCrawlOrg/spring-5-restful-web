#POST Rest Calls

###Creating a List of Objects for the Demo Purposes

In DAOService Class
```java
//Save a new User
public void save(User user) {
    if(user.getId() == null){
        user.setId(++usersCount);
    }
    users.add(user);
    return;
}
```

in Controller Class
```java
//Add a new User
@PostMapping("/users")
public void addNewUser(@RequestBody User user){
    userDAOService.save(user);

}
```

In Postman, create a POST call

{{address}}{{port}}/api/hardCodedData/users

with Request Body RAW and JSON
```json
{
"name": "Kid",
"dob": "2019-12-08T01:19:11.760+0000"
}
```



