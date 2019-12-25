package com.d.ems.service.impl;



import com.d.ems.dao.IEmpDao;
import com.d.ems.dao.impl.EmpDao;
import com.d.ems.pojo.Emp;
import com.d.ems.service.IEmpService;

/**
 * 
 * 服务接口的实现类
 * 
 * @author Administrator
 *
 */
public class EmpService implements IEmpService {
	// 获取到专门处理持久层方面的对象
	private IEmpDao empDao = new EmpDao();

	@Override
	public Emp findEmpByNicknameAndPassword(String nickname, String password) {

		// 调用dao中的方法
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
