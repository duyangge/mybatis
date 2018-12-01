/**
 * 
 */
package cn.jx.pxc.dao.impl.test;


import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.jx.pxc.pojo.User;

/**
 * <p>@Title MybatisTest.java</p>
 *<p> @description 测试mybatis一些常用的操作crud</p>
 * @package cn.jx.pxc.test
 * @author 黄信胜
 * @date 2018年11月28日下午7:45:48
 * @version 版本号
 */
@SuppressWarnings("all")
public class UserSqlTest {
	
		/**
		 * 测试对用户的查询操作
		 * @throws IOException
		 */
		@Test
		public void selectTest() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession=sqlSessionFactory.openSession();
		//1.通过id查询用户，返回单条记录
//		User user = sqlSession.selectOne("test.findById", 24);
//		System.out.println(user);
		//查询所有用户
//		List<User> list = sqlSession.selectList("test.findAll");
//		System.out.println(list.toString());
		//2.模糊查询
		List<User> user = sqlSession.selectList("test.findByName", "小明");
		System.out.println(user.toString());
		sqlSession.close();
		}
		
		/**
		 * 根据用户id修改用户信息
		 * @throws IOException
		 */
		@Test
		public void updateUser() throws IOException {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession=sqlSessionFactory.openSession();
		    User user = sqlSession.selectOne("test.findById", 24);
		    user.setUsername("张三疯");
			sqlSession.update("test.updateUser", user);
			sqlSession.commit();
			System.out.println("修改成功！");
			sqlSession.close();
		}
		
		/**4.根据用户id删除用户
		 * @throws IOException
		 */
		@Test
		public void deleteUser() throws IOException {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession=sqlSessionFactory.openSession();
			sqlSession.delete("test.deleteUser", 25);
			sqlSession.commit();
			System.out.println("删除成功！");
			sqlSession.close();
		}
		
		/**
		 * 添加用户返回主键（两种方式）
		 * 1.自增型添加
		 * 2.非自增型添加
		 * @throws IOException
		 */
		@Test
		public void addUser() throws IOException {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession=sqlSessionFactory.openSession();
			/*3.添加用户
				3.1自增型
				3.2非自增型*/
			User user=new User();
			user.setUsername("刘者先");
			user.setSex('男');
			//user.setBirthday(new Date("1998-12-02"));
			user.setAddress("北京朝阳区");
			Integer uid = sqlSession.insert("test.addUser", user);
			System.out.println("添加用户成功！"+uid);
			sqlSession.commit();
			sqlSession.close();
		}
}
