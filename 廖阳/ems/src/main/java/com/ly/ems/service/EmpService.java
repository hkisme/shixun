package com.ly.ems.service;

import com.ly.ems.pojo.Emp;

public interface EmpService {
	Emp findEmpByNicknameAndPassword(String nickname, String password);
	int findEmpByUserName(String username);
	void addEmpByAll(Emp emp);

}
