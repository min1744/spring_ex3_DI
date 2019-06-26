package com.iu.board;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.iu.util.DBConnector;


public class BoardDAO {

   private DBConnector dbConnector;
   
   public BoardDAO(DBConnector dbConnector) {
      this.dbConnector=dbConnector;
   }
   
   public void insert() throws Exception{
      System.out.println(dbConnector.getConnect());
      System.out.println("DAO Insert");
   }
}