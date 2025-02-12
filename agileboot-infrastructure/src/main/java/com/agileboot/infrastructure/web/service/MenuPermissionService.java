package com.agileboot.infrastructure.web.service;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.agileboot.infrastructure.web.domain.login.LoginUser;
import com.agileboot.infrastructure.security.AuthenticationUtils;
import com.agileboot.orm.service.ISysUserService;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author valarchie
 */
@Service("permission")
public class MenuPermissionService {

    /**
     * 所有权限标识
     */
    private static final String ALL_PERMISSION = "*:*:*";


    /**
     * 验证用户是否具备某权限
     *
     * @param permission 权限字符串
     * @return 用户是否具备某权限
     */
    public boolean has(String permission) {
        if (StrUtil.isEmpty(permission)) {
            return false;
        }
        LoginUser loginUser = AuthenticationUtils.getLoginUser();
        if (loginUser == null || CollUtil.isEmpty(loginUser.getRoleInfo().getMenuPermissions())) {
            return false;
        }
        return has(loginUser.getRoleInfo().getMenuPermissions(), permission);
    }


    /**
     * 判断是否包含权限
     *
     * @param permissions 权限列表
     * @param permission 权限字符串
     * @return 用户是否具备某权限
     */
    private boolean has(Set<String> permissions, String permission) {
        return permissions.contains(ALL_PERMISSION) || permissions.contains(StrUtil.trim(permission));
    }

}
