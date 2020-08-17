package com.csh.service.impl;

import com.csh.service.ILogin;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author csh
 * @version 1.0
 * @date 2020/5/28
 * @descript 实现
 * @package com.csh.service.impl
 */
@Service(value = "loginService")
public class ILoginServiceImpl implements ILogin {

	public ILoginServiceImpl() {
		System.out.println(" ILoginServiceImpl Is Init...... ");
	}

	@Override
	public String loginCheck(String userName, String password) {
		System.out.println(" userName:===> " + userName + " password:====> " + password);
		return "success";
	}

	@Override
	public List<String> getListsByName(String userName) throws RuntimeException {
		List<String> lists = new ArrayList<>();
		lists.add(" first ");
		lists.add(" second ");
		lists.add(" third ");
		return lists;

	}
}
