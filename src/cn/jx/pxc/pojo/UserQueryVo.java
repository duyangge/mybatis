/**
 * 
 */
package cn.jx.pxc.pojo;

import java.util.List;

/**
 *<p> @Title UserQueryVo</p>
 *<p> @description 包装类型</p>
 * @package cn.jx.pxc.pojo
 * @author 黄信胜
 * @date 2018年11月29日下午7:53:48
 * @version 版本号
 */
@SuppressWarnings("all")
public class UserQueryVo {
	
	private List<Integer> ids;//用户id集合
	private UserCustomer userCustomer;//用户查询条件
	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public UserCustomer getUserCustomer() {
		return userCustomer;
	}

	public void setUserCustomer(UserCustomer userCustomer) {
		this.userCustomer = userCustomer;
	}
	
	//可以包装查询条件，订单，商品......
}
