# spring-boot-dubbo

## 依赖版本号

```xml
        <hutool.version>5.7.16</hutool.version>
        <nacos-client.version>2.0.3</nacos-client.version>
        <dubbo.version>3.0.4</dubbo.version>
```

## SpringBoot整合Dubbo和Nacos注册中心
- 使用Spring Boot框架来实现Dubbo和Nacos注册中心的整合。Dubbo是阿里巴巴开源的高性能RPC框架，而Nacos是一个动态服务发现和配置管理平台。

- 对于提供者（服务的提供方），我们需要指定服务接口、服务实现类和Dubbo的服务导出配置。这样，我们的服务将会被发布到Dubbo注册中心，供消费者使用。

- 对于消费者（服务的使用方），我们需要指定需要调用的服务接口和Dubbo的服务引用配置。这样，消费者就可以从Dubbo注册中心获取提供者的地址，并通过远程调用来使用这些服务。

- 😊通过Spring Boot整合Dubbo和Nacos注册中心，我们可以实现分布式系统的构建和管理，提供高性能的RPC服务，同时具备动态服务发现和配置管理的功能。
