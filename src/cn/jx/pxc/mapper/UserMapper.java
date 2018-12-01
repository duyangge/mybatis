/**
 * 
 */
package cn.jx.pxc.mapper;

import java.util.List;

import cn.jx.pxc.pojo.User;
import cn.jx.pxc.pojo.UserCustomer;
import cn.jx.pxc.pojo.UserQueryVo;


/**sunlixin
 * <p>@Title UserMapper.java</p>
 *<p> @description 描述</p>
 * @package cn.jx.pxc.mapper
 * @author 黄信胜
 * @date 2018年11月29日下午1:20:58
 * @version 版本号
 */
public interface UserMapper {
	
	/**
	 * 统计符合条件的用户信息
	 * @param userQueryVo
	 * @return 用户数量
	 * @throws Exception
	 */
	Integer findUserCount(UserQueryVo userQueryVo) throws Exception;
	
	/**
	 * 综合查询用户
	 * @param userQueryVo 
	 * @return 符号查询条件的用户实体类集合
	 */
	List<UserCustomer> findUserList(UserQueryVo userQueryVo) throws Exception;
	
	/**
	 * 根据用户id查询信息
	 * @param id 用户id
	 * @return 用户实体类对象
	 */
	User findUserById(Integer id) throws Exception;
	
	/**
	 * 通过用户名称模糊查询
	 * @param username 用户名称
	 * @return 用户实体类的集合
	 * @throws Exception
	 */
	List<User> findUserByName(String username) throws Exception;
	
	/**
	 * 添加用户
	 * @param user 用户实体类对象
	 * @throws Exception
	 */
	void insertUser(User user) throws Exception;
	
	/**
	 * 根据用户id删除用户
	 * @param id 用户id
	 * @throws Exception
	 */
	void deleteUserById(Integer id) throws Exception;
	
	/**
	 * 查询所有用户
	 * @return 所有用户实体类对象的集合
	 * @throws Exception
	 */
	List<UserCustomer> findAllUser() throws Exception;
}
