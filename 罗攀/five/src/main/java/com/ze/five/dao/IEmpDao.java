package com.ze.five.dao;

import com.zr.five.pojo.Emp;

public interface IEmpDao {
	Emp findEmpByNicknameAndPassword(String nickname,String password);

	int findEmpByNickname(String nickname);

	void registerEmp(Emp emp);

}
