package zxylearn.bcnlserver.service.impl;

import zxylearn.bcnlserver.pojo.entity.User;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import zxylearn.bcnlserver.mapper.UserMapper;
import zxylearn.bcnlserver.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public boolean isExistUsername(String username) {
        if (username == null || username.isEmpty()) {
            return false;
        }
        return exists(new LambdaQueryWrapper<User>()
                .eq(User::getUsername, username)
                .or()
                .eq(User::getEmail, username));
    }

    @Override
    public boolean isExistEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        return exists(new LambdaQueryWrapper<User>()
                .eq(User::getUsername, email)
                .or()
                .eq(User::getEmail, email));
    }

    @Override
    public User getUserByUsernameOrEmail(String username) {
        if(username == null || username.isEmpty()) {
            return null;
        }
        return getOne(new LambdaQueryWrapper<User>()
                .eq(User::getUsername, username)
                .or()
                .eq(User::getEmail, username));
    }
}