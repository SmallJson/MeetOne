###### MeetOne Java端统一开发工具
##### 1. 技术选型
- 采用SpringBoot构建项目，SpringMVC + Spring + MyBatis支撑项目
- 开发工具统一IDEA 2017
- 数据库采用MySql 5.7及以上版本
- 数据库可视工具Navicat
- Redis仅作为缓存，部署在linux上
- Git作为版本控制工具，github托管代码

##### 2. 代码组织结构
- cache包 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Redis网络缓存和本地缓存
- componet包&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 组件
- config包&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 核心配合类
- constant包&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;常量
- controller包 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;控制器层
- interceptor包 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;拦截器
- message包&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 消息队列
- model包 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;JavaBean
- service包 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;service层
- Dao包 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;数据库层
- util包 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;工具类
- SpringBoot启动类

![图例](https://upload-images.jianshu.io/upload_images/6255308-e2f9bf7934c2cdd4.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

**PS:**
- 前期技术薄弱，业务少,不考虑性能，将controller层，service层，Dao层部署在同一个项目中。
- 中期技术渐强，业务多，略微考虑性能，将service层和Dao层分离出来，独自部署，服务之间采用Http联系
- 后期技术强盛,业务多，性能需求强，将对功能进行拆分，各个功能独自构建为一个子项目，子项目分离service层和Dao层，进入敏捷开发阶段

##### 3. 文档撰写规范
- 技术文档和需求文档，采用**markdown**，不用**word**
- 后端开发人员，如**新建/修改**数据库表，需详细撰文解释**表结构**，指明**索引**
- 后端开发人员，如新开发接口，需详细撰文**接口url**，以及**传参规范
**
- 开发人员需对所书写的技术文档负责，在文档首部或者末尾注明，作者姓名及发布时间

##### 4. 代码书写规范
- 参见阿里巴巴java开发手册V1

##### 5. 祝语:
&nbsp;&nbsp;&nbsp;&nbsp;兴趣为始，成就精英，希望大家一起探索最新的业内标准，学习规范，专业，先进，潮流的开发技术。

涂印 2018/4/13