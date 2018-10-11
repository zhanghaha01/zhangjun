package com.yidu.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.yidu.bean.Student;

import util.GetSession;

public class TestStuAndTea {
	@Test
	public void testSelectAl(){
		SqlSession session=GetSession.getSession();
		List<Student> list=session.selectList("liyuxian.selectAll");
		for (Student student : list) {
			System.out.println(student.getStuName()+"--"+student.getTeacher().getTname());
		}
		session.close();
	}
}
