package zxylearn.bcnlserver.service;


import com.baomidou.mybatisplus.extension.service.IService;

import zxylearn.bcnlserver.pojo.entity.User;

public interface UserService extends IService<User> {
    public boolean isExistUsername(String username);
    public boolean isExistEmail(String email);
    public User getUserByUsernameOrEmail(String username);
}