FROM docker.io/openjdk:8-alpine

MAINTAINER liyang liyang@yihecloud.com

WORKDIR /program

COPY docker/startup.sh /program/startup.sh
RUN chmod +x /program/startup.sh

COPY target/TimeOverlap-1.0-SNAPSHOT.jar /program/app.jar

CMD /program/startup.sh