姓名：母贺楠

学号：18342076

- [Vi，Java，Ant，Junit 自学报告](#vijavaantjunit-自学报告)
  - [Vi](#vi)
    - [介绍](#介绍)
    - [使用](#使用)
      - [Vi 三种工作模式](#vi-三种工作模式)
      - [vi 常用命令](#vi-常用命令)
        - [1、重复命令](#1重复命令)
        - [2、移动和选择命令](#2移动和选择命令)
        - [3、编辑命令](#3编辑命令)
        - [4、撤销命令](#4撤销命令)
        - [5、查找和替换命令](#5查找和替换命令)
  - [Java](#java)
    - [介绍](#介绍-1)
    - [编写第一个 Java 程序 hello world](#编写第一个-java-程序-hello-world)
    - [云桌面中 java 不能直接运行的解决](#云桌面中-java-不能直接运行的解决)
  - [Ant](#ant)
    - [介绍](#介绍-2)
    - [入门](#入门)
    - [Ant的XML元素详解](#ant的xml元素详解)
    - [Task介绍](#task介绍)
    - [用 ant 编译自己的 helloworld 程序](#用-ant-编译自己的-helloworld-程序)
  - [Junit](#junit)
    - [介绍](#介绍-3)
    - [用自己写的 Junit 测试自己的 HelloWorld 程序](#用自己写的-junit-测试自己的-helloworld-程序)


# Vi，Java，Ant，Junit 自学报告



## Vi



### 介绍

vi，即终端中一款编辑器。

当我们要通过远程连接到服务器时，此时没有图形界面，当我们要对服务器上的文件进行编辑时，便可以使用vi进行快速地处理。其核心设计思想便是让程序员的手指始终保持在键盘的核心区域便能够完成所有的编辑操作。

vi没有图形界面，只能编辑文本内容，不支持鼠标操作，没有菜单，只有命令。



### 使用

打开文件

```sh
vi 文件名
```

提示：若文件已经存在，则直接打开，否则会创建一个新文件。

使用如下命令可以打开文件并将光标定位到指定行：

```sh
vi 文件名 + 行数
```

提示：若只有"+“而不指定行号，会直接定位到文件末尾。



#### Vi 三种工作模式

1. 命令模式

使用vi打开一个文件首先进入命令模式，是使用vi的入口，通过命令对文件进行常规的编辑操作，如：定位、复制、粘贴、翻页、删除等。

2. 末行模式

用于执行保存、退出等操作。要退出vi，需要在末行模式下输入命令，末行模式是vi的出口。(在命令模式下按 ”:" 便进入末行模式，可通过相应命令执行相应的结果，按"esc"便可退回到命令模式)
 末行模式命令如下：

| 命令 | 英文       | 功能                       |
| ---- | ---------- | -------------------------- |
| w    | write      | 保存                       |
| q    | quit       | 退出，若没有保存不允许退出 |
| q!   | quit       | 强行退出，不保存直接退出   |
| wq   | write&quit | 保存并退出                 |
| x    |            | 保存并退出                 |

3. 编辑模式

用于正常的文字编辑。(在命令模式下按"i"便可进入编辑模式，按"esc"便可退回到命令模式)
 三种模式关系如下所示：

* vi 打开文件后首先进入的是命令模式
  * 按下 i（insert）进入编辑模式
    * 在编辑模式中按 ESC 退回到命令模式
  * 按下 ： 进入末行模式
    * 在末行模式下按 ESC 退回到命令模式
    * 在末行模式中按 wq 关闭文件



#### vi 常用命令

##### 1、重复命令

 在命令模式下，可以在要执行的命令前加一个数字，就可以使该命令执行的结果重复指定次数。

 ##### 2、移动和选择命令

 ①在命令模式下，可以通过"h",“j”,“k”,"l"四个按键来控制光标的移动

* h 左
* j 下
* k 上
* l 右

②vi在行内移动

| 命令 | 英文 | 功能                       |
| ---- | ---- | -------------------------- |
| w    | word | 向后移动一个单词           |
| b    | back | 向前移动一个单词           |
| 0    |      | 行首                       |
| ^    |      | 行首，即不是空白字符的位置 |
| $    |      | 行尾                       |

③行数移动

| 命令   | 英文 | 功能                 |
| ------ | ---- | -------------------- |
| gg     | go   | 文件顶部             |
| G      | go   | 文件末尾             |
| 数字gg | go   | 移动到指定数字的行数 |
| 数字G  | go   | 移动到指定数字的行数 |
| 数字   |      | 移动到指定数字的行数 |

④屏幕移动

| 命令     | 英文    | 功能     |
| -------- | ------- | -------- |
| ctrl + b | back    | 向上翻页 |
| ctrl + f | forward | 向下翻页 |
| H        | Head    | 屏幕顶部 |
| M        | Middle  | 屏幕中部 |
| L        | Low     | 屏幕底部 |

⑤段落移动
 在vi中会使用空行来区分一个段落，使用如下命令可以在段落间移动。

| 命令 | 功能   |
| ---- | ------ |
| {    | 上一段 |
| }    | 下一段 |

⑥括号匹配
 在我们开发中，经常会出现"()","{}","[]"括号，并且均成对出现，使用如下命令便可以方便找到当前行中与之匹配的另一个括号的位置。

| 命令 | 功能           |
| ---- | -------------- |
| %    | 括号匹配与切换 |

⑦标记
 在编辑时，也许需要先查看别的位置，之后再回到当前位置继续进行编辑，只是可以在当前位置添加标记，以便在需要编辑该位置时可以快速跳转回来。
 在需要的行使用m增加标记，m后加上标记名称，若其他行添加了相同名称的标记，之前添加的标记会被替换掉。
 使用（'标记名）便可以定位到标记所在位置。
 注：若标记所在行被删除，标记也会被同时删除。

| 命令 | 英文 | 功能                                     |
| ---- | ---- | ---------------------------------------- |
| mx   | mark | 添加标记x，x是a-z或A-Z之间的任意一个字母 |
| 'x   |      | 直接定位到标记x所在位置                  |



##### 3、编辑命令

①选中文本
 在vi中要选中文本需要使用Visual命令切换到可视模式，vi中提供了三种可视模式以便选中文本，按"esc"可以放弃选中，返回到命令模式。

| 命令     | 英文       | 功能                               |
| -------- | ---------- | ---------------------------------- |
| v        | 可视模式   | 从光标位置开始按照正常模式选择文本 |
| V        | 可视行模式 | 选中光标经过的完整行               |
| ctrl + v | 可视块模式 | 垂直方向选中文本                   |

注：在可视模式可以和移动命令连用，如ggVG会选中全部内容。
 ②删除文本

| 命令        | 英文   | 功能                             |
| ----------- | ------ | -------------------------------- |
| x           | cut    | 删除光标所在字符或选中的字符     |
| d(移动命令) | delete | 删除移动命令对应的内容           |
| dd          | delete | 删除光标所在行(数字dd即删除多行) |
| D           | delete | 删除至行尾                       |

提示：可视模式下选中的文本，使用d和x都可以删除选中的文本。
 删除命令可以与移动命令连用，以下是常见组合：

```
dw        从光标位置删除到单词末尾
d0        从光标位置删除到一行的起始位置
d}        从光标位置删除到段落结尾
ndd       从光标位置向下连续删除n行
d行数G     从光标所在行删除到指定行之间的内容
d'a       从光标所在行删除到标记a之间的所有内容
123456
```

③复制粘贴文本
 vi提供有一个被复制文本的缓冲区，复制和删除命令都会讲选中的文字保存在缓冲区，在需要的位置使用粘贴便可以将缓冲区的文本插入到光标所在位置。

| 命令        | 英文  | 功能                      |
| ----------- | ----- | ------------------------- |
| y(移动命令) | copy  | 复制                      |
| yy          | copy  | 复制一行，可以nyy复制多行 |
| p           | paste | 粘贴                      |

提示：要想实现剪切效果，可以对文本先删除，再粘贴。
 vi中文本缓冲区只有一个，若后续做过复制，剪切操作，之前的缓冲区内容会被替换。

注意：vi中的文本缓冲区和系统中的剪切板不是同一个东西，所以使用在别的地方使用ctrl + c复制的内容无法在vi中通过p命令进行粘贴，可在编辑模式下使用鼠标右键粘贴。
 ④替换

| 命令 | 英文    | 功能                   | 工作模式 |
| ---- | ------- | ---------------------- | -------- |
| r    | replace | 替换当前字符           | 命令模式 |
| R    | replace | 替换当前行光标后的字符 | 替换模式 |

注：R命令进入替换模式，替换完成后按下"esc"可以回到命令模式。
 ⑤缩排和重复执行

| 命令 | 功能         |
| ---- | ------------ |
| >>   | 向右增加缩进 |
| <<   | 向左减少缩进 |
| .    | 重复上传命令 |

注：每次缩进量为4个空格。在可视模式下，缩排命令只需要一个">“或”<"。

 ##### 4、撤销命令

| 命令     | 英文 | 功能           |
| -------- | ---- | -------------- |
| u        | undo | 撤销上次命令   |
| ctrl + r | redo | 恢复撤销的命令 |

##### 5、查找和替换命令

 ①常规查找

| 命令 | 功能    |
| ---- | ------- |
| /str | 查找str |

查找到之后可以使用如下命令查看下一个：
 n：查找下一个
 N：查找上一个
 ②单词快速匹配

| 命令 | 功能                     |
| ---- | ------------------------ |
| *    | 向后查找当前光标所在单词 |
| #    | 向前查找当前光标所在单词 |

③查找并替换
 vi中查找和替换需要在末行模式下执行，命令格式如下：

```
:%s///g
1
```

a：全局替换
 一次性替换文件中所有出现的旧文本：

```
:%s/旧文本/新文本/g
1
```

b：可视区域替换
 先选中要替换文字的范围，然后执行命令：

```
:s/旧文本/新文本/g
1
```

c：确认替换
 在命令后添加"c"，替换时会有提示，推荐使用该方式进行替换：

```
:%s/旧文本/新文本/gc
1
```

提示如下：

```
y   -yes   替换
n   -no    不替换
a   -all   替换所有
q   -quit  退出替换
l   -last  最后一个，并把光标移动到行首
^E  向下滚屏
^Y  向上滚屏
1234567
```

6、插入命令
 在vi中除了"i"进行编辑模式外，使用如下命令同样可以进入编辑模式：

| 命令 | 英文   | 功能                   |
| ---- | ------ | ---------------------- |
| i    | insert | 在当前字符前插入文本   |
| I    | insert | 在行首插入文本         |
| a    | append | 在当前字符后添加文本   |
| A    | append | 在行末添加文本         |
| o    |        | 在当前行后面插入一空行 |
| O    |        | 在当前行前面插入一空行 |

 7、分屏命令
 vi中的高级命令，可以同时编辑和查看多个文件。
 ①末行命令扩展

| 命令      | 英文  | 功能                                         |
| --------- | ----- | -------------------------------------------- |
| :e.       | edit  | 会打开内置的文件浏览器，浏览当前目录下的文件 |
| :n 文件名 | new   | 新建文件                                     |
| :w 文件名 | write | 另存为，但是仍然编辑当前文件，不会切换文件   |

注：切换文件前一定要保证当前文件已被保存。
 ②分屏命令
 使用分屏可以同时编辑和查看多个文件

| 命令          | 英文           | 功能         |
| ------------- | -------------- | ------------ |
| :sp [文件名]  | split          | 横向增加分屏 |
| :vsp [文件名] | vertical split | 纵向增加分屏 |

切换分屏窗口，分屏窗口都是基于ctrl + w的：

| 命令 | 英文    | 功能                                   |
| ---- | ------- | -------------------------------------- |
| w    | window  | 切换到下一个窗口                       |
| r    | reverse | 互换窗口                               |
| c    | close   | 关闭当前窗口，但不关闭最后一个窗口     |
| q    | quit    | 退出当前窗口，若是最后一个窗口则关闭vi |
| o    | other   | 关闭其他窗口                           |



## Java

我们的电脑已经提前配置好了 Java 环境



### 介绍



Java是一门[面向对象](https://baike.baidu.com/item/面向对象)编程语言，不仅吸收了[C++](https://baike.baidu.com/item/C%2B%2B)语言的各种优点，还摒弃了C++里难以理解的[多继承](https://baike.baidu.com/item/多继承)、[指针](https://baike.baidu.com/item/指针/2878304)等概念，因此Java语言具有功能强大和简单易用两个特征。Java语言作为静态面向对象编程语言的代表，极好地实现了面向对象理论，允许程序员以优雅的思维方式进行复杂的编程 。



### 编写第一个 Java 程序 hello world



首先用以下指令来查看以下我们的 Java 版本

```sh
java -version
```

在我自己的本机上得到这样的输出

```sh
java 12.0.2 2019-07-16                                                           Java(TM) SE Runtime Environment (build 12.0.2+10)                               Java HotSpot(TM) 64-Bit Server VM (build 12.0.2+10, mixed mode, sharing)  
```

这说明我已经安装好了 Java 环境

接下来我们创建一个 HelloWorld.java 的文件

然后选择用一个 IDE 打开

输入以下内容

```java
public class HelloWorld {
       public static void main(String[] args) {
              System.out.println("Hello World java");
       }
}
```

这样就编辑好了我们的第一个 java 程序 helloworld

然后通过命令行，定位到指定目录，输入以下编译指令：

```sh
javac HelloWorld.java
```

随后文件夹中多了 HelloWorld.class 的文件，编译成功！

接下来我们输入如下指令运行这个程序

```sh
java HelloWorld
```

得到输出

```
Hello World java
```

我们的第一个程序圆满成功。



在云桌面的环境中，使用 eclipse，创建项目，然后创建这个 HelloWorld 类，直接运行即可

准备云桌面中 java 不能直接运行的问题，这里写一个解决方式，供大家参考：



### 云桌面中 java 不能直接运行的解决



不能够直接运行 报错 Could not find or load main class(找不到或无法加载主类)

需要对环境变量进行一些更改这里的错误原因是环境变量中的路径添加有问题

在不更改环境变量的情况下如果加上 -classpath 也是可以正常运行，不过不加的话就会报错


```
administrator@vinzor:~/Desktop/Test$ java -classpath ~/Desktop/Test/ HelloWorld
Hello World java


administrator@vinzor:~/Desktop/Test$ java HelloWorld
Error: Could not find or load main class HelloWorld

```

这是由于环境变量，在路径那里缺了 “.:”，缺了时候就无法定位到当然目录了，只能依靠 classpath，我们进行如下更改即可

```
之前的环境变量
export JAVA_HOME=~/Desktop/java1.8
export CLASSPATH=$JAVA_HOME/lib/
export PATH=${JAVA_HOME}/bin:$PATH

改成下面的样子
export JAVA_HOME=~/Desktop/java1.8
export CLASSPATH=.:$JAVA_HOME/lib/
export PATH=.:${JAVA_HOME}/bin:$PATH
```



问题解决！！！

```
administrator@vinzor:~/Desktop/Test$ java HelloWorld 
Hello World java

```



## Ant



### 介绍

Ant是Java的生成工具，是Apache的核心项目；直接在apache官网下载即可；

Ant类似于Unix中的Make工具，都是用来编译、生成；

Ant是跨平台的，而Make不能；

Ant的主要目的就是把你想做的事情自动化，不用你手动一步一步做，因为里面内置了javac、java、创建目录、复制文件等功能，所以可以直接点击Ant文件，即可编译生成你的项目。



### 入门

ant的默认生成文件为build.xml；输入ant后，ant会在当前目录下搜索是否有build.xml，如果有，则执行；当然也可以自定义生成文件，通过**ant -f a.xml**即可指定a.xml为生成文件；

 

ant的生成文件是xml文件，整体结构为：

```xml
<?xml version="1.0" encoding="GBK"?>
<project default=" targetname">
    <target name="name">
    </target>
</project>
```

project是生成文件的根元素，表示一个工程；

target是project的子元素，表示一个任务；一个project中可以定义多个target元素，表示多个任务；

default属性表示默认执行的target，如果ant命令没有指定target，则执行default的target；

ant targetname;则会执行此target，而忽略default设置的target；

**注意：不能有两个相同的targetname；**

**代码举例：创建mm目录；**

```xml
<project default="mkdir">
	<property name="name" value="mm"/>
	<target name="mkdir">
		<mkdir dir="${name}"/>
	</target>
</project>
```

运行一下，直接在相应的目录下输入 ant

可以看到这个目录中多了 mm 目录，终端也输出了运行的相关信息

![image-20201010155204656](https://gitee.com/mu-he-nan/se2020-practice/raw/master/Stage1/img/image-20201010155204656.png)



### Ant的XML元素详解

1. <project> 元素

是Ant生成文件的根元素；一般形式如：<project default="    "[ basedir="." ] [name="projectname"]>

default的值是默认执行的target名；

basedir是指定基准目录，一般都是basedir="."

name是指工程名字；

2. <target>元素

是project元素的子元素，在project元素中能够有多个target；一般形式如下：

<target name="    "  [ depends="  A  "]  [ if ="  prop1 "] [ unless=" prop2"]>

</target>

name表示target的名称；

depends中填写其他target名称(可以有多个名称，用逗号分割)，表示只有targetA完成之后才能够做此target，如果执行此target，则会先执行A；

if的值表示一个属性名，只有设置了该属性名，才能执行此target；

unless的值表示一个属性名，只有没有设置该属性名，才能执行此target；

3. <property> 元素

是project的子元素；property用于定义属性，一般形如：

(1)<property name="  pname  "   value="  pvalue   "/>

如果要使用此property，则需要${pname}；类似于表达式语言；

(2)<property file="a.properties"></property> 通过此属性文件导入属性；

如果单纯想使用$，则通过$$表示；



### Task介绍

在Ant中Task是target的子元素，即一个target中可以有多个task；而Task分为：
(1)核心Task；
(2)可选Task；
(3)自定义Task；
下面介绍一些常用的核心Task；

1.<echo>

用于单纯输出，一般形如：
<echo>      </echo>
举例：<echo>hello</echo>

2.<javac>

用于编译java文件，一般形式如下：

<javac srcdir="  src   "       destdir="  class   "  [classpath="     "]/>；
srcdir是编译此文件夹下或子文件夹下的全部java文件;
destdir是编译后的class文件放置路径；
classpath指定第三方类库；

3.<java>

运行java类，一般形式如下：
<java classname="    " fork="yes">
    【<arg line="param1   param2   param3"/>】
</java>
classname用于指定运行的类名称；
fork="yes"表示另起一个JVM来执行java命令，而不是中断ANT命令，因此fork必须为yes；

4.<jar> 

打包成jar包；一般形式如下：
<jar destfile="  main.jar" basedir="    ">
    <manifest>
        <attribute name="Main-Class"   value="classname"/>    <!--指定主类-->
    </manifest>
</jar>
destfiie的值为jar包的名称；一般为```$ {dest}/main.jar```；
basedir的值是需要打成jar包的目录；一般为 $ {classes}
manifest表示设置META-INF；

5.<mkdir>

创建目录，可以多层创建，比如a\b\c，则可以连续创建，一般形式如下：
<mkdir dir="a\b"/>

6.<delete>

删除目录，一般形式如下：
<delete dir="a\b"/> 可以删除a目录下的b目录；
<delete file="1.txt"/>可以删除文件；

7.<tstamp>

时间戳，一般形式如下：
<tstamp />
接下来可以使用${DSTAMP}进行调用当前时间；

8.<copy>

复制文件，一般形式如下：
<copy file="file1" tofile="file2"/>
file是源文件；
tofile是目标文件；

9.<move>

移动文件，一般形式如下：
<move file="file1" tofile="file2"/>
file是源文件；
tofile是目标文件；

10.<replace>

 用于替换字符串，类似于String的replace操作，一般形式如下：
<replace file="filename" token="old" value="new"/>
file表示要执行替换的文件；
token表示被替换的字符串；
value表示替换的字符串；



### 用 ant 编译自己的 helloworld 程序

首先构建好文件的结构，build.xml 文件 和 src 文件夹 在同一个目录 AntAndHelloWorld 下

![image-20201010163546351](Https://gitee.com/mu-he-nan/se2020-practice/raw/master/Stage1/img/image-20201010163546351.png)

然后 src 下有一 HelloWorld.java

![image-20201010163649748](Https://gitee.com/mu-he-nan/se2020-practice/raw/master/Stage1/img/image-20201010163649748.png)

build.xml 的内容如下：

分别包括了

* 清除掉之前生成的文件
* 将一个新的文件夹，用来放生成文件
* 编译
* 运行

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<project name="HelloWorld" default="run" basedir=".">
    <property name="src" value="src"/>
    <property name="dest" value="classes"/>
	
	<target name = "clean">
	    <delete dir = "${dest}"/>
	</target>
	
    <target name = "init" depends = "clean">
        <mkdir dir = "${dest}"/>
    </target>

    <target name = "compile" depends = "init">
        <javac srcdir = "${src}" destdir = "${dest}" includeantruntime = "false"/>
    </target>

    <target name = "run" depends = "compile">
        <java classname = "HelloWorld" classpath = "${dest}"/>
    </target>
</project>
```

运行结果如下：

![image-20201010163856097](Https://gitee.com/mu-he-nan/se2020-practice/raw/master/Stage1/img/image-20201010163856097.png)



## Junit



### 介绍

JUnit是一个Java语言的单元测试框架。它由Kent Beck和Erich Gamma建立，逐渐成为源于Kent Beck的sUnit的xUnit家族中最为成功的一个。 JUnit有它自己的JUnit扩展生态圈。多数Java的开发环境都已经集成了JUnit作为单元测试的工具。 

JUnit是由 Erich Gamma 和 Kent Beck 编写的一个[回归测试](https://baike.baidu.com/item/回归测试/1925732)框架（regression testing framework）。Junit测试是程序员测试，即所谓[白盒测试](https://baike.baidu.com/item/白盒测试/934440)，因为程序员知道被测试的软件如何（How）完成功能和完成什么样（What）的功能。Junit是一套框架，继承TestCase类，就可以用Junit进行自动测试了。



### 用自己写的 Junit 测试自己的 HelloWorld 程序

我们的代码结构如下

![image-20201010155354730](https://gitee.com/mu-he-nan/se2020-practice/raw/master/Stage1/img/image-20201010155354730.png)

随后建一个用于 Junit 测试的 package，然后创建 Junit 的文件

![image-20201010155457188](https://gitee.com/mu-he-nan/se2020-practice/raw/master/Stage1/img/image-20201010155457188.png)

整个的文件结构如下

![image-20201010155631007](https://gitee.com/mu-he-nan/se2020-practice/raw/master/Stage1/img/image-20201010155631007.png)

然后编写代码

被测试的 HelloWorld.java 的代码如下：

```java
package hello;

public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello World java");
		//HelloWorld h = new HelloWorld();
		//h.printHello();
	}
	public int printHello(){
		return 1;
	}
}

```

用于测试的 TestHello.java  的代码如下：

```java
package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.HelloWorld;

public class TestHello {

	HelloWorld h = new HelloWorld();
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		int temp = h.printHello();
		assertEquals(temp, 1);
	}
	
}


```

运行进行测试：

![image-20201010155735345](https://gitee.com/mu-he-nan/se2020-practice/raw/master/Stage1/img/image-20201010155735345.png)

测试结果如下：

![image-20201010155850005](https://gitee.com/mu-he-nan/se2020-practice/raw/master/Stage1/img/image-20201010155850005.png)









