package com.hhh.mall.member.feign;

import com.hhh.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("coupon")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/list/member")
    R memberCoupons();
}
