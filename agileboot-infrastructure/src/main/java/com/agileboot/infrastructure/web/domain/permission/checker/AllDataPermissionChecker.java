package com.agileboot.infrastructure.web.domain.permission.checker;

import com.agileboot.infrastructure.web.domain.login.LoginUser;
import com.agileboot.infrastructure.web.domain.login.RoleInfo;
import com.agileboot.infrastructure.web.domain.permission.DataCondition;
import com.agileboot.infrastructure.web.domain.permission.DataPermissionChecker;
import com.agileboot.orm.service.ISysDeptService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 数据权限测试接口
 * @author valarchie
 */
@Data
public class AllDataPermissionChecker extends DataPermissionChecker {

    private ISysDeptService deptService;


    @Override
    public boolean check(LoginUser loginUser, DataCondition condition) {
        return true;
    }
}
