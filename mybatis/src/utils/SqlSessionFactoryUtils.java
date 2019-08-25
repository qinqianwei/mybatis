package utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtils {
	private static SqlSessionFactory sqlSessionFactory;
	static {
		try {
			SqlSessionFactoryBuilder b = new SqlSessionFactoryBuilder();
			InputStream inputStream;
			inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			sqlSessionFactory = b.build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
		
	}
	

}
