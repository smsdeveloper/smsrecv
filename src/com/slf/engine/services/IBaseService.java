package com.slf.engine.services;

import java.sql.SQLException;

import com.slf.engine.bo.LsMosms;

public interface IBaseService {

	public void addToDb(LsMosms lsMosms) throws SQLException;
	
}
