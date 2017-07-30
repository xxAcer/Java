package cn.prince.service.impl;


import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.prince.mapper.UserMapper;
import cn.prince.pojo.User;
import cn.prince.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	UserMapper userMapper;

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userMapper.login(user);
	}
	
	
	
	
}
