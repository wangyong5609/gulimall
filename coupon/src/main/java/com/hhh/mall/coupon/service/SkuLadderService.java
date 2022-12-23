package com.hhh.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hhh.common.utils.PageUtils;
import com.hhh.mall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author wang yong
 * @email 1137917270@qq.com
 * @date 2022-12-23 23:09:14
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

