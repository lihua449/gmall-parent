package com.atguigu.gmall.user.api;

import com.atguigu.gmall.common.auth.AuthUtils;
import com.atguigu.gmall.common.result.Result;
import com.atguigu.gmall.model.user.UserAddress;
import com.atguigu.gmall.model.vo.user.UserAuthInfo;
import com.atguigu.gmall.user.service.UserAddressService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: 李耀华
 * @date: 2022/9/14 9:06
 */

@RequestMapping("/api/inner/rpc/user")
@RestController
public class UserApiController {

    @Autowired
    UserAddressService userAddressService;


    @GetMapping("/address/list")
    public Result<List<UserAddress>> getUserAddressList(){

        UserAuthInfo info = AuthUtils.getCurrentAuthInfo();

        Long userId = info.getUserId();

        List<UserAddress> userAddresses = userAddressService.list(new LambdaQueryWrapper<UserAddress>().eq(UserAddress::getUserId, userId));

        return Result.ok(userAddresses);
    }
}
