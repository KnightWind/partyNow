package com.bimaweng.party.logic.impl;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.bimaweng.party.dao.DAOProxy;
import com.libernate.liberd.Libernate;

/**
 * 其它公共引用也可以加到这里
 * 
 * @author 
 *
 */
public class BaseLogic {
	
	protected Log logger = LogFactory.getLog(this.getClass());
	
	
	protected static Libernate libernate = DAOProxy.getLibernate();
	
}
