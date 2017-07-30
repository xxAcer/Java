package cn.prince.mapper;

import java.util.List;

import cn.prince.pojo.Menu;

public interface MenuMapper {

	List<Menu> findMenuById(int id);

}
