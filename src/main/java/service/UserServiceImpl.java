package service;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserMapper;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userRepository;

    @Override
    public User getUserInfo(){
        return userRepository.getUserById((long)1);
    }
}
