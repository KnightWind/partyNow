package com.bimaweng.party.action;


import javax.servlet.http.HttpServletRequest;


import com.libernate.liberc.annotation.Disabled;

@Disabled
public abstract class BaseController {

	/**
	 * 设置提示信息
	 * 
	 * @param request
	 * @param message
	 */

	protected void setInfoMessage(HttpServletRequest request, String message) {
		if (request.getAttribute("errorMessage") != null) {
			throw new IllegalStateException("errorMessage is set before.");
		}
		request.setAttribute("infoMessage", message);
	}

	/**
	 * 设置错误信息
	 * 
	 * @param request
	 * @param message
	 */
	protected void setErrMessage(HttpServletRequest request, String message) {
		if (request.getAttribute("infoMessage") != null) {
			throw new IllegalStateException("infoMessage is set before.");
		}
		request.setAttribute("errorMessage", message);
	}
}
