学习《Akka实战：快速构建高可用分布式应用》

第1章 认识akka

1.1.2 akka是什么
并行于并发
异步非阻塞
高容错性
持久化

1.2 akka的应用场景
1.3 akka的架构体系
1.3.1 actor模型
1.3.2 体系结构
层级的结构，整个actor体系被抽象为一个actorsystem

引用 actor
状态 state
行为 behavior
监管策略

第2章 走进actor

2.1 actor组件
2.1.1 akka中的actor
线程安全：
轻量级

2.1.2 actorsystem 与监管

当子actor出现异常情况，父actor可以通过匹配预先设定的某个动作来处理子actor，处理方式有：恢复子级、重启子级、停止子级、扩大失败

2.1.4 引用和路径
既可以在本地也可以在远程

2.3 创建一个actor


















