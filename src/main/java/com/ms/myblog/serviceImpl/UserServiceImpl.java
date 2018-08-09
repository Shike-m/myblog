package com.ms.myblog.serviceImpl;



import com.ms.myblog.domain.User;
import com.ms.myblog.repository.UserRepository;
import com.ms.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveOrUpdateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void removeUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<User> getUserByid(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Page<User> listUserByNameLike(String name, Pageable pageable) {
        name="%"+name+"%";
        Page<User> users = userRepository.findByNameLike(name,pageable);
        return users;
    }
}
