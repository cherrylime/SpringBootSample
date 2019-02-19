package com.oaz.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oaz.sample.db.mapper.UserMapper;
import com.oaz.sample.domain.security.MemberVO;

@Controller
public class UserController {
	 @Autowired
	    UserMapper userMapper;
	    
	    @RequestMapping("/openapi/readUser/{username}")
	    public @ResponseBody String  openApiReadUser(@PathVariable String username) {
	        MemberVO member = userMapper.readUser(username);
	        return member.getName();
	    }
	    
	    @RequestMapping("/openapi/readAuthority/{username}")
	    public @ResponseBody String  openApiReadAuthority(@PathVariable String username) {
	        List<String> auths = userMapper.readAuthority(username);
	        
	        StringBuffer buf = new StringBuffer();
	        for(String auth : auths) {
	            buf.append(auth);
	            buf.append(" ");
	        }
	        return buf.toString();
	    }

}
