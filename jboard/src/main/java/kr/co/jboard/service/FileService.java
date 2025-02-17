package kr.co.jboard.service;

import java.util.List;

import kr.co.jboard.dao.FileDAO;
import kr.co.jboard.dto.FileDTO;



public enum FileService {

	
	INSTANCE;
	private FileDAO  dao = FileDAO.getInstance();
	
	public void registerFile(FileDTO dto) {
		dao.insertFile(dto);	
	}
	
	public FileDTO findUser(int cno) {
		return dao.selectFile(cno);
	}
	
	public List<FileDTO> findAllFile() {
		return dao.selectAllFile();
	}
	public void modifyFile(FileDTO dto) {
		dao.updateFile(dto);
	}
	
	public void deleteFile(int cno) {
		dao.deleteFile(cno);
	}
}