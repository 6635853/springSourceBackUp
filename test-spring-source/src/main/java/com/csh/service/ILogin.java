package com.csh.service;

import java.util.List;

/**
 * @author csh
 * @version 1.0
 * @date 2020/5/28
 * @package com.csh.service
 */
public interface ILogin {

	/**
	 * 登录检查
	 *
	 * @param userName 用户名
	 * @param password 密码
	 * @return
	 */
	public String loginCheck(String userName, String password);

	/* *
	 * @author csh
	 * @param [userName]
	 * @createTime 2020/4/21 11:05
	 * @description 根据用户名查询数据列表
	 * @return java.util.List<java.lang.String>
	 * @throws
	 */
	public List<String> getListsByName(String userName) throws RuntimeException;
}
