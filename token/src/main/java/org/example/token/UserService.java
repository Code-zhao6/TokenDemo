package org.example.token;


import org.springframework.stereotype.Service;


@Service
public class UserService {
    public User login(User user) {
        if (user.getName().equals("admin") && user.getPassword().equals("123456"))
        return user;
        else return null;
    }


}
