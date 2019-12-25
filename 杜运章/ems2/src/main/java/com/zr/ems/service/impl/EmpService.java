package com.zr.ems.service.impl;

import com.zr.ems.dao.IEmpDao;
import com.zr.ems.dao.impl.EmpDao;
import com.zr.ems.pojo.Emp;
import com.zr.ems.service.IEmpService;

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

	public Emp findEmpByNicknameAndPassword(String nickname, String password) {

		// 调用dao中的方法
		return empDao.findEmpByNicknameAndPassword(nickname, password);

	}

	public int findEmpByNickname(String nickname) {
		return empDao.findEmpByNickname(nickname);
	}

	public void registerEmp(Emp emp) {
		empDao.registerEmp(emp);
	}

}
