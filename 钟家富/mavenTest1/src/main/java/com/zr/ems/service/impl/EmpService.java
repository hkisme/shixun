package com.zr.ems.service.impl;
import com.zr.ems.Dao.IEmpDao;
import com.zr.ems.Dao.impl.EmpDao;
import com.zr.ems.pojo.Emp;
import com.zr.ems.service.IEmpService;
/**
 * 
 * ����ӿڵ�ʵ����
 * 
 * @author Administrator
 *
 */
public class EmpService  implements IEmpService {
	// ��ȡ��ר�Ŵ���־ò㷽��Ķ���
	private IEmpDao empDao = new EmpDao();
	@Override
	public Emp findEmpByNicknameAndPassword(String nickname, String password) {

		
	

		// ����dao�еķ���
		return empDao.findEmpByNicknameAndPassword(nickname, password);

	}

	@Override
	public int findEmpByNickname(String nickname1) {
		// TODO �Զ����ɵķ������
		return empDao.findEmpByNickname(nickname1);
	}

	@Override
	public void zhuce(Emp emp) {
		// TODO �Զ����ɵķ������
		empDao.zhuce(emp);
	}

}
