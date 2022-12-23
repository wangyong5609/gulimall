package com.hhh.mall.order.dao;

import com.hhh.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wang yong
 * @email 1137917270@qq.com
 * @date 2022-12-23 23:29:26
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
