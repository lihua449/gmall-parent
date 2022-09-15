package com.atguigu.gmall.search.repository;

import com.atguigu.gmall.model.list.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author: 李耀华
 * @date: 2022/9/3 23:26
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {

}
