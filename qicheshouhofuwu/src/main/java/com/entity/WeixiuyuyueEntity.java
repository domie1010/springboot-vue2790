package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 维修预约
 *
 * @author 
 * @email
 */
@TableName("weixiuyuyue")
public class WeixiuyuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public WeixiuyuyueEntity() {

	}

	public WeixiuyuyueEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 车辆牌号
     */
    @TableField(value = "weixiuyuyue_name")

    private String weixiuyuyueName;


    /**
     * 预约用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 维修车型
     */
    @TableField(value = "weixiuyuyue_chexing")

    private String weixiuyuyueChexing;


    /**
     * 维修类型
     */
    @TableField(value = "weixiuyuyue_types")

    private Integer weixiuyuyueTypes;


    /**
     * 预约状态
     */
    @TableField(value = "shifoudaoda_types")

    private Integer shifoudaodaTypes;


    /**
     * 详情信息
     */
    @TableField(value = "weixiuyuyue_content")

    private String weixiuyuyueContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：车辆牌号
	 */
    public String getWeixiuyuyueName() {
        return weixiuyuyueName;
    }


    /**
	 * 获取：车辆牌号
	 */

    public void setWeixiuyuyueName(String weixiuyuyueName) {
        this.weixiuyuyueName = weixiuyuyueName;
    }
    /**
	 * 设置：预约用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：预约用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：维修车型
	 */
    public String getWeixiuyuyueChexing() {
        return weixiuyuyueChexing;
    }


    /**
	 * 获取：维修车型
	 */

    public void setWeixiuyuyueChexing(String weixiuyuyueChexing) {
        this.weixiuyuyueChexing = weixiuyuyueChexing;
    }
    /**
	 * 设置：维修类型
	 */
    public Integer getWeixiuyuyueTypes() {
        return weixiuyuyueTypes;
    }


    /**
	 * 获取：维修类型
	 */

    public void setWeixiuyuyueTypes(Integer weixiuyuyueTypes) {
        this.weixiuyuyueTypes = weixiuyuyueTypes;
    }
    /**
	 * 设置：预约状态
	 */
    public Integer getShifoudaodaTypes() {
        return shifoudaodaTypes;
    }


    /**
	 * 获取：预约状态
	 */

    public void setShifoudaodaTypes(Integer shifoudaodaTypes) {
        this.shifoudaodaTypes = shifoudaodaTypes;
    }
    /**
	 * 设置：详情信息
	 */
    public String getWeixiuyuyueContent() {
        return weixiuyuyueContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setWeixiuyuyueContent(String weixiuyuyueContent) {
        this.weixiuyuyueContent = weixiuyuyueContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Weixiuyuyue{" +
            "id=" + id +
            ", weixiuyuyueName=" + weixiuyuyueName +
            ", yonghuId=" + yonghuId +
            ", weixiuyuyueChexing=" + weixiuyuyueChexing +
            ", weixiuyuyueTypes=" + weixiuyuyueTypes +
            ", shifoudaodaTypes=" + shifoudaodaTypes +
            ", weixiuyuyueContent=" + weixiuyuyueContent +
            ", createTime=" + createTime +
        "}";
    }
}
