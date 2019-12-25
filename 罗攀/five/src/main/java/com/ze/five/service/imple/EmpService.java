package com.ze.five.service.imple;


import com.ze.five.dao.IEmpDao;
import com.ze.five.dao.imple.EmpDao;
import com.ze.five.service.IEmpService;
import com.zr.five.pojo.Emp;

public class EmpService implements IEmpService {
	private IEmpDao empDao = new EmpDao();
	@Override
	public Emp findEmpByNicknameAndPassword(String nickname, String password) {

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
