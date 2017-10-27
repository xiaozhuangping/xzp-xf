package xzp.xf.sql.vo;

import java.io.Serializable;

/**
 * 
 * @author xiao
 */
public class SysRoleVo implements Serializable{
	/**
	 *  
	 */
	private Long sysRoleId;
	/**
	 *  
	 */
	private String sysRoleName;
	/**
	 *  
	 */
	private String sysRoleDes;
	/**
	 * 
	 * @param sysRoleId
	 */
	public void setSysRoleId(Long sysRoleId){
		this.sysRoleId = sysRoleId;
	}
	
    /**
     * 
     * @return Long
     */	
    public Long getSysRoleId(){
    	return sysRoleId;
    }
	/**
	 * 
	 * @param sysRoleName
	 */
	public void setSysRoleName(String sysRoleName){
		this.sysRoleName = sysRoleName;
	}
	
    /**
     * 
     * @return String
     */	
    public String getSysRoleName(){
    	return sysRoleName;
    }
	/**
	 * 
	 * @param sysRoleDes
	 */
	public void setSysRoleDes(String sysRoleDes){
		this.sysRoleDes = sysRoleDes;
	}
	
    /**
     * 
     * @return String
     */	
    public String getSysRoleDes(){
    	return sysRoleDes;
    }
}