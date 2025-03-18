package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GelizhuangtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GelizhuangtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GelizhuangtaiView;


/**
 * 隔离状态
 *
 * @author 
 * @email 
 * @date 2020-11-13 16:22:54
 */
public interface GelizhuangtaiService extends IService<GelizhuangtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GelizhuangtaiVO> selectListVO(Wrapper<GelizhuangtaiEntity> wrapper);
   	
   	GelizhuangtaiVO selectVO(@Param("ew") Wrapper<GelizhuangtaiEntity> wrapper);
   	
   	List<GelizhuangtaiView> selectListView(Wrapper<GelizhuangtaiEntity> wrapper);
   	
   	GelizhuangtaiView selectView(@Param("ew") Wrapper<GelizhuangtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GelizhuangtaiEntity> wrapper);
   	
}

