断路器监控：
1. 首先挨个运行 EurekaServerApplication, ConfigServerApplication, ProductDataServiceApplication， ProductViewServiceFeignApplication，ProductServiceHystrixDashboardApplication
2. 运行视图微服务里的 AccessViewService 来周期性地访问 http://127.0.0.1:8012/products。 因为只有访问了，监控里才能看到数据。
3. 打开监控地址
http://localhost:8020/hystrix
4. 如图所示，在最上面输入

http://localhost:8012/actuator/hystrix.stream


这个地址就是视图微服务的短路信息。
5. 然后点击 Monitor Stream 就可以看到监控信息了。