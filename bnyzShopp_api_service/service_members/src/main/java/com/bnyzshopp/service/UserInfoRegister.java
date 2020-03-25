package com.bnyzshopp.service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.alibaba.fastjson.JSONObject;
import com.bnyzshopp.entity.UserInfo;
import com.bnyzshopp.result.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(tags = "会员注册接口")
public interface UserInfoRegister {
	/**
	 * 用户注册接口
	 * 
	 * @param UserInfo
	 * @return
	 */
	@PostMapping("/register")
	@ApiOperation(value = "会员用户注册信息接口")
	BaseResponse<JSONObject> register(@RequestBody UserInfo userInfo,@RequestParam("registCode") String registCode);
}
