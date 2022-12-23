package com.hhh.mall.coupon.dao;

import com.hhh.mall.coupon.entity.HomeSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author wang yong
 * @email 1137917270@qq.com
 * @date 2022-12-23 23:09:14
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubjectEntity> {
	
}
