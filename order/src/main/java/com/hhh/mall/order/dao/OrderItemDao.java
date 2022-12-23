package com.hhh.mall.order.dao;

import com.hhh.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author wang yong
 * @email 1137917270@qq.com
 * @date 2022-12-23 23:29:26
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
