# soft_engineering
<b>仓库说明</b>：SUST 大三上 软件工程课程实践（闭环访客系统）仓库

## 项目人员
1. 21200107209冯鑫钢
2. 21200107208朱国顺
3. 21200107210张若尧

## 项目进度
后端  
2023/11/10 搭建项目基本结构  
2023/11/18 连接数据库 Dao层简单示例通过  
2023/11/19 封装ApiResponse类Service层和Controller层简单示例完成  

前端   
2023/11/22 前端结构搭建完成  
2023/11/24 登录功能完成并打通  
2023/11/25 实现管理申请和访问页面  
2023/11/27 实现录入申请功能  
2023/11/29 完善系统，调整结构

## 遇到的问题：
2023/11/10  
问题一： 多模块项目中，maven项目没有正确的被IDEA识别  
问题分析：创建模块的方式有问题，删除之后在structure中重新创建项目
  
2023/11/18  
问题二： 对Dao层进行测试的时候报出UnsatisfiedDependencyException和NoSuchBeanException  
问题分析：初步判断是对应实体类的问题，进行排查之后发现问题不在这里， 定位到问题处在@Mapper注解上，  
打开pom文件修改mybatis的配置文件后 问题消失，原因在于idea自动导入的mybatis不是经过springboot整合的。

2023/11/23  
问题三： uni.request()发送登录请求的时候报错400（BadRequest）  
问题分析： 检查请求参数名称无误后查阅资料发现是POST的问题，在发送请求上的时候应该加上header属性

2023/11/24  
问题四： 从代码逻辑上看，向后端发送请求获得登录数据后缓存到前端改变路由后，理论上在新的页面可以从缓存中
获取并展示但是并没有  
问题分析：经过问题的摸排定位到输出数据是undefined，说明前端还没来得及缓存获得的用户数据就将页面重定向
，这是一个同步问题，将登录的方法定义为async函数，使用await关键字实现在将数据缓存完成之后再重定向页面  

