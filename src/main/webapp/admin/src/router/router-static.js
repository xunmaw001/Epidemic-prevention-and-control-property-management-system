import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/shijuanliebiao/exam'
    import baogaoxinxi from '@/views/modules/baogaoxinxi/list'
    import cheweixinxi from '@/views/modules/cheweixinxi/list'
    import yezhu from '@/views/modules/yezhu/list'
    import gelizhuangtai from '@/views/modules/gelizhuangtai/list'
    import fangkedengji from '@/views/modules/fangkedengji/list'
    import hesuanjiance from '@/views/modules/hesuanjiance/list'
    import feiyongxinxi from '@/views/modules/feiyongxinxi/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'
    import gonggaohuifu from '@/views/modules/gonggaohuifu/list'
    import tousuxinxi from '@/views/modules/tousuxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
        path: '/baogaoxinxi',
        name: '报告信息',
        component: baogaoxinxi
      }
          ,{
        path: '/cheweixinxi',
        name: '车位信息',
        component: cheweixinxi
      }
          ,{
        path: '/yezhu',
        name: '业主',
        component: yezhu
      }
          ,{
        path: '/gelizhuangtai',
        name: '隔离状态',
        component: gelizhuangtai
      }
          ,{
        path: '/fangkedengji',
        name: '访客登记',
        component: fangkedengji
      }
          ,{
        path: '/hesuanjiance',
        name: '核酸检测',
        component: hesuanjiance
      }
          ,{
        path: '/feiyongxinxi',
        name: '费用信息',
        component: feiyongxinxi
      }
          ,{
        path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
          ,{
        path: '/gonggaohuifu',
        name: '公告回复',
        component: gonggaohuifu
      }
          ,{
        path: '/tousuxinxi',
        name: '投诉信息',
        component: tousuxinxi
      }
        ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
