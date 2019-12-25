package com.d.ems.dao;

import com.d.ems.pojo.Emp;

/**
 * emp�ĳ־ò�ӿ�
 */
public interface IEmpDao {

	/**
	 * ͨ���ǳƺ��������emp����
	 * 
	 * @param nickname
	 * @param password
	 * @return
	 */
	Emp findEmpByNicknameAndPassword(String nickname, String password);
	
	/**
	 * �����ǳ��ж��û��Ƿ����
	 * 
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