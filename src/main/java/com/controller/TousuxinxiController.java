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

import com.entity.TousuxinxiEntity;
import com.entity.view.TousuxinxiView;

import com.service.TousuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 投诉信息
 * 后端接口
 * @author 
 * @email 
 * @date 2020-11-13 16:22:54
 */
@RestController
@RequestMapping("/tousuxinxi")
public class TousuxinxiController {
    @Autowired
    private TousuxinxiService tousuxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TousuxinxiEntity tousuxinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yezhu")) {
			tousuxinxi.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TousuxinxiEntity> ew = new EntityWrapper<TousuxinxiEntity>();
		PageUtils page = tousuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tousuxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TousuxinxiEntity tousuxinxi, HttpServletRequest request){
        EntityWrapper<TousuxinxiEntity> ew = new EntityWrapper<TousuxinxiEntity>();
		PageUtils page = tousuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tousuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TousuxinxiEntity tousuxinxi){
       	EntityWrapper<TousuxinxiEntity> ew = new EntityWrapper<TousuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tousuxinxi, "tousuxinxi")); 
        return R.ok().put("data", tousuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TousuxinxiEntity tousuxinxi){
        EntityWrapper< TousuxinxiEntity> ew = new EntityWrapper< TousuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tousuxinxi, "tousuxinxi")); 
		TousuxinxiView tousuxinxiView =  tousuxinxiService.selectView(ew);
		return R.ok("查询投诉信息成功").put("data", tousuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        TousuxinxiEntity tousuxinxi = tousuxinxiService.selectById(id);
        return R.ok().put("data", tousuxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        TousuxinxiEntity tousuxinxi = tousuxinxiService.selectById(id);
        return R.ok().put("data", tousuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TousuxinxiEntity tousuxinxi, HttpServletRequest request){
    	tousuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tousuxinxi);

        tousuxinxiService.insert(tousuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TousuxinxiEntity tousuxinxi, HttpServletRequest request){
    	tousuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tousuxinxi);

        tousuxinxiService.insert(tousuxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TousuxinxiEntity tousuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tousuxinxi);
        tousuxinxiService.updateById(tousuxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tousuxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<TousuxinxiEntity> wrapper = new EntityWrapper<TousuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yezhu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = tousuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
