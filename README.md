# gateway-uaa-allinone
Spring Boot GW and UAA all in one

## Project structure

OAuth2 Resource server is one micro-service (geo-service).
REST endpoints exposed:
- /api/countries <- list all countries 
- /api/countries/{alpha2} <- fetch one country


Gateway and OAuth2 Authorization server (all in one).
Based on Spring Cloud Zuul.


##m Issue

```
2017-12-30 10:01:00.315 DEBUG 4593 --- [  restartedMain] o.s.b.d.LoggingFailureAnalysisReporter   : Application failed to start due to an exception

org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateFactory' available
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:353) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:351) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:340) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1092) ~[spring-context-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.boot.autoconfigure.security.oauth2.client.SsoSecurityConfigurer.oauth2SsoFilter(SsoSecurityConfigurer.java:87) ~[spring-boot-autoconfigure-1.5.9.RELEASE.jar:1.5.9.RELEASE]
	at org.springframework.boot.autoconfigure.security.oauth2.client.SsoSecurityConfigurer.configure(SsoSecurityConfigurer.java:59) ~[spring-boot-autoconfigure-1.5.9.RELEASE.jar:1.5.9.RELEASE]
	at org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2SsoDefaultConfiguration.configure(OAuth2SsoDefaultConfiguration.java:59) ~[spring-boot-autoconfigure-1.5.9.RELEASE.jar:1.5.9.RELEASE]
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter.getHttp(WebSecurityConfigurerAdapter.java:224) ~[spring-security-config-4.2.3.RELEASE.jar:4.2.3.RELEASE]
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter.init(WebSecurityConfigurerAdapter.java:315) ~[spring-security-config-4.2.3.RELEASE.jar:4.2.3.RELEASE]
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter.init(WebSecurityConfigurerAdapter.java:86) ~[spring-security-config-4.2.3.RELEASE.jar:4.2.3.RELEASE]
	at org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2SsoDefaultConfiguration$$EnhancerBySpringCGLIB$$56e93c20.init(<generated>) ~[spring-boot-autoconfigure-1.5.9.RELEASE.jar:1.5.9.RELEASE]
	at org.springframework.security.config.annotation.AbstractConfiguredSecurityBuilder.init(AbstractConfiguredSecurityBuilder.java:371) ~[spring-security-config-4.2.3.RELEASE.jar:4.2.3.RELEASE]
	at org.springframework.security.config.annotation.AbstractConfiguredSecurityBuilder.doBuild(AbstractConfiguredSecurityBuilder.java:325) ~[spring-security-config-4.2.3.RELEASE.jar:4.2.3.RELEASE]
	at org.springframework.security.config.annotation.AbstractSecurityBuilder.build(AbstractSecurityBuilder.java:41) ~[spring-security-config-4.2.3.RELEASE.jar:4.2.3.RELEASE]
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration.springSecurityFilterChain(WebSecurityConfiguration.java:104) ~[spring-security-config-4.2.3.RELEASE.jar:4.2.3.RELEASE]
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration$$EnhancerBySpringCGLIB$$afd31657.CGLIB$springSecurityFilterChain$1(<generated>) ~[spring-security-config-4.2.3.RELEASE.jar:4.2.3.RELEASE]
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration$$EnhancerBySpringCGLIB$$afd31657$$FastClassBySpringCGLIB$$ec3fc8e6.invoke(<generated>) ~[spring-security-config-4.2.3.RELEASE.jar:4.2.3.RELEASE]
	at org.springframework.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228) ~[spring-core-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.context.annotation.ConfigurationClassEnhancer$BeanMethodInterceptor.intercept(ConfigurationClassEnhancer.java:358) ~[spring-context-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration$$EnhancerBySpringCGLIB$$afd31657.springSecurityFilterChain(<generated>) ~[spring-security-config-4.2.3.RELEASE.jar:4.2.3.RELEASE]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_152]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_152]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_152]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_152]
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:162) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:588) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1173) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1067) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:513) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:483) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:306) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:302) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:197) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:296) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:197) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:761) ~[spring-beans-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:867) ~[spring-context-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:543) ~[spring-context-4.3.13.RELEASE.jar:4.3.13.RELEASE]
	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122) ~[spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:693) [spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:360) [spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:303) [spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118) [spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107) [spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
	at rs.in.staleksit.evidencija.gateway.Application.main(Application.java:14) [classes/:na]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_152]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_152]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_152]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_152]
	at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:49) [spring-boot-devtools-1.5.9.RELEASE.jar:1.5.9.RELEASE]

2017-12-30 10:01:00.316 ERROR 4593 --- [  restartedMain] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

Method springSecurityFilterChain in org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration required a bean of type 'org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateFactory' that could not be found.
	- Bean method 'userInfoRestTemplateFactory' not loaded because @ConditionalOnMissingBean (types: org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerEndpointsConfiguration; SearchStrategy: all) found bean 'org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerEndpointsConfiguration'


Action:

Consider revisiting the conditions above or defining a bean of type 'org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateFactory' in your configuration.

Disconnected from the target VM, address: '127.0.0.1:54523', transport: 'socket'

Process finished with exit code 0


```
