package com.zr.ems.Dao;

import com.zr.ems.pojo.Emp;
/**
 * emp的持久层接口
 */
public interface IEmpDao {
	/**
	 * 通过昵称和密码查找emp对象
	 * 
	 * @param nickname
	 * @param password
	 * @return
	 */
	Emp findEmpByNicknameAndPassword(String nickname, String password);

	int findEmpByNickname(String nickname1);

	void zhuce(Emp emp);
}
