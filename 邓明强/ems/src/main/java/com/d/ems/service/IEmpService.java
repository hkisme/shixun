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
	 * �����ǳ��ж��û��Ƿ����
	 * @param nickname
	 * @return
	 */
	int findEmpByNickname(String nickname);
	
	/**
	 * ע��Ա����Ϣ
	 * 
	 * @param emp
	 */
	void lregisterEmp(Emp emp);
}
