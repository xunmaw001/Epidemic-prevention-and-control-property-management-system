package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GonggaohuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GonggaohuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GonggaohuifuView;


/**
 * 公告回复
 *
 * @author 
 * @email 
 * @date 2020-11-13 16:22:54
 */
public interface GonggaohuifuService extends IService<GonggaohuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GonggaohuifuVO> selectListVO(Wrapper<GonggaohuifuEntity> wrapper);
   	
   	GonggaohuifuVO selectVO(@Param("ew") Wrapper<GonggaohuifuEntity> wrapper);
   	
   	List<GonggaohuifuView> selectListView(Wrapper<GonggaohuifuEntity> wrapper);
   	
   	GonggaohuifuView selectView(@Param("ew") Wrapper<GonggaohuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GonggaohuifuEntity> wrapper);
   	
}

