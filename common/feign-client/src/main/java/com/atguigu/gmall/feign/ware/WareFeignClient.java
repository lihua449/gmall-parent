package com.atguigu.gmall.feign.ware;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: 李耀华
 * @date: 2022/9/14 20:16
 */
//https://search.bilibili.com/all?keyword=%E5%A8%B4%E5%A8%B4
@FeignClient(value = "ware-manage",url = "${app.ware-url:http://localhost:9001/}")
public interface WareFeignClient {

//    @GetMapping(value = "/all",produces = "text/html;charset=utf-8")
//    String search(@RequestParam("keyword") String keyword);

    /**
     * 查询一个商品是否有库存
     * @param skuId
     * @param num
     * @return
     */
    @GetMapping("/hasStock")
    String hasStock(@RequestParam("skuId") Long skuId,
                    @RequestParam("num") Integer num);
}
