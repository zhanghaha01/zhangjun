package com.yidu.test;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.yidu.bean.Product;
import com.yidu.bean.Student;
import com.yidu.dao.ProductDao;

import util.GetSession;

public class Tests {
	/*public static void main(String[] args) throws IOException {
		//SqlSession session=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatise-config.xml")).openSession(true);
		//List<Student> list=session.selectList("liyuxian.select");
		for (Student s: list) {
			System.out.println("iiiiiiiddddddd====="+s.getStuName());
		}
		SqlSession session=GetSession.getSession();
		Student s=new Student();
		s.setStuId(2);
		s.setStuName("�����");
		s.setStuAge(18);
		s.setStuSex("��");
		int row=session.update("liyuxian.update", s);
		System.out.println(row);
	}*/
	public static void main(String[] args) {
		SqlSession session=GetSession.getSession();
		Product p=new Product();
		ProductDao pd=session.getMapper(ProductDao.class);
		List<Product> list=pd.select(p);
		for (Product product : list) {
			System.out.println(product.getProductName());
		}
		session.close();
	}
	/*@Test
	public void testPro(){
		Scanner scanner=new Scanner(System.in);
		SqlSession session=GetSession.getSession();
		Product p=new Product();
		List<Product> li=null;
		System.out.print("��������Ҫ����ʲô���в�ѯ:1������  2���۸�  3����Ʒ����");
		int caozuo=scanner.nextInt();
		switch (caozuo) {
		case 1:
			System.out.print("���������֣�");
			p.setProductName("%"+scanner.next()+"%");
			li=session.selectList("lixiaobai.select", p);
			break;
		case 2:
			System.out.print("������۸�");
			p.setPrice("%"+scanner.next()+"%");
			li=session.selectList("lixiaobai.select", p);
			break;
		case 3:
			System.out.print("�������Ʒ���飺");
			p.setProductName2("%"+scanner.next()+"%");
			li=session.selectList("lixiaobai.select", p);
			break;
		}
		for (Product pp : li) {
			System.out.println(pp.getProductName());
		}
	}*/
}
