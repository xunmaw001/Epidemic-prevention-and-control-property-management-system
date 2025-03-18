package com.dao;

import com.entity.GonggaohuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GonggaohuifuVO;
import com.entity.view.GonggaohuifuView;


/**
 * 公告回复
 * 
 * @author 
 * @email 
 * @date 2020-11-13 16:22:54
 */
public interface GonggaohuifuDao extends BaseMapper<GonggaohuifuEntity> {
	
	List<GonggaohuifuVO> selectListVO(@Param("ew") Wrapper<GonggaohuifuEntity> wrapper);
	
	GonggaohuifuVO selectVO(@Param("ew") Wrapper<GonggaohuifuEntity> wrapper);
	
	List<GonggaohuifuView> selectListView(@Param("ew") Wrapper<GonggaohuifuEntity> wrapper);

	List<GonggaohuifuView> selectListView(Pagination page,@Param("ew") Wrapper<GonggaohuifuEntity> wrapper);
	
	GonggaohuifuView selectView(@Param("ew") Wrapper<GonggaohuifuEntity> wrapper);
	
}
