package kr.co.jboard.dao;

import java.util.List;

import kr.co.jboard.dto.FileDTO;

public class FileDAO {
	private static final FileDAO INSTANCE = new FileDAO();
	public static FileDAO getInstance() {
		return INSTANCE;
	}
	private FileDAO() {}
	
	public void insertFile(FileDTO dto) {
		
	}
	
	public FileDTO selectFile(int fno) {
		return null;
	}
	
	public List<FileDTO> selectAllFile() {
		return null;
	}
	
	public void updateFile(FileDTO dto) {
		
	}
	
	public void deleteFile(int fno) {
		
	}
}