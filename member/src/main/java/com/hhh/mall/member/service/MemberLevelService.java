package com.hhh.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hhh.common.utils.PageUtils;
import com.hhh.mall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author wang yong
 * @email 1137917270@qq.com
 * @date 2022-12-23 23:19:08
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

