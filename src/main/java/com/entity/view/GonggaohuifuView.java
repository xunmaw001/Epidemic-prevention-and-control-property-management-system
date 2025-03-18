package com.entity.view;

import com.entity.GonggaohuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 公告回复
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-13 16:22:54
 */
@TableName("gonggaohuifu")
public class GonggaohuifuView  extends GonggaohuifuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GonggaohuifuView(){
	}
 
 	public GonggaohuifuView(GonggaohuifuEntity gonggaohuifuEntity){
 	try {
			BeanUtils.copyProperties(this, gonggaohuifuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
