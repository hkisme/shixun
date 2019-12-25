package com.cqjtdx.ems.dao;

import com.cqjtdx.ems.pojo.Emp;

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
	void registerEmp(Emp emp);

}
