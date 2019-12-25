package com.ly.ems.service.impl;

import com.ly.ems.Dao.IEmpDao;
import com.ly.ems.Dao.impl.EmpDao;
import com.ly.ems.pojo.Emp;
import com.ly.ems.service.EmpService;

public class IEmpService implements EmpService{
	// 获取到专门处理持久层方面的对象
	private IEmpDao empDao = new EmpDao();

	public Emp findEmpByNicknameAndPassword(String nickname, String password) {

		// 调用dao中的方法
		return empDao.findEmpByUserNameAndPassWord(nickname, password);
	}

	public int findEmpByUserName(String username) {
		// TODO Auto-generated method stub
		return empDao.findEmpByUserName(username);
	}

	public void addEmpByAll(Emp emp) {
		// TODO Auto-generated method stub
		empDao.addEmpByAll(emp);
		
	}

}
