FROM ursu96/jdk-starter
COPY build/libs/csie.jar /
ENTRYPOINT ["java", "-jar", "/csie.jar"]

#docker build -t ursu96/csie-test .
#docker push ursu96/csie-test