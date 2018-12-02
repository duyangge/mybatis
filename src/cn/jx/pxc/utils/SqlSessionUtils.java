/**
 * 
 */
package cn.jx.pxc.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *<p>Title: SqlSessionUtils.java</p>
 *<p>Description: Sqlsession的工具类</p>
 * @package  cn.jx.pxc.utils
 * @author   黄信胜
 * @date     2018年12月1日下午8:49:59
 * @version 版本号
 */
@SuppressWarnings("all")
public class SqlSessionUtils {
	private static SqlSessionFactory sqlSessionFactory;
	private static SqlSession sqlSession;
	static {
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	public static SqlSession getSqlSession() {
		return sqlSessionFactory.openSession();
	}
}
