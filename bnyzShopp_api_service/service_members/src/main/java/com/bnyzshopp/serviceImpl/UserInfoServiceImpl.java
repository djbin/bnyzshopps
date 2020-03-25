package com.bnyzshopp.serviceImpl;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bnyzshopp.service.UserInfoService;
import constants.InterCon;
import com.bnyzshopp.entity.UserInfo;
import com.bnyzshopp.mappers.UserInfoMapper;
import com.bnyzshopp.result.BaseApiService;
import com.bnyzshopp.result.BaseResponse;

/**
 * @description:会员服务接口实现
 * @author:互联网架构师-dujinbin
 * @date: 2020年3月21日 下午3:03:17
 * @version V1.0
 * @Copyright 该项目“基于SpringCloud2.x构建微服务养殖电商项目
 */
@RestController
public class UserInfoServiceImpl extends BaseApiService<UserInfo> implements UserInfoService {
	@Autowired
	private UserInfoMapper userMapper;

	@Override
	public BaseResponse<UserInfo> existMobile(String mobile) {
		// 1.验证参数
		if (StringUtils.isEmpty(mobile)) {
			return setResultError("手机号码不能为空!");
		}
		// 2.根据手机号码查询用户信息 单独定义code 表示是用户信息不存在把
		UserInfo userEntity = userMapper.existMobile(mobile);
		if (userEntity == null) {
			return setResultError(InterCon.HTTP_RES_CODE_EXISTMOBILE_203, "用户信息不存在!");
		}
		// 对特殊铭感字段需要做脱敏
		userEntity.setPassword(null);
		return setResultSuccess(userEntity);
	}

}