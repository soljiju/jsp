package kr.co.jboard.service;

import java.util.List;

import kr.co.jboard.dao.TermsDAO;
import kr.co.jboard.dto.TermsDTO;





public enum TermsService {
		
	INSTANCE;
	private TermsDAO dao = TermsDAO.getInstance();
	
	public void registerTerms(TermsDTO dto) {
		dao.insertTerms(dto);	
	}
	
	public TermsDTO findTerms(int cno) {
		return dao.selectTerms(cno);
	}
	
	public List<TermsDTO> findAllTerms() {
		return dao.selectAllTerms();
	}
	public void modifyTerms(TermsDTO dto) {
		dao.updateTerms(dto);
	}
	
	public void deleteTerms(int cno) {
		dao.deleteTerms(cno);
	}
}