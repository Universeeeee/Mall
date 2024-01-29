package com.guli.member.dao;

import com.guli.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author csy
 * @email Yixxxiu@gmail.com
 * @date 2024-01-29 17:44:14
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
