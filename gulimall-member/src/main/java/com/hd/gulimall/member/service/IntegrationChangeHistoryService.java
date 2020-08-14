package com.hd.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hd.common.utils.PageUtils;
import com.hd.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author hd
 * @email 2368046759@qq.com
 * @date 2020-08-13 19:04:21
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

