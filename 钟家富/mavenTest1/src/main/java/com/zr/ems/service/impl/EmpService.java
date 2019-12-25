package com.zr.ems.service.impl;
import com.zr.ems.Dao.IEmpDao;
import com.zr.ems.Dao.impl.EmpDao;
import com.zr.ems.pojo.Emp;
import com.zr.ems.service.IEmpService;
/**
 * 
 * 服务接口的实现类
 * 
 * @author Administrator
 *
 */
public class EmpService  implements IEmpService {
	// 获取到专门处理持久层方面的对象
	private IEmpDao empDao = new EmpDao();
	@Override
	public Emp findEmpByNicknameAndPassword(String nickname, String password) {

		
	

		// 调用dao中的方法
		return empDao.findEmpByNicknameAndPassword(nickname, password);

	}

	@Override
	public int findEmpByNickname(String nickname1) {
		// TODO 自动生成的方法存根
		return empDao.findEmpByNickname(nickname1);
	}

	@Override
	public void zhuce(Emp emp) {
		// TODO 自动生成的方法存根
		empDao.zhuce(emp);
	}

}
