package com.bbm.sample.ccm.ccc.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;

import com.bbm.sample.ccm.ccc.service.CmmnClCode;
import com.bbm.sample.ccm.ccc.service.CmmnClCodeVO;
import com.bbm.sample.ccm.ccc.service.EgovCcmCmmnClCodeManageService;



/**
 * 
 * 공통분류코드에 대한 서비스 구현클래스를 정의한다
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
@Service("CmmnClCodeManageService")
public class EgovCcmCmmnClCodeManageServiceImpl extends AbstractServiceImpl implements EgovCcmCmmnClCodeManageService {

    @Resource(name="CmmnClCodeManageDAO")
    private CmmnClCodeManageDAO cmmnClCodeManageDAO;
    
	/**
	 * 공통분류코드를 삭제한다.
	 */
	public void deleteCmmnClCode(CmmnClCode cmmnClCode) throws Exception {
		cmmnClCodeManageDAO.deleteCmmnClCode(cmmnClCode);
	}

	/**
	 * 공통분류코드를 등록한다.
	 */
	public void insertCmmnClCode(CmmnClCode cmmnClCode) throws Exception {
    	cmmnClCodeManageDAO.insertCmmnClCode(cmmnClCode);    	
	}

	/**
	 * 공통분류코드 상세항목을 조회한다.
	 */
	public CmmnClCode selectCmmnClCodeDetail(CmmnClCode cmmnClCode) throws Exception {
    	CmmnClCode ret = (CmmnClCode)cmmnClCodeManageDAO.selectCmmnClCodeDetail(cmmnClCode);
    	return ret;
	}

	/**
	 * 공통분류코드 목록을 조회한다.
	 */
	public List selectCmmnClCodeList(CmmnClCodeVO searchVO) throws Exception {
        return cmmnClCodeManageDAO.selectCmmnClCodeList(searchVO);
	}

	/**
	 * 공통분류코드 총 갯수를 조회한다.
	 */
	public int selectCmmnClCodeListTotCnt(CmmnClCodeVO searchVO) throws Exception {
        return cmmnClCodeManageDAO.selectCmmnClCodeListTotCnt(searchVO);
	}

	/**
	 * 공통분류코드를 수정한다.
	 */
	public void updateCmmnClCode(CmmnClCode cmmnClCode) throws Exception {
		cmmnClCodeManageDAO.updateCmmnClCode(cmmnClCode);
	}

}
