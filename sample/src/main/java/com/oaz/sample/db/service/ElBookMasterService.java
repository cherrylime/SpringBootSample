package com.oaz.sample.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oaz.sample.db.dto.ElBookMaster;
import com.oaz.sample.db.mapper.ElBookMasterMapper;

@Service
public class ElBookMasterService {
	 @Autowired
	 ElBookMasterMapper elBookMasterMapper;
	 
	 public List<ElBookMaster> getAll() throws Exception{
	        return elBookMasterMapper.getAll();
	    }

}
