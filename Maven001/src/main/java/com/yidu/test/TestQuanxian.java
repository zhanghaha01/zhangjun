package com.yidu.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yidu.bean.MenuBean;
import com.yidu.bean.RoleBean;
import com.yidu.bean.UserBean;
import com.yidu.dao.MenuDao;
import com.yidu.dao.RoleDao;
import com.yidu.dao.UserDao;

import util.GetSession;

public class TestQuanxian {
	public static void main(String[] args) {
		SqlSession session=GetSession.getSession();
		UserBean userBean=new UserBean();
		userBean.setUserName("schoolmaster");
		userBean.setUserPass("123456");
		MenuDao menuDao=session.getMapper(MenuDao.class);
		RoleDao roleDao=session.getMapper(RoleDao.class);
		UserDao userDao=session.getMapper(UserDao.class);
		UserBean u=userDao.login(userBean);
		RoleBean role=roleDao.selectRoleIdByUserId(u);
		
		List<MenuBean> list=menuDao.selectAllByUserId(role);
		for (MenuBean roleBean : list) {
			System.out.println(roleBean.getMenuId());
		}
		session.close();
	}
}
