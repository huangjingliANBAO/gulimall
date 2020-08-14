package com.hd.gulimall.coupons.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hd.gulimall.coupons.entity.CouponEntity;
import com.hd.gulimall.coupons.service.CouponService;
import com.hd.common.utils.PageUtils;
import com.hd.common.utils.R;



/**
 * 优惠券信息
 *
 * @author hd
 * @email 2368046759@qq.com
 * @date 2020-08-14 10:03:37
 */
@RestController
@RequestMapping("coupons/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupons:coupon:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupons:coupon:info")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupons:coupon:save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupons:coupon:update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupons:coupon:delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
