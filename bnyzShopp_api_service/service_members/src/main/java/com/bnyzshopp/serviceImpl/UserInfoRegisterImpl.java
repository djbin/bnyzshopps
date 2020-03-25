package com.bnyzshopp.serviceImpl;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;
import com.bnyzshopp.result.BaseApiService;
import com.bnyzshopp.result.BaseResponse;
import com.bnyzshopp.utils.MD5Util;
import com.bnyzshopp.entity.UserInfo;
import com.bnyzshopp.mappers.UserInfoMapper;
import com.bnyzshopp.service.UserInfoRegister;
@RestController
public class UserInfoRegisterImpl extends BaseApiService<JSONObject> implements UserInfoRegister{
	@Autowired
	private UserInfoMapper userInfoMapper;
	@Transactional
	public BaseResponse<JSONObject> register(@RequestBody UserInfo userInfo, String registCode) {
		// 1.参数验证
		String userName = userInfo.getUserName();
		if (StringUtils.isEmpty(userName)) {
			return setResultError("用户名称不能为空!");
		}
		String phone = userInfo.getPhone();
		if (StringUtils.isEmpty(phone)) {
			return setResultError("手机号码不能为空!");
		}
		String password = userInfo.getPassword();
		if (StringUtils.isEmpty(password)) {
			return setResultError("密码不能为空!");
		}
		// 3.对用户的密码进行加密 // MD5 可以解密 暴力破解
		String newPassword = MD5Util.MD5(password);
		userInfo.setPassword(newPassword);
		// 4.调用数据库插入数据
		return userInfoMapper.register(userInfo) > 0 ? setResultSuccess("注册成功") : setResultError("注册失败!");
	}

}
