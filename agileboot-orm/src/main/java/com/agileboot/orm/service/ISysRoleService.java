package com.agileboot.orm.service;

import com.agileboot.orm.entity.SysRoleEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 角色信息表 服务类
 * </p>
 *
 * @author valarchie
 * @since 2022-06-16
 */
public interface ISysRoleService extends IService<SysRoleEntity> {


    /**
     * 校验角色名称是否唯一
     * @return 结果
     */
    boolean isRoleNameDuplicated(Long roleId, String roleName);

    /**
     * 校验角色权限是否唯一
     * @return 结果
     */
    boolean isRoleKeyDuplicated(Long roleId, String roleKey);


    /**
     * 检测角色是否分配给用户
     * @param roleId
     * @return
     */
    boolean isAssignedToUsers(Long roleId);


}
