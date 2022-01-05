package tw.com.pluto.trace.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tw.com.pluto.trace.security.dao.UserRepository;
import tw.com.pluto.trace.security.model.User;
import tw.com.pluto.trace.security.service.UserService;

@Service
public class UserServicceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }
}
