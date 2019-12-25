package com.d.ems.service;

import com.d.ems.pojo.Emp;

/**
 * 
 * @author My world
 *
 */
public interface IEmpService {

	/**
	 * 
	 * @param nickname
	 * @param password
	 * @return
	 */
	Emp findEmpByNicknameAndPassword(String nickname,String password);

	/**
	 * 根据昵称判断用户是否存在
	 * @param nickname
	 * @return
	 */
	int findEmpByNickname(String nickname);
	
	/**
	 * 注册员工信息
	 * 
	 * @param emp
	 */
	void lregisterEmp(Emp emp);
}
