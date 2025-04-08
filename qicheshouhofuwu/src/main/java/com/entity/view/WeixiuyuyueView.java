package com.entity.view;

import com.entity.WeixiuyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 维修预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("weixiuyuyue")
public class WeixiuyuyueView extends WeixiuyuyueEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 维修类型的值
		*/
		private String weixiuyuyueValue;
		/**
		* 预约状态的值
		*/
		private String shifoudaodaValue;



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

	public WeixiuyuyueView() {

	}

	public WeixiuyuyueView(WeixiuyuyueEntity weixiuyuyueEntity) {
		try {
			BeanUtils.copyProperties(this, weixiuyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
