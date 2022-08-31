package com.atguigu.gmall.product.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author: 李耀华
 * @date: 2022/8/30 1:41
 */
public interface FileUploadService {
    String upload(MultipartFile file) throws Exception;
}
