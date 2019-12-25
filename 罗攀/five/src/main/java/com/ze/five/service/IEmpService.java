package com.ze.five.service;

import com.zr.five.pojo.Emp;

public interface IEmpService {
	Emp findEmpByNicknameAndPassword(String nickname,String password);

	 int findEmpByNickname(String nickname);

	void registerEmp(Emp emp);

}
