package com.bnyzshopp.mappers;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;
import com.bnyzshopp.entity.UserInfo;

/**
 * @description: 用户Mapper
 * @author:互联网架构师-dujinbin
 * @date: 2020年3月21日 下午3:03:17
 * @version V1.0
 * @Copyright 该项目“基于SpringCloud2.x构建微服务养殖电商项目
 */
public interface UserInfoMapper {

	@Insert("INSERT INTO `meite_user` VALUES (null,#{mobile}, #{email}, #{password}, #{userName}, null, null, null, '1', null, null, null);")
	int register(UserInfo userInfo);

	@Select("SELECT * FROM meite_user WHERE MOBILE=#{mobile};")
	UserInfo existMobile(@Param("mobile") String mobile);
}