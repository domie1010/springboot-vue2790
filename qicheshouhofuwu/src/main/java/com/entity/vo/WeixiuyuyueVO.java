package com.entity.vo;

import com.entity.WeixiuyuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 维修预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("weixiuyuyue")
public class WeixiuyuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
