断路器聚合监控：
1. 首先挨个运行 EurekaServerApplication, ConfigServerApplication, ProductDataServiceApplication， ProductViewServiceFeignApplication:8012，， ProductViewServiceFeignApplication:8013，ProductServiceHystrixDashboardApplication, ProductServiceTurbineApplication.
2. 运行视图微服务里的 AccessViewService 来周期性地访问 http://127.0.0.1:8012/products 和 http://127.0.0.1:8013/products。 因为只有访问了，监控里才能看到数据。
3. 打开监控地址
http://localhost:8020/hystrix
4. 在最上面输入

http://localhost:8021/turbine.stream


这个地址就是汇聚了8012，8013 两个视图微服务 turbine聚合信息。
5. 然后点击 Monitor Stream 就可以看到监控信息了。