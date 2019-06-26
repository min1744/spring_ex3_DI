package com.iu.board;


public class BoardService {
	private BoardDAO boardDAO;

	public void setBoardDAO(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}
	
	public void insert() throws Exception{
		System.out.println("BoardService");
		boardDAO.insert();
	}
}