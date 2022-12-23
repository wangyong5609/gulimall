package com.hhh.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hhh.common.utils.PageUtils;
import com.hhh.mall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author wang yong
 * @email 1137917270@qq.com
 * @date 2022-12-23 23:09:14
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

