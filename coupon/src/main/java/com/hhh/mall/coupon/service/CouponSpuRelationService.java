package com.hhh.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hhh.common.utils.PageUtils;
import com.hhh.mall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author wang yong
 * @email 1137917270@qq.com
 * @date 2022-12-23 23:09:14
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

