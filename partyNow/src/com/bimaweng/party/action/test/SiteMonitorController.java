package com.bimaweng.party.action.test;

import javax.servlet.http.HttpServletRequest;

import com.bimaweng.party.action.BaseController;
import com.libernate.liberc.ActionForward;
import com.libernate.liberc.annotation.AsController;
import com.libernate.liberc.annotation.ReqPath;
@ReqPath("test")
public class SiteMonitorController extends BaseController{
	
	@AsController(path = "list")
	public Object list(HttpServletRequest request) throws Exception{
		
		 
		return new ActionForward.Text("{username:\"wang\",age:\"25\"}");
	}
	
}
