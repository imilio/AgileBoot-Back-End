package com.agileboot.infrastructure.cache;

import com.agileboot.infrastructure.cache.guava.GuavaCacheService;
import com.agileboot.infrastructure.cache.guava.GuavaCacheTemplate;
import com.agileboot.infrastructure.cache.redis.RedisCacheService;
import com.agileboot.infrastructure.cache.redis.RedisCacheTemplate;
import com.agileboot.infrastructure.interceptor.repeatsubmit.RepeatRequest;
import com.agileboot.infrastructure.web.domain.login.LoginUser;
import com.agileboot.orm.entity.SysDeptEntity;
import com.agileboot.orm.entity.SysUserEntity;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 缓存中心  提供全局访问点
 */
@Component
public class CacheCenter {

    private static GuavaCacheService guavaCache;

    private static RedisCacheService redisCache;

    public static GuavaCacheTemplate<String> configCache;

    public static GuavaCacheTemplate<SysDeptEntity> deptCache;

    public static RedisCacheTemplate<String> captchaCache;

    public static RedisCacheTemplate<LoginUser> loginUserCache;

    public static RedisCacheTemplate<RepeatRequest> repeatSubmitCache;

    public static RedisCacheTemplate<SysUserEntity> userCache;

    @PostConstruct
    public void init() {

        configCache = guavaCache.configCache;
        deptCache = guavaCache.deptCache;

        captchaCache = redisCache.captchaCache;
        loginUserCache = redisCache.loginUserCache;
        repeatSubmitCache = redisCache.repeatSubmitCache;
        userCache = redisCache.userCache;

    }

    @Autowired
    public void setGuavaCache(GuavaCacheService guavaCache) {
        CacheCenter.guavaCache = guavaCache;
    }

    @Autowired
    public void setRedisCache(RedisCacheService redisCache) {
        CacheCenter.redisCache = redisCache;
    }

}
