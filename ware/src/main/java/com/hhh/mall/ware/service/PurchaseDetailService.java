package com.hhh.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hhh.common.utils.PageUtils;
import com.hhh.mall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author wang yong
 * @email 1137917270@qq.com
 * @date 2022-12-23 23:31:29
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

