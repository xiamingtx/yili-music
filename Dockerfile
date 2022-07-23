FROM maven:3.6.0-jdk-8-slim as build

# 指定构建过程中的工作目录
WORKDIR /app

# 将src目录下所有文件，拷贝到工作目录中src目录下
COPY src /app/src

# 将pom.xml文件，拷贝到工作目录下
COPY pom.xml /app

# 执行代码编译命令
RUN mvn -f /app/pom.xml clean package -Dmaven.test.skip=true -Dspring.profiles.active=test

# 选择运行时基础镜像
FROM alpine:3.13

ENV MYSQL_HOST 10.0.224.10
ENV MYSQL_USER_NAME music
ENV MYSQL_PASSWORD Music2022
ENV DATABASE_NAME yili-music
ENV APPLICATION_PORT 80
ENV MP_APP_ID wxa576489fc23023c3
ENV MP_APP_SECRET 455d9a93074137a5523d9e5236b4580a
ENV COS_BUCKET yili-music-20220720-1312725977
ENV COS_SECRET_ID AKIDMYT8YhaCXbPwCCuLVO1MQDjzxe5F8j48
ENV COS_SECRET_KEY oLbbKmwhDSR9cojNkqfDUUEhuqYz94h3
ENV COS_REGION ap-beijing

# 安装依赖包，如需其他依赖包，请到alpine依赖包管理(https://pkgs.alpinelinux.org/packages?name=php8*imagick*&branch=v3.13)查找。
RUN apk add --update --no-cache openjdk8-jre-base \
    && rm -f /var/cache/apk/*

# 指定运行时的工作目录
WORKDIR /app

# 将构建产物jar包拷贝到运行时目录中
COPY --from=build /app/target/yili-music-0.0.1.jar .

# 暴露端口
EXPOSE 80

# 执行启动命令
CMD ["java", "-jar", "/app/yili-music-0.0.1.jar", "--spring.profiles.active=test"]