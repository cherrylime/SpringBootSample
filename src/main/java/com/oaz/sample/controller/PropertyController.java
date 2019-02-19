package com.oaz.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oaz.sample.domain.security.SecurityMemberVO;

@Controller
public class PropertyController {

	  private Logger LOGGER = LoggerFactory.getLogger(PropertyController.class);
	    
	    @Value("${logging.path}")
	    private String logging_path;
	    
	    @RequestMapping("/openapi/getProperty")
	    public @ResponseBody String getProperty(@AuthenticationPrincipal SecurityMemberVO securityMember) {
	        
	        StringBuffer sb = new StringBuffer();
	        
	        if(securityMember != null) {
	            sb.append("securityMember.getIp()=")
	                .append(securityMember.getIp())
	                .append(" / ");
	        }else {
	            sb.append("securityMember is null / ");
	        }
	        sb.append("logging_path=")
	            .append(logging_path);
	        
	        LOGGER.debug(sb.toString());
	        
	        return sb.toString();
	        
	    }
	    
	    @RequestMapping("/getMember")
	    public @ResponseBody String getMember(@AuthenticationPrincipal SecurityMemberVO  securityMember) {
	        
	        StringBuffer sb = new StringBuffer();
	        
	        if(securityMember != null) {
	            sb.append("securityMember.getIp()=")
	            .append(securityMember.getIp());
	        }
	        
	        LOGGER.debug(sb.toString());
	        
	        return sb.toString();
	        
	    }


}
