/**
 * 
 */
package cn.jx.pxc.mapper.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import org.junit.Test;

import cn.jx.pxc.mapper.OrdersMapperCustomer;
import cn.jx.pxc.pojo.Orders;
import cn.jx.pxc.pojo.OrdersCustomer;
import cn.jx.pxc.pojo.User;
import cn.jx.pxc.utils.SqlSessionUtils;

/**
 *<p>Title: OrderMapperTest.java</p>
 *<p>Description: 描述</p>
 * @package  cn.jx.pxc.mapper.test
 * @author   黄信胜
 * @date     2018年12月1日下午8:54:43
 * @version 版本号
 */
@SuppressWarnings("all")
public class OrderMapperTest {
	
	/**
	 * 使用resluType查询订单表中关联的用户
	 * @throws Exception 
	 */
	@Test
	public void TestResultType() throws Exception {
		SqlSession sqlSession =	SqlSessionUtils.getSqlSession();
		OrdersMapperCustomer orderMapperCustomer =	sqlSession.getMapper(OrdersMapperCustomer.class);
		List<OrdersCustomer> list = orderMapperCustomer.findOrdersUser();
		
		for (OrdersCustomer ordersCustomer : list) {
			System.out.println(ordersCustomer.getUsername()+ordersCustomer.getSex()+ordersCustomer.getAddress());
		}
		sqlSession.close();
	}
	
	/**
	 * 使用resluType查询订单表中关联的用户,使用resultMap:就不需要扩展类OrdersCustomer；
	 * @throws Exception 
	 */
	@Test
	public void TestfindOrdersUserResultMap() throws Exception {
		SqlSession sqlSession =	SqlSessionUtils.getSqlSession();
		OrdersMapperCustomer orderMapperCustomer =	sqlSession.getMapper(OrdersMapperCustomer.class);
		List<Orders> list = orderMapperCustomer.findOrdersUserResultMap();
		System.out.println(list.toString());
		sqlSession.close();
	}
	
	/**
	 * 使用resluType查询订单表中关联的用户及订单明细信息
	 * @throws Exception 
	 */
	@Test
	public void TestfindOrdersUserAndOrdersdetailResultMap() throws Exception {
		SqlSession sqlSession =	SqlSessionUtils.getSqlSession();
		OrdersMapperCustomer orderMapperCustomer =	sqlSession.getMapper(OrdersMapperCustomer.class);
		List<Orders> list = orderMapperCustomer.findOrdersUserAndOrdersdetailResultMap();
		System.out.println(list.toString());
		sqlSession.close();
	}
	
	/**
	 * 使用resluType查询用户及购买的商品信息
	 * @throws Exception 
	 */
	@Test
	public void TestfindUserAndItemsResultMap() throws Exception {
		SqlSession sqlSession =	SqlSessionUtils.getSqlSession();
		OrdersMapperCustomer orderMapperCustomer =	sqlSession.getMapper(OrdersMapperCustomer.class);
		List<User> list = orderMapperCustomer.findUserAndItemsResultMap();
		System.out.println(list.toString());
		sqlSession.close();
	}
	
	/**
	 * 延迟加载：查询订单信息，有需要时才查询关联的用户信息,(提高查询数据库的性能)
	 * @throws Exception 
	 */
	@Test
	public void TestfindOrdersUserLazyLoadingResultMap() throws Exception {
		SqlSession sqlSession =	SqlSessionUtils.getSqlSession();
		OrdersMapperCustomer orderMapperCustomer =	sqlSession.getMapper(OrdersMapperCustomer.class);
		List<Orders> orders = orderMapperCustomer.findOrdersUserLazyLoadingResultMap();
		for (Orders orders2 : orders) {
			User user = orders2.getUser();
			System.out.println(user);
		}
		sqlSession.close();
	}
	
}
