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

import com.entity.GonggaohuifuEntity;
import com.entity.view.GonggaohuifuView;

import com.service.GonggaohuifuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 公告回复
 * 后端接口
 * @author 
 * @email 
 * @date 2020-11-13 16:22:54
 */
@RestController
@RequestMapping("/gonggaohuifu")
public class GonggaohuifuController {
    @Autowired
    private GonggaohuifuService gonggaohuifuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GonggaohuifuEntity gonggaohuifu, HttpServletRequest request){

        EntityWrapper<GonggaohuifuEntity> ew = new EntityWrapper<GonggaohuifuEntity>();
		PageUtils page = gonggaohuifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gonggaohuifu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GonggaohuifuEntity gonggaohuifu, HttpServletRequest request){
        EntityWrapper<GonggaohuifuEntity> ew = new EntityWrapper<GonggaohuifuEntity>();
		PageUtils page = gonggaohuifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gonggaohuifu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GonggaohuifuEntity gonggaohuifu){
       	EntityWrapper<GonggaohuifuEntity> ew = new EntityWrapper<GonggaohuifuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gonggaohuifu, "gonggaohuifu")); 
        return R.ok().put("data", gonggaohuifuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GonggaohuifuEntity gonggaohuifu){
        EntityWrapper< GonggaohuifuEntity> ew = new EntityWrapper< GonggaohuifuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gonggaohuifu, "gonggaohuifu")); 
		GonggaohuifuView gonggaohuifuView =  gonggaohuifuService.selectView(ew);
		return R.ok("查询公告回复成功").put("data", gonggaohuifuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        GonggaohuifuEntity gonggaohuifu = gonggaohuifuService.selectById(id);
        return R.ok().put("data", gonggaohuifu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        GonggaohuifuEntity gonggaohuifu = gonggaohuifuService.selectById(id);
        return R.ok().put("data", gonggaohuifu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GonggaohuifuEntity gonggaohuifu, HttpServletRequest request){
    	gonggaohuifu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gonggaohuifu);

        gonggaohuifuService.insert(gonggaohuifu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GonggaohuifuEntity gonggaohuifu, HttpServletRequest request){
    	gonggaohuifu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gonggaohuifu);

        gonggaohuifuService.insert(gonggaohuifu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GonggaohuifuEntity gonggaohuifu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gonggaohuifu);
        gonggaohuifuService.updateById(gonggaohuifu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gonggaohuifuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<GonggaohuifuEntity> wrapper = new EntityWrapper<GonggaohuifuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = gonggaohuifuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
