/**
 * 
 */
package cn.jx.pxc.mapper;

import java.util.List;

import cn.jx.pxc.pojo.Orders;
import cn.jx.pxc.pojo.OrdersCustomer;
import cn.jx.pxc.pojo.UserQueryVo;


/**修改：黄信胜2
 * <p>@Title OrdersMapperCustomer</p>
 *<p> @description 订单的mapper接口代理</p>
 * @package cn.jx.pxc.mapper
 * @author 黄信胜
 * @date 2018年11月29日下午1:20:58
 * @version 版本号
 */
public interface OrdersMapperCustomer {
	
	/**
	 * 使用resluType查询订单表中关联的用户
	 * OrdersCustomer:ordersCustomer的扩展类，此类中添加需要输出order中没有的关联属性。
	 * @return OrdersCustomer 
	 */
	List<OrdersCustomer> findOrdersUser() throws Exception;
	
	/**
	 * 使用reslutMap查询订单表中关联的用户；可以不需要扩展类OrdersCustomer。
	 * @return Orders
	 */
	List<Orders> findOrdersUserResultMap() throws Exception;
	
	/**
	 * 使用reslutMap查询订单表中关联的用户及订单明细信息
	 * @return Orders
	 */
	List<Orders> findOrdersUserAndOrdersdetailResultMap() throws Exception;
	
}
