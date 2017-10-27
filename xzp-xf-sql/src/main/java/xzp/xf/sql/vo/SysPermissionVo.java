package xzp.xf.sql.vo;

import java.io.Serializable;

/**
 * 
 * @author xiao
 */
public class SysPermissionVo implements Serializable{
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
     * @return Long
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
     * @return String
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
     * @return String
     */	
    public String getSysPermissionDes(){
    	return sysPermissionDes;
    }
}