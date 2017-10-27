package xzp.xf.sql.entity;

import java.io.Serializable;

/**
 * 
 * @author xiao
 */
public class SysUser implements Serializable{
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
     * @return
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
     * @return
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
     * @return
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
     * @return
     */	
    public String getSysUserPwd(){
    	return sysUserPwd;
    }
}