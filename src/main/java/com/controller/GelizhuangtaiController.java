package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GelizhuangtaiEntity;
import com.entity.view.GelizhuangtaiView;

import com.service.GelizhuangtaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 隔离状态
 * 后端接口
 * @author 
 * @email 
 * @date 2020-11-13 16:22:54
 */
@RestController
@RequestMapping("/gelizhuangtai")
public class GelizhuangtaiController {
    @Autowired
    private GelizhuangtaiService gelizhuangtaiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GelizhuangtaiEntity gelizhuangtai, HttpServletRequest request){

        EntityWrapper<GelizhuangtaiEntity> ew = new EntityWrapper<GelizhuangtaiEntity>();
		PageUtils page = gelizhuangtaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gelizhuangtai), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GelizhuangtaiEntity gelizhuangtai, HttpServletRequest request){
        EntityWrapper<GelizhuangtaiEntity> ew = new EntityWrapper<GelizhuangtaiEntity>();
		PageUtils page = gelizhuangtaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gelizhuangtai), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GelizhuangtaiEntity gelizhuangtai){
       	EntityWrapper<GelizhuangtaiEntity> ew = new EntityWrapper<GelizhuangtaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gelizhuangtai, "gelizhuangtai")); 
        return R.ok().put("data", gelizhuangtaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GelizhuangtaiEntity gelizhuangtai){
        EntityWrapper< GelizhuangtaiEntity> ew = new EntityWrapper< GelizhuangtaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gelizhuangtai, "gelizhuangtai")); 
		GelizhuangtaiView gelizhuangtaiView =  gelizhuangtaiService.selectView(ew);
		return R.ok("查询隔离状态成功").put("data", gelizhuangtaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        GelizhuangtaiEntity gelizhuangtai = gelizhuangtaiService.selectById(id);
        return R.ok().put("data", gelizhuangtai);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        GelizhuangtaiEntity gelizhuangtai = gelizhuangtaiService.selectById(id);
        return R.ok().put("data", gelizhuangtai);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GelizhuangtaiEntity gelizhuangtai, HttpServletRequest request){
    	gelizhuangtai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gelizhuangtai);

        gelizhuangtaiService.insert(gelizhuangtai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GelizhuangtaiEntity gelizhuangtai, HttpServletRequest request){
    	gelizhuangtai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gelizhuangtai);

        gelizhuangtaiService.insert(gelizhuangtai);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GelizhuangtaiEntity gelizhuangtai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gelizhuangtai);
        gelizhuangtaiService.updateById(gelizhuangtai);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gelizhuangtaiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<GelizhuangtaiEntity> wrapper = new EntityWrapper<GelizhuangtaiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = gelizhuangtaiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
