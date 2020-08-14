package com.hd.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hd.common.utils.PageUtils;
import com.hd.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author hd
 * @email 2368046759@qq.com
 * @date 2020-08-13 10:54:33
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

