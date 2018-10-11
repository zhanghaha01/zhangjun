package util;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class GetSession {
	static SqlSessionFactory sessionFactory=null;
	static{
		try {
			sessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatise-config.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static SqlSession getSession(){
		return sessionFactory.openSession();
	}
	public static void main(String[] args) {
		if(new GetSession().getSession()!=null){
			System.out.println("OK");
		}else{
			System.out.println("NO");
		}
		
	}
}
