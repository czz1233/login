package ccom.chen.dao;

import java.sql.SQLException;
import java.util.List;


import com.chen.bean.User;

public interface loginDao {
	//��ѯ�б������е��˺�
	public List<User> findAccunt();
	//��ѯ�Ƿ����
	public User findUser(String username);
	//ɾ������
	public int delete(Integer id) throws SQLException;
	//������û�
	public void AddUser(User user);
	//���²���
	public int Update(User user);
	//����id�����û�
	public int findID(Integer id);
}
