const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm51710/",
            name: "ssm51710",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm51710/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "疫情防控物业管理系统"
        } 
    }
}
export default base
