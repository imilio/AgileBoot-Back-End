package com.agileboot.orm.service.impl;

import com.agileboot.orm.entity.SysOperationLogEntity;
import com.agileboot.orm.mapper.SysOperationLogMapper;
import com.agileboot.orm.service.ISysOperationLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志记录 服务实现类
 * </p>
 *
 * @author valarchie
 * @since 2022-06-08
 */
@Service
public class SysOperationLogServiceImpl extends ServiceImpl<SysOperationLogMapper, SysOperationLogEntity> implements
    ISysOperationLogService {

}
