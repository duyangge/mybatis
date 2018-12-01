/**
 * 
 */
package cn.jx.pxc.mapper.test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.jx.pxc.mapper.UserMapper;
import cn.jx.pxc.pojo.UserCustomer;
import cn.jx.pxc.pojo.UserQueryVo;

/**
 * 志朋在修改..1234567
 *<p> @Title MapperTest.java</p>
 *<p> @description 描述</p>
 * @package cn.jx.pxc.mapper.test
 * @author 黄信胜
 * @date 2018年11月29日下午4:53:57
 * @version 版本号
 */
@SuppressWarnings("all")
public class UserMapperTest {
	
	/**
	 * 通过mapper接口查询用户信息
	 * @throws Exception
	 */
	@Test
	public void selectTest() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//创建UserMapper对象，mybatis自动生成mapper代理对象
		UserMapper userMapper = (UserMapper) sqlSession.getMapper(UserMapper.class);
		//1.通过id查询用户，返回单条记录
//		User user = userMapper.findUserById(1);
//		System.out.println(user);
		//2.使用包装类型查询
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustomer userCustomer = new UserCustomer();
		userCustomer.setSex('女');
		//userCustomer.setUsername("小明");
		userQueryVo.setUserCustomer(userCustomer);
		List<UserCustomer> uCustomer =	userMapper.findUserList(userQueryVo);
		System.out.println(uCustomer.toString());
		System.out.println("----------测试修改----------");
		sqlSession.close();
		}
	
	/**
	 * 通过高级映射查询用户信息
	 * @throws Exception
	 */
	@Test
	public void resultMapperTest() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//创建UserMapper对象，mybatis自动生成mapper代理对象
		UserMapper userMapper = (UserMapper) sqlSession.getMapper(UserMapper.class);
		sqlSession.close();
	}
	
	/**
	 * 统计符合条件的用户数量
	 * @throws Exception
	 */
	@Test
	public void findUserCountTest() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//创建UserMapper对象，mybatis自动生成mapper代理对象
		UserMapper userMapper = (UserMapper) sqlSession.getMapper(UserMapper.class);
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustomer userCustomer = new UserCustomer();
		userCustomer.setSex('男');
		userCustomer.setUsername("小明");
		userQueryVo.setUserCustomer(userCustomer);
		int count = userMapper.findUserCount(userQueryVo);
		System.out.println("count:\t"+count);
		sqlSession.close();
	}
	
	/**
	 * 查询所有用户
	 * @throws Exception
	 */
	@Test
	public void findAllUserTest() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//创建UserMapper对象，mybatis自动生成mapper代理对象
		UserMapper userMapper = (UserMapper) sqlSession.getMapper(UserMapper.class);
		List<UserCustomer> list = userMapper.findAllUser();
		System.out.println("count:\t"+list.toString());
		sqlSession.close();
	}
	
	/**
	 * 查询符合条件的用户
	 * @throws Exception
	 */
	@Test
	public void findUserTest() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//创建UserMapper对象，mybatis自动生成mapper代理对象
		UserMapper userMapper = (UserMapper) sqlSession.getMapper(UserMapper.class);
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(10);
		ids.add(24);
		UserQueryVo userQueryVo = new UserQueryVo();
		userQueryVo.setIds(ids);
		int count = userMapper.findUserCount(userQueryVo);
		System.out.println("count:\t"+count);
		sqlSession.close();
	}
	
	
}
