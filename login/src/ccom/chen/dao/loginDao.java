package ccom.chen.dao;

import java.sql.SQLException;
import java.util.List;


import com.chen.bean.User;

public interface loginDao {
	//查询列表中所有的账号
	public List<User> findAccunt();
	//查询是否存在
	public User findUser(String username);
	//删除操作
	public int delete(Integer id) throws SQLException;
	//添加新用户
	public void AddUser(User user);
	//更新操作
	public int Update(User user);
	//根据id查找用户
	public int findID(Integer id);
}
