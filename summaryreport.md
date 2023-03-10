[TOC]

# 实训总结报告



姓名：母贺楠

学号：1834276



这次中级实训收获非常大，通过这几周的实训，确实学到了非常多的东西。这篇报告我主要想总结一下学到的东西和自己的一些感受。

收获主要有两方面：一个是写代码方面，更加工程化更加规范，也学到了很多理论知识；另一个是熟悉了很多有力的开发工具。





## 第一阶段

* Java

  首先是熟悉了 Java 的一些常规写法和特性，虽然之前上过 Java 课，但主要是学理论，真正的工程实战并不多，这次自己动手写了一些代码，感觉对 Java 的使用更熟练了。

* Linux 操作系统

  实训刚开始的时候，环境的配置稍微出了一点点问题，通过上网查报错信息环境变量等情况，搞懂环境变量后，自己进行了一些更改，bug解决，虽然这是一个小意外，但也让我对 Linux 操作系统更加熟悉。

* ant

  学会了自己编写 ant ，这个东西类似 c 里面的 makefile ，掌握以后非常有用。我也学习到了如何将软件编译、测试、部署等步骤加在一起并自动化执行的知识。

* Junit

  也学会了 Junit 测试代码的编写，这个要用到 Junit 特定的库，然后进行一些代码的编写，自己写程序来进行测试。在运行的时候刚开始也是出了点问题，junit 包好像不能用？不过换用 eclipse 后，在 eclipse 里面进行测试，问题也得以解决，再后期也越来越发现 eclipse 的厉害之处。

  对于单元测试，我觉得这种工具真的是一种利器，在一个大型项目面前，这工具能很好的逐个逐个小部分的排查bug的所在，减少了排查bug的消耗和成本，我相信在以后的工作学习中也会经常用到它。

* sonar

  初次使用 sonar 进行扫描，通过 sonar 报告的问题我知道了自己写代码的风格问题，一些括号啊类啊接口的使用，很多都不是很规范，为了追求简洁其实已经是出了很多小问题，程序的可读性不高也不够健壮。

  根据 sonar 报告的问题进行了一些修改，代码风格好了很多。通过多次对代码进行代码质量检测，我逐渐在敲代码的过程中养成了规范化写代码的习惯，包括像相应的括号，变量的来源和对代码的注释。



## 第二阶段

这部分主要是在 GridWorld 包的基础上完成了很多代码的编写和问题的回答，这个阶段就主要的我感觉就是阅读文档的能力，在已有的包的基础上，看懂各个类和各个方面的用法，逻辑关系，结构，然后自己用这些类这些方法进行新的拓展，实现一些新的功能。

最主要的就是要把文档充分看懂，课程网上中还有各种继承调用的框图，也要充分理解才能知道要怎么实现。

在 Part5 中用不同的数据结构实现存储，通过对比使用不同数据结构时各个函数运行的时间复杂度，更加清楚了什么时候适用什么数据结构。

总体而言通过这个阶段，读文档和写代码的能力提升很大。



## 第三阶段



这个阶段的三个项目感觉难度要明显大于之前的项目，对于这里的三个项目，我均采用了 eclipse 来进行开发。

* ImageProcessing

  首先是了解了关于 bmp 位图的一些信息，清楚了这种文件的格式。

  学习了如何对一副图片进行阅读。在这个过程中，我觉得最重要的是学习了对java中文件流的使用，流的使用使得我们在处理图片的时候更加的得心应手，更加的方便。

  然后是学会了如何画一张图，以及保存图片的 API 的使用。

* MazeBug 和 N-Puzzle

  这里主要是学到了很多算法方面的知识，因为之前上过算法设计的课程，所以这里上手的时候并没有非常困难，对于后面用的 A* 算法，之前也算是学过，这里主要是根据题目的具体情况进行一些调整。

  MazeBug 这里就使用到了基础的 DFS 和一些增加方向预测，这里我的方向预测是根据之前已走过的情况来进行预测的，总体来说最后的效果还是不错的。

  N-Puzzle 这里首先第一步我觉得很重要的一步其实是对这个问题的建模把这个问题用合适的数据结构表达出了（虽然这已经实现好了），但我觉得首先看懂这一步还是很重要的。

  然后就是充分阅读文档，了解各种接口的具体用法，全部看懂后，我们要实现的只有 Solution 部分的两个算法，首先是常规的 BFS，通过一个队列实现即可；接下来用于 A* 算法的一个估价函数，这个函数比较考究，不同的实现在结果上会造成很大的区别，我尝试了几种不同的实现方法，最后发现用 所有放错位的数码与其正确位置的距离之和 加上 后续节点不正确的数码个数 来作为估价函数效果更好些。



## Eclipse

整个开发过程中，Eclipse 真的是帮了大忙，在面对后面的几个大项目时，自己部署的时候总是容易出些问题，通过 eclipse 对项目进行部署后，项目的各个部分变得井井有条。

在编译运行方面，引入外部包方面（eclipse 会自己写好 classpath），Junit 测试方面（有很好的报错和测试的界面），Eclipse 都非常友好，大大提高了开发效率，也让开发的体验更好。

掌握好的开发工具对我们的开发帮助很大！！！不能害怕麻烦，要乐于接受和学习新工具！磨刀不误砍柴工。



## 最后的总结

整个这次实训下来在各个方面都收获很大，感觉自己的开发能力有了很大提升，对 Java 语言各方面更加熟悉了；对各种开发工具也可以更加灵活的使用了，尤其是是对 eclipse 更加精通；阅读文档，使用外部包使用各种 API 的能力也有所提升，这几周的时间安排也刚刚好，感觉这种工程实训比上课做课设远远更有帮助，期待下次的高级实训！

最后也感谢各位 TA 师兄师姐，解答了我的很多问题，在聊天的过程中也让我学到了很多新的的东西，让我受益匪浅！！