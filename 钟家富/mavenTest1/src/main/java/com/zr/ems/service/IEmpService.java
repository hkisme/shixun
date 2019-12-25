package com.zr.ems.service;

import com.zr.ems.pojo.Emp;

/**
 * 服务接口 
 *
 */
public interface IEmpService {
	/**
	 * 通过昵称和密码查找emp对象
	 * @param nickname
	 * @param password
	 * @return
	 */
	Emp findEmpByNicknameAndPassword(String nickname, String password);

	int findEmpByNickname(String nickname1);

	void zhuce(Emp emp);
	
}
