package com.dao;

import com.entity.GelizhuangtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GelizhuangtaiVO;
import com.entity.view.GelizhuangtaiView;


/**
 * 隔离状态
 * 
 * @author 
 * @email 
 * @date 2020-11-13 16:22:54
 */
public interface GelizhuangtaiDao extends BaseMapper<GelizhuangtaiEntity> {
	
	List<GelizhuangtaiVO> selectListVO(@Param("ew") Wrapper<GelizhuangtaiEntity> wrapper);
	
	GelizhuangtaiVO selectVO(@Param("ew") Wrapper<GelizhuangtaiEntity> wrapper);
	
	List<GelizhuangtaiView> selectListView(@Param("ew") Wrapper<GelizhuangtaiEntity> wrapper);

	List<GelizhuangtaiView> selectListView(Pagination page,@Param("ew") Wrapper<GelizhuangtaiEntity> wrapper);
	
	GelizhuangtaiView selectView(@Param("ew") Wrapper<GelizhuangtaiEntity> wrapper);
	
}
