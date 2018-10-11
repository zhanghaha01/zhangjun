package com.yidu.dao;

import java.util.List;

import com.yidu.bean.MenuBean;
import com.yidu.bean.RoleBean;

public interface MenuDao {
	public List<MenuBean> selectAllByUserId(RoleBean r);
}
