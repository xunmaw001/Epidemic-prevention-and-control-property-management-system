package com.dao;

import com.entity.HesuanjianceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HesuanjianceVO;
import com.entity.view.HesuanjianceView;


/**
 * 核酸检测
 * 
 * @author 
 * @email 
 * @date 2020-11-13 16:22:54
 */
public interface HesuanjianceDao extends BaseMapper<HesuanjianceEntity> {
	
	List<HesuanjianceVO> selectListVO(@Param("ew") Wrapper<HesuanjianceEntity> wrapper);
	
	HesuanjianceVO selectVO(@Param("ew") Wrapper<HesuanjianceEntity> wrapper);
	
	List<HesuanjianceView> selectListView(@Param("ew") Wrapper<HesuanjianceEntity> wrapper);

	List<HesuanjianceView> selectListView(Pagination page,@Param("ew") Wrapper<HesuanjianceEntity> wrapper);
	
	HesuanjianceView selectView(@Param("ew") Wrapper<HesuanjianceEntity> wrapper);
	
}
