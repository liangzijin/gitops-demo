FROM  openjdk:8-jre

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

LABEL author=zijin.liang

WORKDIR /zeus

COPY ./target/app.jar app.jar

EXPOSE 9000

ENV JAVA_OPTS="-Xms200M -Xmx200M -XX:+PrintGC"

ENTRYPOINT java ${JAVA_OPTS} -jar app.jar