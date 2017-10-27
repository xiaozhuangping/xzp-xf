package xzp.xf.sql.entity;

import java.io.Serializable;

/**
 * 
 * @author xiao
 */
public class XinClassify implements Serializable{
	/**
	 *  
	 */
	private Long xinClassifyId;
	/**
	 *  分类名称
	 */
	private String xinClassifyName;
	/**
	 *  分类类型：可分为肉类，菜类。以数字代替。
	 */
	private Integer xinClassifyType;
	/**
	 *  分类描述
	 */
	private String xinClassifyDes;
	/**
	 *  分类图片
	 */
	private String xinClassifyImg;
	/**
	 *  分类状态：0不可用，1可用
	 */
	private Integer xinClassifyState;
	/**
	 * 
	 * @param xinClassifyId
	 */
	public void setXinClassifyId(Long xinClassifyId){
		this.xinClassifyId = xinClassifyId;
	}
	
    /**
     * 
     * @return
     */	
    public Long getXinClassifyId(){
    	return xinClassifyId;
    }
	/**
	 * 分类名称
	 * @param xinClassifyName
	 */
	public void setXinClassifyName(String xinClassifyName){
		this.xinClassifyName = xinClassifyName;
	}
	
    /**
     * 分类名称
     * @return
     */	
    public String getXinClassifyName(){
    	return xinClassifyName;
    }
	/**
	 * 分类类型：可分为肉类，菜类。以数字代替。
	 * @param xinClassifyType
	 */
	public void setXinClassifyType(Integer xinClassifyType){
		this.xinClassifyType = xinClassifyType;
	}
	
    /**
     * 分类类型：可分为肉类，菜类。以数字代替。
     * @return
     */	
    public Integer getXinClassifyType(){
    	return xinClassifyType;
    }
	/**
	 * 分类描述
	 * @param xinClassifyDes
	 */
	public void setXinClassifyDes(String xinClassifyDes){
		this.xinClassifyDes = xinClassifyDes;
	}
	
    /**
     * 分类描述
     * @return
     */	
    public String getXinClassifyDes(){
    	return xinClassifyDes;
    }
	/**
	 * 分类图片
	 * @param xinClassifyImg
	 */
	public void setXinClassifyImg(String xinClassifyImg){
		this.xinClassifyImg = xinClassifyImg;
	}
	
    /**
     * 分类图片
     * @return
     */	
    public String getXinClassifyImg(){
    	return xinClassifyImg;
    }
	/**
	 * 分类状态：0不可用，1可用
	 * @param xinClassifyState
	 */
	public void setXinClassifyState(Integer xinClassifyState){
		this.xinClassifyState = xinClassifyState;
	}
	
    /**
     * 分类状态：0不可用，1可用
     * @return
     */	
    public Integer getXinClassifyState(){
    	return xinClassifyState;
    }
}