package com.d.ems.service.impl;



import com.d.ems.dao.IEmpDao;
import com.d.ems.dao.impl.EmpDao;
import com.d.ems.pojo.Emp;
import com.d.ems.service.IEmpService;

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
	public void lregisterEmp(Emp emp) {
		empDao.lregisterEmp(emp);
	}

}
