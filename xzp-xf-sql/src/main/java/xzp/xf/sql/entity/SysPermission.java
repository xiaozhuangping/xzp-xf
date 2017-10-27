package xzp.xf.sql.entity;

import java.io.Serializable;

/**
 * 
 * @author xiao
 */
public class SysPermission implements Serializable{
	/**
	 *  
	 */
	private Long sysPermissionId;
	/**
	 *  
	 */
	private String sysPermissionName;
	/**
	 *  
	 */
	private String sysPermissionDes;
	/**
	 * 
	 * @param sysPermissionId
	 */
	public void setSysPermissionId(Long sysPermissionId){
		this.sysPermissionId = sysPermissionId;
	}
	
    /**
     * 
     * @return
     */	
    public Long getSysPermissionId(){
    	return sysPermissionId;
    }
	/**
	 * 
	 * @param sysPermissionName
	 */
	public void setSysPermissionName(String sysPermissionName){
		this.sysPermissionName = sysPermissionName;
	}
	
    /**
     * 
     * @return
     */	
    public String getSysPermissionName(){
    	return sysPermissionName;
    }
	/**
	 * 
	 * @param sysPermissionDes
	 */
	public void setSysPermissionDes(String sysPermissionDes){
		this.sysPermissionDes = sysPermissionDes;
	}
	
    /**
     * 
     * @return
     */	
    public String getSysPermissionDes(){
    	return sysPermissionDes;
    }
}