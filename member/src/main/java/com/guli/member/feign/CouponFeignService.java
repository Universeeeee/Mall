package com.guli.member.feign;

import com.guli.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: csy
 * @create: 2024-02-01
 * @FileName: CouponFeignService
 * @description:
 * */
@FeignClient("coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/couponList")
    public R memberCoupons();
}
