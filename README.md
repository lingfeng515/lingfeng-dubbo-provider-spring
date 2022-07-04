# lingfeng-dubbo-provider-spring
dubbo提供者服务搭建--xml配置方式
服务启动成功方式：
    1、启动zookeeper注册中心服务
      1.1、下载zookeeper
      1.2、修改配置文件
      1.3、先启动zookeeper服务端，再启动zookeeper客户端
      1.4、参考：https://blog.csdn.net/Haiking_li/article/details/123755417
    2、启动UserServiceApp中的main方法
    3、完成前两步意味着dubbo提供者服务启动成功并且注册到zookeeper注册中心，
       dubbo消费者可以连接该注册中心地址进行接口调用
