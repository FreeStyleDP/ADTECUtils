package com.adtec.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * mybatis 工具类
 * @author dengp_m  
 * @date 2018年8月29日 下午7:46:22 
 */
public class MybatisUtil {

	private static String resource = "conf/mybatis-config.xml";

	public static SqlSession getSession(String dirver ,String url ,String userName ,String password)
			throws IOException {
		
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		Properties properties = new Properties();
        properties.setProperty("driver", dirver);
        properties.setProperty("url", url );
        properties.setProperty("username", userName);
        properties.setProperty("password", password);
        
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream,properties);
		return sqlSessionFactory.openSession();
	}
	
}
