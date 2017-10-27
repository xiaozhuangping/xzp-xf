package impl.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xzp.xf.pro.impl.Application;
import xzp.xf.sql.entity.SysRole;
import xzp.xf.sql.mapper.SysRoleMapper;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class Testsql {

    private Logger logger = LoggerFactory.getLogger(Testsql.class);

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Test
    public void getSysRole(){
        SysRole sysRole = new SysRole();
        sysRole.setSysRoleId(123458L);
        sysRole.setSysRoleDes("sadw");
        sysRole.setSysRoleName("123");
        sysRoleMapper.insertSysRole(sysRole);
    }

    @Test
    public void getSysRoles(){
        PageHelper.startPage(1,3);
        List list = sysRoleMapper.searchSysRoleByParams(null);
        //用PageInfo对结果进行包装
        PageInfo page = new PageInfo(list);
        //测试PageInfo全部属性
        //PageInfo包含了非常全面的分页属性
        logger.info(page.toString());

    }
}
