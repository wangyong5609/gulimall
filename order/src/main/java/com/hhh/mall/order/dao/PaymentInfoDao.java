package com.hhh.mall.order.dao;

import com.hhh.mall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author wang yong
 * @email 1137917270@qq.com
 * @date 2022-12-23 23:29:26
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
