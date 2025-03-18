package com.entity.view;

import com.entity.GelizhuangtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 隔离状态
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-13 16:22:54
 */
@TableName("gelizhuangtai")
public class GelizhuangtaiView  extends GelizhuangtaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GelizhuangtaiView(){
	}
 
 	public GelizhuangtaiView(GelizhuangtaiEntity gelizhuangtaiEntity){
 	try {
			BeanUtils.copyProperties(this, gelizhuangtaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
