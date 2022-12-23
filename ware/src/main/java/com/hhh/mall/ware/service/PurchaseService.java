package com.hhh.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hhh.common.utils.PageUtils;
import com.hhh.mall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author wang yong
 * @email 1137917270@qq.com
 * @date 2022-12-23 23:31:29
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

