package xzp.xf.sql.mapper;

import xzp.xf.sql.entity.XinClassify;

public interface XinClassifyMapper {

	void insertXinClassify(XinClassify xinClassify);

	void deleteXinClassifyByXinClassifyId(Long xinClassifyId);

	void updateXinClassify(XinClassify xinClassify);

} 
