package kr.co.jboard.dao;

import java.util.List;

import kr.co.jboard.dto.UserDTO;

public class UserDAO {
	private static final UserDAO INSTANCE = new UserDAO();
	public static UserDAO getInstance() {
		return INSTANCE;
	}
	private UserDAO() {}
	
	public void insertUser(UserDTO dto) {
		
	}
	
	public UserDTO selectUser(String uid) {
		return null;
	}
	
	public List<UserDTO> selectAllUser() {
		return null;
	}
	
	public void updateUser(UserDTO dto) {
		
	}
	
	public void deleteUser(String uid) {
		
	}
}