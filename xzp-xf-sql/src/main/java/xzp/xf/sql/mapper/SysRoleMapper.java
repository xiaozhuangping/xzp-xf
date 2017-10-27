package xzp.xf.sql.mapper;

import org.apache.ibatis.annotations.Param;
import xzp.xf.sql.entity.SysRole;
import xzp.xf.sql.vo.SysRoleVo;

import java.util.List;
import java.util.Map;

public interface SysRoleMapper {

	void insertSysRole(SysRole sysRole);

	void deleteSysRoleBySysRoleId(Long sysRoleId);

	void updateSysRole(SysRole sysRole);

	List<SysRoleVo> searchSysRoleByParams(@Param("map") Map<String,Object> map);

} 
