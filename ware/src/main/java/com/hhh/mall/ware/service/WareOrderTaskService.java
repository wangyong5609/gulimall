package com.hhh.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hhh.common.utils.PageUtils;
import com.hhh.mall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author wang yong
 * @email 1137917270@qq.com
 * @date 2022-12-23 23:31:29
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

