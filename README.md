# FineReport_11程序数据集及自定义函数

##  一、引入FineReport工程JAR包

需要导入的 FineReport 工程 JAR 包，包括安装工程包%FR_HOME%/lib下面的所有的包，%FR_HOME%/server/lib下面的所有包，%FR_HOME%/webapps/webroot/WEB-INF/lib下面的所有包，还需要要引入 JDK 的 tools.jar。

## 二、按需引入第三方JAR包

引入第三方 JAR 包主要有两种方式。

- 下载第三方 JAR 包后，将 JAR 包放在 %FR_HOME%\webapps\webroot\WEB-INF\lib 目录下，即和 FineReport 提供的 fine-decision-10.0.jar 同一个目录，引入FineReport 工程 JAR 包时一起引入。

- 下载后放在某个目录下，引入即可。如下图所示，通过 Eclipse 编辑器给工程 JavaIda 引入第三方 JAR 包 slf4j-simple-1.7.25。



## 三、路径

程序数据集： 将编译完的class文件放到com-fr-data/ 路径中

自定义函数： 将编译完的class文件放到com-fr-function/ 路径中
