### Pattern
```markdown
%sn 行号
%p logger级别
%t 线程
%logger logger申明的类
%class logger打印的类 简写 %C{1.}简写包名 %C{-1} 部分包名 %C{10}全包名
%M 方法名
%L 行号
%F 文件名
%msg log信息 简写 %m,另外写法 %-5level
%n 换行
%style ANSI样式 例: %style{%c{1.} [%t] %m}{bold,red}
%highlight 高亮显示 例: %highlight{%p}
```

### Usage
```xml
<?xml version="1.0" encoding="UTF-8" ?>
<Configuration status="warn">
    <Appenders>
        <Console name="console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{HH:mm:ss.SSS}[%t] %-5level %logger{36} -%msg%n"/>
        </Console>
        <RandomAccessFile name="file" fileName="d:/log4j2-demo.log" immediateFlush="false">
            <PatternLayout pattern="%d{HH:mm:ss}[%t] %-5level %logger{36} -%msg%n"/>
        </RandomAccessFile>
    </Appenders>
    <Loggers>
        <Root level="debug">
            <AppenderRef ref="console"/>
        </Root>
        <Logger name="org.demos.simple.DogService" level="error" additivity="false">
            <AppenderRef ref="file"/>
        </Logger>
    </Loggers>
</Configuration>
```