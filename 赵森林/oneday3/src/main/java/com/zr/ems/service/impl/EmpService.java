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

	@Override
	public Emp findEmpByNicknameAndPassword(String nickname, String password) {

		// 获取到专门处理持久层方面的对象
		IEmpDao empDao = new EmpDao();

		// 调用dao中的方法
		return empDao.findEmpByNicknameAndPassword(nickname, password);

	}

}
