package com.bnyzshopp.service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bnyzshopp.entity.UserInfo;
import com.bnyzshopp.result.BaseResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @description: 会员服务接口
 * @author:互联网架构师-dujinbin
 * @date: 2020年3月21日 下午3:03:17
 * @version V1.0
 * @Copyright 该项目“基于SpringCloud2.x构建微服务养殖电商项目
 */

@Api(tags = "会员服务接口")
public interface UserInfoService {

	/**
	 * 根据手机号码查询是否已经存在,如果存在返回当前用户信息
	 * 
	 * @param mobile
	 * @return
	 */
	@ApiOperation(value = "根据手机号码查询是否已经存在")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "phone", dataType = "String", required = true, value = "用户手机号码"), })
	@PostMapping("/existMobile")
	BaseResponse<UserInfo> existMobile(@RequestParam("mobile") String mobile);

}