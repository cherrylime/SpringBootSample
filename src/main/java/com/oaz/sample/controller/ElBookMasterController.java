package com.oaz.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oaz.sample.db.dto.ElBookMaster;
import com.oaz.sample.db.service.ElBookMasterService;

@Controller
public class ElBookMasterController {

    @Autowired
    ElBookMasterService elBookMasterService;


	 @RequestMapping("/elBookMasterList")
	  public @ResponseBody List<ElBookMaster> getElBookMasterList() throws Exception{
		 	
	        return elBookMasterService.getAll();
	    }
}
