FROM openjdk:11
VOLUME /tmp
EXPOSE 8090
ADD ./target/gatewey-0.0.1-SNAPSHOT.jar gatewey.jar
ENTRYPOINT ["java","-jar","/gatewey.jar"]