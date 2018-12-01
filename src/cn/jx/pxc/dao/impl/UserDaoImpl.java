/**
 * 
 */
package cn.jx.pxc.dao.impl;

import java.util.List;

import cn.jx.pxc.dao.UserDao;
import cn.jx.pxc.pojo.User;

/**
 *修改：黄信胜1
 * <p>@Title UserDaoImpl.java</p>
 *<p> @description userdaoimpL实现类</p>
 * @package cn.jx.pxc.dao.impl
 * @author 黄信胜
 * @date 2018.11.23;4:27:33
 * @version 1.0
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
