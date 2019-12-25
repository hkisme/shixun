package com.cqjtdx.ems.service.impl;

import com.cqjtdx.ems.dao.IEmpDao;
import com.cqjtdx.ems.dao.impl.EmpDao;
import com.cqjtdx.ems.pojo.Emp;
import com.cqjtdx.ems.service.IEmpService;

/**
 * 
 * ����ӿڵ�ʵ����
 * 
 * @author Administrator
 *
 */
public class EmpService implements IEmpService {
	// ��ȡ��ר�Ŵ���־ò㷽��Ķ���
	private IEmpDao empDao = new EmpDao();

	@Override
	public Emp findEmpByNicknameAndPassword(String nickname, String password) {

		// ����dao�еķ���
		return empDao.findEmpByNicknameAndPassword(nickname, password);

	}

	@Override
	public int findEmpByNickname(String nickname) {
		return empDao.findEmpByNickname(nickname);
	}

	@Override
	public void registerEmp(Emp emp) {
		empDao.registerEmp(emp);
	}

}
