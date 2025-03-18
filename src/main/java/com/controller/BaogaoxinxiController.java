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

import com.entity.BaogaoxinxiEntity;
import com.entity.view.BaogaoxinxiView;

import com.service.BaogaoxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 报告信息
 * 后端接口
 * @author 
 * @email 
 * @date 2020-11-13 16:22:54
 */
@RestController
@RequestMapping("/baogaoxinxi")
public class BaogaoxinxiController {
    @Autowired
    private BaogaoxinxiService baogaoxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BaogaoxinxiEntity baogaoxinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yezhu")) {
			baogaoxinxi.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BaogaoxinxiEntity> ew = new EntityWrapper<BaogaoxinxiEntity>();
		PageUtils page = baogaoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baogaoxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BaogaoxinxiEntity baogaoxinxi, HttpServletRequest request){
        EntityWrapper<BaogaoxinxiEntity> ew = new EntityWrapper<BaogaoxinxiEntity>();
		PageUtils page = baogaoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baogaoxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BaogaoxinxiEntity baogaoxinxi){
       	EntityWrapper<BaogaoxinxiEntity> ew = new EntityWrapper<BaogaoxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( baogaoxinxi, "baogaoxinxi")); 
        return R.ok().put("data", baogaoxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BaogaoxinxiEntity baogaoxinxi){
        EntityWrapper< BaogaoxinxiEntity> ew = new EntityWrapper< BaogaoxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( baogaoxinxi, "baogaoxinxi")); 
		BaogaoxinxiView baogaoxinxiView =  baogaoxinxiService.selectView(ew);
		return R.ok("查询报告信息成功").put("data", baogaoxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        BaogaoxinxiEntity baogaoxinxi = baogaoxinxiService.selectById(id);
        return R.ok().put("data", baogaoxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        BaogaoxinxiEntity baogaoxinxi = baogaoxinxiService.selectById(id);
        return R.ok().put("data", baogaoxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaogaoxinxiEntity baogaoxinxi, HttpServletRequest request){
    	baogaoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baogaoxinxi);

        baogaoxinxiService.insert(baogaoxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BaogaoxinxiEntity baogaoxinxi, HttpServletRequest request){
    	baogaoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baogaoxinxi);

        baogaoxinxiService.insert(baogaoxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BaogaoxinxiEntity baogaoxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(baogaoxinxi);
        baogaoxinxiService.updateById(baogaoxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        baogaoxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<BaogaoxinxiEntity> wrapper = new EntityWrapper<BaogaoxinxiEntity>();
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

		int count = baogaoxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
