/**
 * 
 */
package cn.jx.pxc.pojo;

/**
 *<p>Title: OrderCustomer</p>
 *<p>Description: 订单的扩展类,通过此类
 *	映射订单和用户查询结果，让此类继承字段较多的pojo类（Orders类）
 *
 *</p>
 * @package  cn.jx.pxc.pojo
 * @author   黄信胜
 * @date     2018年12月1日下午8:34:52
 * @version 版本号
 */
@SuppressWarnings("serial")
public class OrdersCustomer extends Orders{
	
	/*
	 * 添加顾客属性
	 * USER.username
	 * USER.sex
	 * USER.address
	 */
	private String username;//顾客名称
	private Character sex;//顾客性别
	private String address;//顾客收货地址
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Character getSex() {
		return sex;
	}
	public void setSex(Character sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
