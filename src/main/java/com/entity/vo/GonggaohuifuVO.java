package com.entity.vo;

import com.entity.GonggaohuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 公告回复
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-11-13 16:22:54
 */
public class GonggaohuifuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 发表内容
	 */
	
	private String fabiaoneirong;
		
	/**
	 * 发表日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabiaoriqi;
				
	
	/**
	 * 设置：发表内容
	 */
	 
	public void setFabiaoneirong(String fabiaoneirong) {
		this.fabiaoneirong = fabiaoneirong;
	}
	
	/**
	 * 获取：发表内容
	 */
	public String getFabiaoneirong() {
		return fabiaoneirong;
	}
				
	
	/**
	 * 设置：发表日期
	 */
	 
	public void setFabiaoriqi(Date fabiaoriqi) {
		this.fabiaoriqi = fabiaoriqi;
	}
	
	/**
	 * 获取：发表日期
	 */
	public Date getFabiaoriqi() {
		return fabiaoriqi;
	}
			
}
