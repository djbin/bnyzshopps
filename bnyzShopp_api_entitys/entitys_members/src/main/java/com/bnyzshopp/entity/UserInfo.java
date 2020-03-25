package com.bnyzshopp.entity;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @description:用户注册实体类
 * @author:互联网架构师-dujinbin
 * @date: 2020年3月21日 下午3:03:17
 * @version V1.0
 * @Copyright 该项目“基于SpringCloud2.x构建微服务养殖电商项目
 */
@Data
@ApiModel(value = "用户中注册")
public class UserInfo {
	/**
	 * userid
	 */
	@ApiModelProperty(value = "用户id")
	private Long userid;
	/**
	 * 用户名称
	 */
	@ApiModelProperty(value = "用户名称")
	private String userName;
	/**
	 * 密码
	 */
	@ApiModelProperty(value = "密码")
	private String password;
	/**
	 * 手机号码
	 */
	@ApiModelProperty(value = "手机号码")
	private String phone;
	/**
	 * 用户名称
	 */
	@ApiModelProperty(value = "用户注册地址")
	private String UserAddress;
	/**
	 * 性别 0 男 1女
	 */
	@ApiModelProperty(value = "用户性别")
	private char sex;
	/**
	 * 注册时间
	 */
	@ApiModelProperty(value = "创建时间")
	private Long inputdate;
	/**
	 * 账号是否可以用 1 正常 0冻结
	 */
	@ApiModelProperty(value = "账号是否可以用 1 正常 0冻结")
	private char is_avalible;
	/**
	 * 用户头像
	 */
	@ApiModelProperty(value = " 用户头像")
	private String pic_img;
	/**
	 * 用户关联 QQ 开放ID
	 */
	@ApiModelProperty(value = "用户关联 QQ 开放ID")
	private Date qq_openid;
	/**
	 * 用户关联 微信 开放ID
	 */
	@ApiModelProperty(value = "用户关联 微信 开放ID")
	private Date wx_openid;
}
