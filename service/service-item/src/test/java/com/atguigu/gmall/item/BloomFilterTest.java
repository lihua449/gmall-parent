package com.atguigu.gmall.item;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import org.junit.jupiter.api.Test;

/**
 * @author: 李耀华
 * @date: 2022/9/1 21:16
 */
public class BloomFilterTest {
    @Test
    public void bloomTest(){
        /**
         *
         */
        BloomFilter<Long> filter = BloomFilter.create(Funnels.longFunnel(), 10000, 0.0001);

        for (long i = 0; i < 20; i++) {
            filter.put(i);
        }

        System.out.println(filter.mightContain(1L));
        System.out.println(filter.mightContain(20L));
        System.out.println(filter.mightContain(99L));


    }
}
