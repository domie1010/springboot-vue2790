package com.entity.view;

import com.entity.JinduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 维修进度
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jindu")
public class JinduView extends JinduEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 维修进度的值
		*/
		private String weixiuValue;



		//级联表 weixiuyuyue
			/**
			* 车辆牌号
			*/
			private String weixiuyuyueName;
			/**
			* 预约用户
			*/
			private Integer yonghuId;
			/**
			* 维修车型
			*/
			private String weixiuyuyueChexing;
			/**
			* 维修类型
			*/
			private Integer weixiuyuyueTypes;
				/**
				* 维修类型的值
				*/
				private String weixiuyuyueValue;
			/**
			* 预约状态
			*/
			private Integer shifoudaodaTypes;
				/**
				* 预约状态的值
				*/
				private String shifoudaodaValue;
			/**
			* 详情信息
			*/
			private String weixiuyuyueContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public JinduView() {

	}

	public JinduView(JinduEntity jinduEntity) {
		try {
			BeanUtils.copyProperties(this, jinduEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 维修进度的值
			*/
			public String getWeixiuValue() {
				return weixiuValue;
			}
			/**
			* 设置： 维修进度的值
			*/
			public void setWeixiuValue(String weixiuValue) {
				this.weixiuValue = weixiuValue;
			}






















				//级联表的get和set weixiuyuyue
					/**
					* 获取： 车辆牌号
					*/
					public String getWeixiuyuyueName() {
						return weixiuyuyueName;
					}
					/**
					* 设置： 车辆牌号
					*/
					public void setWeixiuyuyueName(String weixiuyuyueName) {
						this.weixiuyuyueName = weixiuyuyueName;
					}
					/**
					* 获取： 预约用户
					*/
					public Integer getYonghuId() {
						return yonghuId;
					}
					/**
					* 设置： 预约用户
					*/
					public void setYonghuId(Integer yonghuId) {
						this.yonghuId = yonghuId;
					}
					/**
					* 获取： 维修车型
					*/
					public String getWeixiuyuyueChexing() {
						return weixiuyuyueChexing;
					}
					/**
					* 设置： 维修车型
					*/
					public void setWeixiuyuyueChexing(String weixiuyuyueChexing) {
						this.weixiuyuyueChexing = weixiuyuyueChexing;
					}
					/**
					* 获取： 维修类型
					*/
					public Integer getWeixiuyuyueTypes() {
						return weixiuyuyueTypes;
					}
					/**
					* 设置： 维修类型
					*/
					public void setWeixiuyuyueTypes(Integer weixiuyuyueTypes) {
						this.weixiuyuyueTypes = weixiuyuyueTypes;
					}


						/**
						* 获取： 维修类型的值
						*/
						public String getWeixiuyuyueValue() {
							return weixiuyuyueValue;
						}
						/**
						* 设置： 维修类型的值
						*/
						public void setWeixiuyuyueValue(String weixiuyuyueValue) {
							this.weixiuyuyueValue = weixiuyuyueValue;
						}
					/**
					* 获取： 预约状态
					*/
					public Integer getShifoudaodaTypes() {
						return shifoudaodaTypes;
					}
					/**
					* 设置： 预约状态
					*/
					public void setShifoudaodaTypes(Integer shifoudaodaTypes) {
						this.shifoudaodaTypes = shifoudaodaTypes;
					}


						/**
						* 获取： 预约状态的值
						*/
						public String getShifoudaodaValue() {
							return shifoudaodaValue;
						}
						/**
						* 设置： 预约状态的值
						*/
						public void setShifoudaodaValue(String shifoudaodaValue) {
							this.shifoudaodaValue = shifoudaodaValue;
						}
					/**
					* 获取： 详情信息
					*/
					public String getWeixiuyuyueContent() {
						return weixiuyuyueContent;
					}
					/**
					* 设置： 详情信息
					*/
					public void setWeixiuyuyueContent(String weixiuyuyueContent) {
						this.weixiuyuyueContent = weixiuyuyueContent;
					}




				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}






}
