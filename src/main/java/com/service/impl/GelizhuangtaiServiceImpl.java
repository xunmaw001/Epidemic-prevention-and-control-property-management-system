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


import com.dao.GelizhuangtaiDao;
import com.entity.GelizhuangtaiEntity;
import com.service.GelizhuangtaiService;
import com.entity.vo.GelizhuangtaiVO;
import com.entity.view.GelizhuangtaiView;

@Service("gelizhuangtaiService")
public class GelizhuangtaiServiceImpl extends ServiceImpl<GelizhuangtaiDao, GelizhuangtaiEntity> implements GelizhuangtaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GelizhuangtaiEntity> page = this.selectPage(
                new Query<GelizhuangtaiEntity>(params).getPage(),
                new EntityWrapper<GelizhuangtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GelizhuangtaiEntity> wrapper) {
		  Page<GelizhuangtaiView> page =new Query<GelizhuangtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GelizhuangtaiVO> selectListVO(Wrapper<GelizhuangtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GelizhuangtaiVO selectVO(Wrapper<GelizhuangtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GelizhuangtaiView> selectListView(Wrapper<GelizhuangtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GelizhuangtaiView selectView(Wrapper<GelizhuangtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
