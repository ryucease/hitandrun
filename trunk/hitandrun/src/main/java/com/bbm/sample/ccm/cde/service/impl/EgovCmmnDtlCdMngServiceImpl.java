package com.bbm.sample.ccm.cde.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import com.bbm.sample.ccm.cde.service.CmmnDetailCode;
import com.bbm.sample.ccm.cde.service.CmmnDetailCodeVO;
import com.bbm.sample.ccm.cde.service.EgovCcmCmmnDetailCodeManageService;



/**
 * 
 * 공통상세코드에 대한 서비스 구현클래스를 정의한다
 * @author 공통서비스 개발팀 이중호
 * @since 2009.04.01
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2009.04.01  이중호          최초 생성
 *
 * </pre>
 */
@Service("CmmnDetailCodeManageService")
public class EgovCmmnDtlCdMngServiceImpl extends AbstractServiceImpl implements EgovCcmCmmnDetailCodeManageService {

    @Resource(name="CmmnDetailCodeManageDAO")
    private CmmnDetailCodeManageDAO cmmnDetailCodeManageDAO;
    
	/**
	 * 공통상세코드를 삭제한다.
	 */
	public void deleteCmmnDetailCode(CmmnDetailCode cmmnDetailCode) throws Exception {
		cmmnDetailCodeManageDAO.deleteCmmnDetailCode(cmmnDetailCode);
	}

	/**
	 * 공통상세코드를 등록한다.
	 */
	public void insertCmmnDetailCode(CmmnDetailCode cmmnDetailCode) throws Exception {
    	cmmnDetailCodeManageDAO.insertCmmnDetailCode(cmmnDetailCode);    	
	}

	/**
	 * 공통상세코드 상세항목을 조회한다.
	 */
	public CmmnDetailCode selectCmmnDetailCodeDetail(CmmnDetailCode cmmnDetailCode) throws Exception {
    	CmmnDetailCode ret = (CmmnDetailCode)cmmnDetailCodeManageDAO.selectCmmnDetailCodeDetail(cmmnDetailCode);
    	return ret;
	}

	/**
	 * 공통상세코드 목록을 조회한다.
	 */
	public List selectCmmnDetailCodeList(CmmnDetailCodeVO searchVO) throws Exception {
        return cmmnDetailCodeManageDAO.selectCmmnDetailCodeList(searchVO);
	}

	/**
	 * 공통상세코드 총 갯수를 조회한다.
	 */
	public int selectCmmnDetailCodeListTotCnt(CmmnDetailCodeVO searchVO) throws Exception {
        return cmmnDetailCodeManageDAO.selectCmmnDetailCodeListTotCnt(searchVO);
	}

	/**
	 * 공통상세코드를 수정한다.
	 */
	public void updateCmmnDetailCode(CmmnDetailCode cmmnDetailCode) throws Exception {
		cmmnDetailCodeManageDAO.updateCmmnDetailCode(cmmnDetailCode);
	}

	/**
	 * 공통상세코드를 수정한다.
	 */
	public void updateCmmnDetailCodes(List cmmnDetailCodes) throws Exception {
		for(int i=0; i<cmmnDetailCodes.size(); i++) {
			CmmnDetailCode cmmnDetailCode = (CmmnDetailCode)cmmnDetailCodes.get(i);
			//log.debug("cmmnDetailCode................"+ cmmnDetailCode.getCode());			
			cmmnDetailCodeManageDAO.updateCmmnDetailCode(cmmnDetailCode);
		}
	}	
}
