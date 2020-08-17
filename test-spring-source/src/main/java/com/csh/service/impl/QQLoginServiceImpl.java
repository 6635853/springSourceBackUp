package com.csh.service.impl;

import com.csh.service.ILogin;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author csh
 * @version 1.0
 * @date 2020/5/28
 * @descript QQ
 * @package com.csh.service.impl
 */
@Service(value = "qqLoginService")
public class QQLoginServiceImpl implements ILogin {

	@Override
	public String loginCheck(String userName, String password) {
		if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
			return null;
		}
		if (!StringUtils.isEmpty(userName) && userName.equals("admin")) {
			if (!StringUtils.isEmpty(password) && password.equals("123456")) {
				System.out.println(" 验证通过，成功登陆  ");
				return "SUCCESS";
			}
		}
		return "Failed";
	}

	@Override
	public List<String> getListsByName(String userName) throws RuntimeException {
		List<String> lists = new ArrayList<>();
		lists.add(" aaaaaaaaaa ");
		lists.add(" bbbbbbbbbb ");
		lists.add(" cccccccccc ");
		lists.add(" cccccccccc ");
		return lists;
	}
}
