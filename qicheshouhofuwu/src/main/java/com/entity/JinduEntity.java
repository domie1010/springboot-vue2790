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
 * 维修进度
 *
 * @author 
 * @email
 */
@TableName("jindu")
public class JinduEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JinduEntity() {

	}

	public JinduEntity(T t) {
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
     * 维修车辆
     */
    @TableField(value = "weixiuyuyue_id")

    private Integer weixiuyuyueId;


    /**
     * 预约用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 维修进度
     */
    @TableField(value = "weixiu_types")

    private Integer weixiuTypes;


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
	 * 设置：维修车辆
	 */
    public Integer getWeixiuyuyueId() {
        return weixiuyuyueId;
    }


    /**
	 * 获取：维修车辆
	 */

    public void setWeixiuyuyueId(Integer weixiuyuyueId) {
        this.weixiuyuyueId = weixiuyuyueId;
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
	 * 设置：维修进度
	 */
    public Integer getWeixiuTypes() {
        return weixiuTypes;
    }


    /**
	 * 获取：维修进度
	 */

    public void setWeixiuTypes(Integer weixiuTypes) {
        this.weixiuTypes = weixiuTypes;
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
        return "Jindu{" +
            "id=" + id +
            ", weixiuyuyueId=" + weixiuyuyueId +
            ", yonghuId=" + yonghuId +
            ", weixiuTypes=" + weixiuTypes +
            ", createTime=" + createTime +
        "}";
    }
}
