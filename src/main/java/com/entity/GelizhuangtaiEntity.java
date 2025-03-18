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
 * 隔离状态
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-11-13 16:22:54
 */
@TableName("gelizhuangtai")
public class GelizhuangtaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GelizhuangtaiEntity() {
		
	}
	
	public GelizhuangtaiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date kaishiriqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
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
