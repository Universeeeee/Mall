package com.guli.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guli.product.entity.BrandEntity;
import com.guli.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("Apple");
//        brandEntity.setDescript("xx");
//        brandService.save(brandEntity);
//        System.out.println("=====================保存成功==========================");
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("修改");
//        brandService.updateById(brandEntity);
//        System.out.println("=====================修改成功==========================");
        List<BrandEntity> brandEntities = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brandEntities.forEach(item->{
            System.out.println(item);
        });
    }

}
