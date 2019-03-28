package com.oaz.sample.domain.security;

import org.springframework.security.core.userdetails.User;

public class SecurityMemberVO extends User {
	  	private static final long serialVersionUID = 1L;
	    
	    private String ip;
	    
	    public SecurityMemberVO(MemberVO member) {
	        super(member.getUsername(), member.getPassword(), member.getAuthorities());
	    }
	 
	    public String getIp() {
	        return ip;
	    }
	 
	    public void setIp(String ip) {
	        this.ip = ip;
	    }

}
