package com.ly.ems.Dao;

import com.ly.ems.pojo.Emp;

public interface IEmpDao {
	Emp findEmpByUserNameAndPassWord(String username,String password);

	int findEmpByUserName(String username);

	void addEmpByAll(Emp emp);
}
