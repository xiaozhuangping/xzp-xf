package xzp.xf.sql.mapper;


import xzp.xf.sql.entity.SysUser;

public interface SysUserMapper {

	void insertSysUser(SysUser sysUser);

	void deleteSysUserBySysUserId(Long sysUserId);

	void updateSysUser(SysUser sysUser);

} 
