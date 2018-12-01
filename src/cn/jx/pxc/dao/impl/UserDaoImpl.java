/**
 * 
 */
package cn.jx.pxc.dao.impl;

import java.util.List;

import cn.jx.pxc.dao.UserDao;
import cn.jx.pxc.pojo.User;

/**刘斐
 * <p>@Title UserDaoImpl.java</p>
 *<p> @description 鎻忚堪</p>
 * @package cn.jx.pxc.dao.impl
 * @author 榛勪俊鑳�
 * @date 2018骞�11鏈�29鏃ヤ笅鍗�4:27:33
 * @version 鐗堟湰鍙�
 */
public class UserDaoImpl implements UserDao{

	/* (non-Javadoc)
	 * @see cn.jx.pxc.dao.UserDao#findUserById(java.lang.Integer)
	 */
	@Override
	public User findUserById(Integer id) throws Exception {
		System.out.println("aaaaaaaaaaaaa........"+id);
		return null;
	}

	/* (non-Javadoc)
	 * @see cn.jx.pxc.dao.UserDao#findUserByName(java.lang.String)
	 */
	@Override
	public List<User> findUserByName(String username) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see cn.jx.pxc.dao.UserDao#insertUser(cn.jx.pxc.pojo.User)
	 */
	@Override
	public void insertUser(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see cn.jx.pxc.dao.UserDao#deleteUserById(java.lang.Integer)
	 */
	@Override
	public void deleteUserById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see cn.jx.pxc.dao.UserDao#findAllUser()
	 */
	@Override
	public List<User> findAllUser() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
