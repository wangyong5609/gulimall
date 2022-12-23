package com.hhh.mall.product;

import com.hhh.mall.product.entity.BrandEntity;
import com.hhh.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    public void contextLoads() {
        BrandEntity brand = new BrandEntity();
        brand.setName("asdasd");
        brandService.save(brand);
        System.out.printf("保存成功");
    }

}
