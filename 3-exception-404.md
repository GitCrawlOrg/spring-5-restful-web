# Exception upon Resource not found

If the data doesn't exist, a custom exception can be thrown
```java
//Retrieve specific users
@GetMapping(path = "/user/{id}")
public User retrieveUserById(@PathVariable int id) throws UserNotFoundException {
    User user = userDAOService.findById(id);

    //If user is not found
    if(user == null){
        throw new UserNotFoundException("User with id" + id +" is not found");
    }
    return user;
}
```

If a custom response code is to be sent, use @ResponseStatus(HttpStatus.NOT_FOUND)

##### Custom Exception
```java
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
```