/*
 * zmlk - LiberDFactory.java
 * 2011-8-2 涓嬪崍10:39:35
 */
package com.bimaweng.party.dao;

import com.libernate.liberd.Libernate;


/**
 * @Author
 * @version 2011-8-2 涓嬪崍10:39:35
 * 
 */
public class DAOProxy {
	public static Libernate getLibernate() {
		return Libernate.getInstance("libernate.datasource.bimaweng.partynow");
	}
}
