package com.bimaweng.party.action;

import javax.servlet.http.HttpServletRequest;

import com.libernate.liberc.ActionForward;
import com.libernate.liberc.annotation.AsController;
import com.libernate.liberc.annotation.ReqPath;
@ReqPath("regsiter")
public class RegisterController extends BaseController{
	
	@AsController(path = "reg")
	public Object list(HttpServletRequest request) throws Exception{
		
		
		return new ActionForward.Text("{username:\"wang\",age:\"25\"}");
	}
	
}
