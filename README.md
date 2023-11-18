# soft_engineering
<b>仓库说明</b>：SUST 大三上 软件工程课程实践仓库

## 项目人员
1. 21200107209冯鑫钢
2. 21200107208朱国顺
3. 21200107210张若尧

## 项目进度
2023/11/10 搭建项目基本结构

## 遇到的问题：
2023/11/10  
问题一： 多模块项目中，maven项目没有正确的被IDEA识别  
问题分析：创建模块的方式有问题，删除之后在structure中重新创建项目
  
2023/11/18  
问题二： 对Dao层进行测试的时候报出UnsatisfiedDependencyException和NoSuchBeanException  
问题分析：初步判断是对应实体类的问题，进行排查之后发现问题不在这里， 定位到问题处在@Mapper注解上，  
打开pom文件修改mybatis的配置文件后 问题消失，原因在于idea自动导入的mybatis不是经过springboot整合的。