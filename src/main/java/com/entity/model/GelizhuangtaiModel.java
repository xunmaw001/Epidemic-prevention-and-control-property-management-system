package com.entity.model;

import com.entity.GelizhuangtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 隔离状态
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-11-13 16:22:54
 */
public class GelizhuangtaiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 隔离房号
	 */
	
	private String gelifanghao;
		
	/**
	 * 隔离时间
	 */
	
	private String gelishijian;
		
	/**
	 * 隔离状态
	 */
	
	private String gelizhuangtai;
		
	/**
	 * 开始日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaishiriqi;
				
	
	/**
	 * 设置：隔离房号
	 */
	 
	public void setGelifanghao(String gelifanghao) {
		this.gelifanghao = gelifanghao;
	}
	
	/**
	 * 获取：隔离房号
	 */
	public String getGelifanghao() {
		return gelifanghao;
	}
				
	
	/**
	 * 设置：隔离时间
	 */
	 
	public void setGelishijian(String gelishijian) {
		this.gelishijian = gelishijian;
	}
	
	/**
	 * 获取：隔离时间
	 */
	public String getGelishijian() {
		return gelishijian;
	}
				
	
	/**
	 * 设置：隔离状态
	 */
	 
	public void setGelizhuangtai(String gelizhuangtai) {
		this.gelizhuangtai = gelizhuangtai;
	}
	
	/**
	 * 获取：隔离状态
	 */
	public String getGelizhuangtai() {
		return gelizhuangtai;
	}
				
	
	/**
	 * 设置：开始日期
	 */
	 
	public void setKaishiriqi(Date kaishiriqi) {
		this.kaishiriqi = kaishiriqi;
	}
	
	/**
	 * 获取：开始日期
	 */
	public Date getKaishiriqi() {
		return kaishiriqi;
	}
			
}
