package com.hhh.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hhh.common.utils.PageUtils;
import com.hhh.mall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author wang yong
 * @email 1137917270@qq.com
 * @date 2022-12-23 23:31:29
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

