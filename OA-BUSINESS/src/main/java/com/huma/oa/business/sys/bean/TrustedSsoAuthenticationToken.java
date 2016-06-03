package com.huma.oa.business.sys.bean;

import org.apache.shiro.authc.UsernamePasswordToken;

public class TrustedSsoAuthenticationToken  extends UsernamePasswordToken{
    private static final long serialVersionUID = 1L;
    private String newPassword;

    public TrustedSsoAuthenticationToken(String username, String password,String newPassword,
            boolean rememberMe, String host) {
         super(username, password, rememberMe, host);
         this.newPassword= newPassword;
        // TODO Auto-generated constructor stub
    }
    public TrustedSsoAuthenticationToken(String username, String password,
            boolean rememberMe, String host) {
         super(username, password, rememberMe, host);
        
        // TODO Auto-generated constructor stub
    }

    public String getNewPassword() {
        return newPassword;
    }
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
    
}
