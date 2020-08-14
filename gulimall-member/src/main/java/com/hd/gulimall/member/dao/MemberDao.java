package com.hd.gulimall.member.dao;

import com.hd.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hd
 * @email 2368046759@qq.com
 * @date 2020-08-13 19:04:21
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
