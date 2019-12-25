package com.hfh.ems.service.impl;
import com.hfh.ems.dao.IEmpDao;
import com.hfh.ems.dao.impl.EmpDao;
import com.hfh.ems.pojo.Emp;
import com.hfh.ems.service.IEmpService;

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

	public int findEmpByNickname(String nickname) {
		return empDao.findEmpByNickname(nickname);
	}

	@Override
	public void registerEmp(Emp emp) {
		empDao.registerEmp(emp);
	}

}
