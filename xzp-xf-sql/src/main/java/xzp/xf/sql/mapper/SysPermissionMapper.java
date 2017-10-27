package xzp.xf.sql.mapper;

import xzp.xf.sql.entity.SysPermission;

public interface SysPermissionMapper {

	void insertSysPermission(SysPermission sysPermission);

	void deleteSysPermissionBySysPermissionId(Long sysPermissionId);

	void updateSysPermission(SysPermission sysPermission);

} 
