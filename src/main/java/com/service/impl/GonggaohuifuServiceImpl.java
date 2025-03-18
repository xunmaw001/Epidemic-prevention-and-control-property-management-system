package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GonggaohuifuDao;
import com.entity.GonggaohuifuEntity;
import com.service.GonggaohuifuService;
import com.entity.vo.GonggaohuifuVO;
import com.entity.view.GonggaohuifuView;

@Service("gonggaohuifuService")
public class GonggaohuifuServiceImpl extends ServiceImpl<GonggaohuifuDao, GonggaohuifuEntity> implements GonggaohuifuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GonggaohuifuEntity> page = this.selectPage(
                new Query<GonggaohuifuEntity>(params).getPage(),
                new EntityWrapper<GonggaohuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GonggaohuifuEntity> wrapper) {
		  Page<GonggaohuifuView> page =new Query<GonggaohuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GonggaohuifuVO> selectListVO(Wrapper<GonggaohuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GonggaohuifuVO selectVO(Wrapper<GonggaohuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GonggaohuifuView> selectListView(Wrapper<GonggaohuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GonggaohuifuView selectView(Wrapper<GonggaohuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
