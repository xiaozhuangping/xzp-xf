package xzp.xf.sql.entity;

import java.io.Serializable;

/**
 * 
 * @author xiao
 */
public class SysRole implements Serializable{
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
     * @return
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
     * @return
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
     * @return
     */	
    public String getSysRoleDes(){
    	return sysRoleDes;
    }
}