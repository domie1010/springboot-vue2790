package com.entity.vo;

import com.entity.JinduEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 维修进度
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jindu")
public class JinduVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
