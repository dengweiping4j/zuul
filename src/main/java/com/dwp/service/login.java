package com.dwp.service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * 登录
 *
 * @author dengweiping
 * @date 2021/1/6 13:54
 */
public class login {

/*    public LoginUser login(String userName, String password){
        // 检查密码
        User user = userService.checkUser(userName, password);

        LoginUser loginUser = LoginUser.builder()
                .userName(userName)
                .realName(user.getRealName())
                .userToken(UUID.randomUUID().toString())
                .loginTime(new Date())
                .build();

        // 保存session
        session.saveSession(loginUser);

        // 查询权限
        List<Permission> permissions = permissionRepository.findByUserName(userName);
        // 保存用户权限到缓存中
        session.saveUserPermissions(userName, permissions);

        return loginUser;
    }

    // ...
// 缓存用户权限到Redis
    public void saveUserPermissions(String userName, List<Permission> permissions) {
        String key = String.format("login:permission:%s", userName);

        HashOperations<String, String, Object> hashOperations = redisTemplate.opsForHash();
        hashOperations.putAll(key, permissions.stream().collect(
                Collectors.toMap(p -> p.getMethod().concat(":").concat(p.getUri()),
                        Permission::getName, (k1, k2) -> k2)));

        if (expireTime != null) {
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
        }
    }*/
}
