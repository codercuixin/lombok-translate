# lombok-translate
## 为什么要使用lombok。
- 普通的 POJO 需要写或是用IDEA等集成开发环境生成大量gettter, setter方法
- 普通的 POJO 对于 equals 和 hashCode 等方法，也需要自己维护。特别你写接口的时候，如果添加了
一个字段忘了维护，可能会导致一些bug。
- 普通的 POJO 没有 builder 的支持，得自己实现该模式。
- ....

总之，lombok 极大地简化你的代码，去掉了那些模板代码，让你的POJO看起来更加地清爽（可以只有类名和字段的声明，加上少量的注解）。

## jar 包的下载
```
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.8</version>
    <scope>provided</scope>
</dependency>
```

## IntelliJ IDEA 中 安装lombok插件。
其他集成开发环境（比如 Visual Studio Code, Eclipse), 请参见[官方文档](https://projectlombok.org/) Install部分。
![install-lombok-plugin.png](https://upload-images.jianshu.io/upload_images/4148467-a134df7e6f1a3746.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

##  下面主要是对[lombok features](https://www.projectlombok.org/features/all)部分的翻译

> [val](https://github.com/codercuixin/lombok-translate/wiki/val)

 终于! 无忧无虑的 final 局部变量。 :v:

> [var](https://github.com/codercuixin/lombok-translate/wiki/var) 

可变！类型可变的局部变量

> [@NonNull](https://github.com/codercuixin/lombok-translate/wiki/@NonNull) 

我开始停止了焦虑，爱上了空指针 :kissing_heart:

> [@Getter/@Setter](https://github.com/codercuixin/lombok-translate/wiki/@Getter-and-@Setter)

再也不用写 `public int getFoo() {return foo;}`了。

> [ToString](https://github.com/codercuixin/lombok-translate/wiki/%40ToString/_edit)

没必要启动debugger来查看你的字段：让 lombok来为你生成一个 `ToString` 方法吧！

> [@EqualsAndHashCode](https://github.com/codercuixin/lombok-translate/wiki/@EqualsAndHashCode)

让相等变得简单: 从你对象的字段中生成 `hashCode` 和 `equals` 的实现

> [@NoArgsConstructor, @RequiredArgsConstructor and @AllArgsConstructor](https://github.com/codercuixin/lombok-translate/wiki/@NoArgsConstructor,-@RequiredArgsConstructor,-@AllArgsConstructor)

按需生成构造函数: 生成不带参数的， 每个 final/non-null 字段一个参数的，一个字段一个参数的构造函数。

> [@Data](https://github.com/codercuixin/lombok-translate/wiki/@Data)

 所有的都合到一起：`@ToString`，`@ EqualsAndHashCode`，所有字段的 `@Getter`，所有非 final 字段的 `@Setter` 和 `@RequiredArgsConstructor` 的快捷方式！

> [@Value](https://github.com/codercuixin/lombok-translate/wiki/@Value)

让不可变类变得非常容易。

> [@Builder](https://github.com/codercuixin/lombok-translate/wiki/@Builder)

... and Bob's your uncle: No-hassle fancy-pants APIs for object creation!

> [@SneakyThrows](https://github.com/codercuixin/lombok-translate/wiki/@SneakyThrows)

 大胆抛出以前没有人抛出的已检查异常！:eyes:

> [@Synchronized](https://github.com/codercuixin/lombok-translate/wiki/@Synchronized)

`synchronized` 做了正确的事：不要暴露你的锁。

> [@Getter(lazy=true)](https://github.com/codercuixin/lombok-translate/wiki/@Getter(lazy=true))

 惰性加载是一种美德!

> [@Log](https://github.com/codercuixin/lombok-translate/wiki/@Log-(and-friends))

 Captain's Log, stardate 24435.7: "What was that line again?" 

> [experimental](https://www.projectlombok.org/features/experimental/all)

  Head to the lab: The new stuff we're working on.


