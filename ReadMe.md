1. 在mybatis-config.xml中的配置项必须按照
   ```
   <properties></properties>
   <settings></settings>
   <typeAliases></typeAliases>
   <typeHandlers></typeHandlers>
   <objectFactory></objectFactory>
   <objectWrapperFactory></objectWrapperFactory>
   <reflectorFactory></reflectorFactory>
   <plugins></plugins>
   <environments></environments>
   <databaseIdProvider></databaseIdProvider>
   <mappers></mappers>
   ```
   这样的顺序来配置，可以有的配置项不进行配置，但是顺序不能颠倒，不然会报错。

2. 当使用 `mysql-connection-java` 的版本在 `6.0` 以上就无需手动加载驱动，可以直接使用。

3. 将继承了 `AutoCloseable` 的类放在try中，在退出try的作用域的时候可以被自动关闭。

   例如在 `JDBC` 模块下的 `demo_01` 类中的 `2` 和 `3` 两种方式，他们中的 `connection` 和 `statement` 就会在退出try的时候自动关闭。

4. 必须显示的利用<properties resource="db.yml"/>这样的在`mybatis-config.xml`中来导入资源文件。可以参考 `mybatis` 模块下的 `mybatis-config.xml` 文件中的配置。

5. ```xml
	  <typeAliases>
	        <typeAlias type="cn.edu.tyut.entity.User" alias="User"/>
	  </typeAliases>
	```

   在上述配置中中设置完别称后，所有使用到这个类的地方都可以改为该别称。但是它和命名空间无关，它是为了降低冗余的全限定类名书写，所以本质上还是对类名起作用的。

6. ```xml-dtd
	  <!-- UserMapper.xml 和 mybatis-config.xml 的主要不同是他们的DTD约束不同和根标签不同 -->
	
	  <!-- UserMapper.xml模板 -->
	  <?xml version="1.0" encoding="UTF-8" ?>
	  <!DOCTYPE mapper
	        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
	        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
	  <!--命名空间就是一个限定名，用来指定你要求的是哪个文件内的id为什么什么的sql语句-->
	  <mapper namespace="User">
	      <select id="getUserByIdOne" resultType="User" parameterType="int">
	        select *
	        from users
	        WHERE id = #{id}
	      </select>
	      <select id="selectUsers" resultType="User">
	        SELECT *
	        FROM users
	      </select>
	  </mapper>
	```

   ```xml-dtd
   <!-- mybatis-config.xml 模板 -->
   <?xml version="1.0" encoding="UTF-8" ?>
   <!DOCTYPE configuration
           PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
           "https://mybatis.org/dtd/mybatis-3-config.dtd">
   <configuration>
       <properties resource="db.yml"/>
       <typeAliases>
           <typeAlias type="cn.edu.tyut.entity.User" alias="User"/>
       </typeAliases>
       <environments default="development">
           <environment id="development">
               <transactionManager type="JDBC"/>
               <dataSource type="POOLED">
                   <property name="driver" value="${driver}"/>
                   <property name="url" value="${url}"/>
                   <property name="username" value="${username}"/>
                   <property name="password" value="${password}"/>
               </dataSource>
           </environment>
       </environments>
       <mappers>
           <mapper resource="mapper/UserMapper.xml"/>
       </mappers>
   </configuration>
   ```

7. 在mybatis中的update方法中无法使用" "来设置字符串的属性值，而是要使用''来设置字符串类型的属性值。