package com.iu.notice;

import javax.inject.Inject;

import com.iu.util.DBConnector;

public class NoticeDAO {
	@Inject
	private DBConnector dbConnector;
	
	public void insert() throws Exception{
		System.out.println(dbConnector);
		System.out.println("NoticeDAO");
	}
}