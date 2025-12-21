package zxylearn.bcnlserver.service.impl;

import zxylearn.bcnlserver.pojo.entity.User;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import zxylearn.bcnlserver.mapper.UserMapper;
import zxylearn.bcnlserver.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}