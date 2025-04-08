package com.entity.model;

import com.entity.WeixiuyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 维修预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WeixiuyuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 预约状态
     */
    private Integer shifoudaodaTypes;


    /**
     * 详情信息
     */
    private String weixiuyuyueContent;


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
	 * 获取：车辆牌号
	 */
    public String getWeixiuyuyueName() {
        return weixiuyuyueName;
    }


    /**
	 * 设置：车辆牌号
	 */
    public void setWeixiuyuyueName(String weixiuyuyueName) {
        this.weixiuyuyueName = weixiuyuyueName;
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
	 * 获取：维修车型
	 */
    public String getWeixiuyuyueChexing() {
        return weixiuyuyueChexing;
    }


    /**
	 * 设置：维修车型
	 */
    public void setWeixiuyuyueChexing(String weixiuyuyueChexing) {
        this.weixiuyuyueChexing = weixiuyuyueChexing;
    }
    /**
	 * 获取：维修类型
	 */
    public Integer getWeixiuyuyueTypes() {
        return weixiuyuyueTypes;
    }


    /**
	 * 设置：维修类型
	 */
    public void setWeixiuyuyueTypes(Integer weixiuyuyueTypes) {
        this.weixiuyuyueTypes = weixiuyuyueTypes;
    }
    /**
	 * 获取：预约状态
	 */
    public Integer getShifoudaodaTypes() {
        return shifoudaodaTypes;
    }


    /**
	 * 设置：预约状态
	 */
    public void setShifoudaodaTypes(Integer shifoudaodaTypes) {
        this.shifoudaodaTypes = shifoudaodaTypes;
    }
    /**
	 * 获取：详情信息
	 */
    public String getWeixiuyuyueContent() {
        return weixiuyuyueContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setWeixiuyuyueContent(String weixiuyuyueContent) {
        this.weixiuyuyueContent = weixiuyuyueContent;
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
