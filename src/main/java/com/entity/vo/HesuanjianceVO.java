package com.entity.vo;

import com.entity.HesuanjianceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 核酸检测
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-11-13 16:22:54
 */
public class HesuanjianceVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 检测日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianceriqi;
		
	/**
	 * 检测情况
	 */
	
	private String jianceqingkuang;
		
	/**
	 * 检测报告
	 */
	
	private String jiancebaogao;
		
	/**
	 * 检测温度
	 */
	
	private String jiancewendu;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：检测日期
	 */
	 
	public void setJianceriqi(Date jianceriqi) {
		this.jianceriqi = jianceriqi;
	}
	
	/**
	 * 获取：检测日期
	 */
	public Date getJianceriqi() {
		return jianceriqi;
	}
				
	
	/**
	 * 设置：检测情况
	 */
	 
	public void setJianceqingkuang(String jianceqingkuang) {
		this.jianceqingkuang = jianceqingkuang;
	}
	
	/**
	 * 获取：检测情况
	 */
	public String getJianceqingkuang() {
		return jianceqingkuang;
	}
				
	
	/**
	 * 设置：检测报告
	 */
	 
	public void setJiancebaogao(String jiancebaogao) {
		this.jiancebaogao = jiancebaogao;
	}
	
	/**
	 * 获取：检测报告
	 */
	public String getJiancebaogao() {
		return jiancebaogao;
	}
				
	
	/**
	 * 设置：检测温度
	 */
	 
	public void setJiancewendu(String jiancewendu) {
		this.jiancewendu = jiancewendu;
	}
	
	/**
	 * 获取：检测温度
	 */
	public String getJiancewendu() {
		return jiancewendu;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
