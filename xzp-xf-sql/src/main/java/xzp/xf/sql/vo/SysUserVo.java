package xzp.xf.sql.vo;

import java.io.Serializable;

/**
 * 
 * @author xiao
 */
public class SysUserVo implements Serializable{
	/**
	 *  
	 */
	private Long sysUserId;
	/**
	 *  
	 */
	private String sysUserName;
	/**
	 *  
	 */
	private String sysUserDes;
	/**
	 *  
	 */
	private String sysUserPwd;
	/**
	 * 
	 * @param sysUserId
	 */
	public void setSysUserId(Long sysUserId){
		this.sysUserId = sysUserId;
	}
	
    /**
     * 
     * @return Long
     */	
    public Long getSysUserId(){
    	return sysUserId;
    }
	/**
	 * 
	 * @param sysUserName
	 */
	public void setSysUserName(String sysUserName){
		this.sysUserName = sysUserName;
	}
	
    /**
     * 
     * @return String
     */	
    public String getSysUserName(){
    	return sysUserName;
    }
	/**
	 * 
	 * @param sysUserDes
	 */
	public void setSysUserDes(String sysUserDes){
		this.sysUserDes = sysUserDes;
	}
	
    /**
     * 
     * @return String
     */	
    public String getSysUserDes(){
    	return sysUserDes;
    }
	/**
	 * 
	 * @param sysUserPwd
	 */
	public void setSysUserPwd(String sysUserPwd){
		this.sysUserPwd = sysUserPwd;
	}
	
    /**
     * 
     * @return String
     */	
    public String getSysUserPwd(){
    	return sysUserPwd;
    }
}