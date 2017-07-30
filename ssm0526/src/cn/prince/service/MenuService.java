package cn.prince.service;

import java.util.List;

import cn.prince.pojo.Menu;

public interface MenuService {

	List<Menu> findMenuById(int id);
	
}
