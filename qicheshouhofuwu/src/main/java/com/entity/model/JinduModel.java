package com.entity.model;

import com.entity.JinduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 维修进度
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JinduModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 维修车辆
     */
    private Integer weixiuyuyueId;


    /**
     * 预约用户
     */
    private Integer yonghuId;


    /**
     * 维修进度
     */
    private Integer weixiuTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：维修车辆
	 */
    public Integer getWeixiuyuyueId() {
        return weixiuyuyueId;
    }


    /**
	 * 设置：维修车辆
	 */
    public void setWeixiuyuyueId(Integer weixiuyuyueId) {
        this.weixiuyuyueId = weixiuyuyueId;
    }
    /**
	 * 获取：预约用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：预约用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：维修进度
	 */
    public Integer getWeixiuTypes() {
        return weixiuTypes;
    }


    /**
	 * 设置：维修进度
	 */
    public void setWeixiuTypes(Integer weixiuTypes) {
        this.weixiuTypes = weixiuTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
