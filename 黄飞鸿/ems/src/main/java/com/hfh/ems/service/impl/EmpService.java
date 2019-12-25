package com.hfh.ems.service.impl;
import com.hfh.ems.dao.IEmpDao;
import com.hfh.ems.dao.impl.EmpDao;
import com.hfh.ems.pojo.Emp;
import com.hfh.ems.service.IEmpService;

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

	public int findEmpByNickname(String nickname) {
		return empDao.findEmpByNickname(nickname);
	}

	@Override
	public void registerEmp(Emp emp) {
		empDao.registerEmp(emp);
	}

}
