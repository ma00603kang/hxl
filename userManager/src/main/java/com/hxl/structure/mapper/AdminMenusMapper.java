package com.hxl.structure.mapper;

import java.util.List;

import com.hxl.common.pojo.TbMenus;
import org.apache.ibatis.annotations.Select;


public interface AdminMenusMapper {
	@Select("SELECT m.menu_id as menuId,m.title,m.icon,m.href,m.spread,m.parent_id as parentId,m.perms FROM tb_roles_menus r LEFT JOIN tb_menus m ON r.menu_id = m.menu_id WHERE r.role_id = #{0}")
	List<TbMenus> getMenus(Long roleId);
}
