学号：18342076

姓名：母贺楠



项目主要有三个文件，三个文件分别是：

* **HelloWorld/AntAndHelloWorld** ：ant 自动编译运行 HelloWorld
* **HelloWorld/JunitAndAntHW** ：用 Junit 测试 HelloWorld
* **Calculator** ：计算器 Java 小程序，并用于用 sonar 扫描



具体使用方法：



### **HelloWorld/AntAndHelloWorld** ：ant 自动编译运行 HelloWorld

终端进入 **AntAndHelloWorld** 文件夹，直接输入 ant 即可编译运行 HelloWorld，运行情况如下

```sh
administrator@vinzor:~/Desktop/se2020-practice/Stage1/Test/AntAndHelloWorld$ ant
Buildfile: /home/administrator/Desktop/se2020-practice/Stage1/Test/AntAndHelloWorld/build.xml

clean:
   [delete] Deleting directory /home/administrator/Desktop/se2020-practice/Stage1/Test/AntAndHelloWorld/classes

init:
    [mkdir] Created dir: /home/administrator/Desktop/se2020-practice/Stage1/Test/AntAndHelloWorld/classes

compile:
    [javac] Compiling 1 source file to /home/administrator/Desktop/se2020-practice/Stage1/Test/AntAndHelloWorld/classes

run:
     [java] Hello World java

BUILD SUCCESSFUL
Total time: 0 seconds
```



### **HelloWorld/JunitAndAntHW** ：用 Junit 测试 HelloWorld

这里我们的 Junit 包可能出现了一些小问题，所以在命令行用 ant 编译运行测试难以实现，所以这里借助了 eclipse

直接用 **eclipse** 打开 **JunitAndAntHW** 这个工程

然后在测试的文件那里，**右键 -> Run as -> 1 Junit Test**

即可在 eclipse 中看到 Junit 测试的结果

（测试成功后，这里我查看了一下 eclipse 自己生成的 build.xml 文件，发现 eclipse 用的 junit 包并不是我们下载的 junit 包，而是其他的 junit 包）



### **Calculator** ：计算器 Java 小程序，并用于用 sonar 扫描

首先，运行这个小程序操作：**终端进入到 Calculator 文件夹 -> 再进入 target 文件 -> 终端输入 java Calculator 运行即可**

重点说一下 sonar 的使用

首先我们要启动服务，这样我们才能访问 http://localhost:9000 ，开启服务的操作如下：

```sh
administrator@vinzor:~$ cd $SONAR_HOME
administrator@vinzor:~/Desktop/sonar-3.7.4/bin/linux-x86-64$ ./sonar.sh start
Starting sonar...
Removed stale pid file: /home/administrator/Desktop/sonar-3.7.4/bin/linux-x86-64/./sonar.pid
Started sonar.
administrator@vinzor:~/Desktop/sonar-3.7.4/bin/linux-x86-64$ 
```

这时我们已经启动了服务，这时在浏览器打开 http://localhost:9000 就可以看到相关信息了

随后还是终端进入 **Calculator** 文件夹，sonar-project.properties 文件已经在里面写好，直接终端 输入 `sonar-runner` 即可开始扫描

这时在 终端可以看到相应的输出

扫描过后，刷新  http://localhost:9000  界面，即可看到我们的代码的扫描结果

最后使用完以后，记得关闭服务，具体操作如下：

```sh
administrator@vinzor:~/Desktop/sonar-3.7.4/bin/linux-x86-64$ ./sonar.sh stop
Stopping sonar...
Stopped sonar.
administrator@vinzor:~/Desktop/sonar-3.7.4/bin/linux-x86-64$ 

```





***



### 番外：记录一下 BugRunner 的编译运行过程

这里的编译运行因为输入的指令不同会出现一些奇怪的问题

这里把要运行的 BugRunner.java 文件直接直接放到 GridWorldCode 目录，然后进行如下的编译运行即可


```
administrator@vinzor:~/Desktop/se2020-practice/GridWorldCode$ javac -cp gridworld.jar BugRunner.java
administrator@vinzor:~/Desktop/se2020-practice/GridWorldCode$ java -cp .:gridworld.jar BugRunner
```

