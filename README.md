# B站厨神新春大作战 菜谱以及菜速做



由于不想搞账号密码等较为复杂的方法，采用复制页面json的方法，查找可做的不重复菜。

## 代码之外的技巧

1. 建议最后一天做完全部菜，可以得到最大值。
2. 缺主食的直接点开图鉴看里面的视频，完成对应的每日任务。

## 更新日志

2.13 由于b站已经在后续做出了类似功能，可以直接查看哪些菜可以做，本项目意义较小了。

2.16 更新一波做出最优菜的方案。

## 前置操作

安装JDK(百度应该都有)。

## 步骤

### 有IDE

打开链接 https://www.bilibili.com/blackboard/activity-yeGIPr7OX.html?from=native&share_medium=android&share_plat=android&share_source=QQ&share_tag=s_i&timestamp=1612692228&unique_k=EFDQTP#

打开F12  同时设置页面为手机
将该区块设为 display：none

![](页面.png)

打开浏览器的网络请求 选择xhr类型的

![image-20210209124637366](已有材料.png)

复制dishes的值到have.txt中,即可

然后直接点烹制，里面会有请求获得核心配料和辅料的。
![](核心和辅料.png)

复制上图中的assist_ingredients的值到ingredient.txt

复制上图中的core_ingredients的值到core.txt

### 无IDE

直接在artifact下进行相同操作 然后在使用java -jar chief.jar

## 最后

有用的给个助力？有问题看到了就回复
https://www.bilibili.com/blackboard/activity-Z-v-4R3hH.html?btoken=4f4b9291fcbc0303e38031116a371dee%2F23504225&ts=1612874453065