package com.hd.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hd.common.utils.PageUtils;
import com.hd.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author hd
 * @email 2368046759@qq.com
 * @date 2020-08-13 08:37:33
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

