package com.bimaweng.party.service.impl;


import java.sql.SQLException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.bimaweng.party.dao.DAOProxy;
import com.bimaweng.party.entity.PageBean;
import com.libernate.liberd.Libernate;

/**
 * 其它公共引用也可以加到这里
 * 
 * @author martin
 *
 */
public class BaseService {
	
	protected Log logger = LogFactory.getLog(this.getClass());
	
	protected static Libernate libernate = DAOProxy.getLibernate();
	
	
	/**
	 * 一种可复用性直接查询分页对象的查询方法
	 * @param c 查询对象的类
	 * @param sql 查询sql 如select * from  t_tableName 
	 * @param pageNo 当前页
	 * @param pageSize  每页显示条
	 * @param objs  查询参数
	 * @return PageBean pageModel类的改装 兼容pageModel
	 */
	@SuppressWarnings("unchecked")
	public <T>PageBean<T> getPageBeans(Class<?> c,String sql,int pageNo,int pageSize,Object...objs){
		PageBean<T> page = new PageBean<T>();
		if(pageNo<1){
			pageNo = 1;
		}
		if(pageSize<1){
			pageSize = 10;
		}
		page.setPageNo(pageNo+"");
		page.setPageSize(pageSize);
		try {
			sql = sql.toLowerCase();
			String countsql = " select count(*) " + sql.substring(sql.indexOf("from"));
			String limitsql = sql+" limit "+(pageNo-1)*pageSize +","+pageSize;
			int count = libernate.countEntityListWithSql(countsql, objs);
			List<T> dataList = (List<T>) libernate.getEntityListBase(c,limitsql,objs);
			
			page.setRowsCount(count);
			page.setDatas(dataList);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return page;
	}
	
	public <T>PageBean<T> getPageBeans(Class<?> c,String sql,Object...objs){
		return getPageBeans(c, sql, 0, 0,objs);
	}
	public <T>PageBean<T> getPageBeans(Class<?> c,String sql,int pageNo,Object...objs){
		return getPageBeans(c, sql, pageNo, 0,objs);
	}
}
