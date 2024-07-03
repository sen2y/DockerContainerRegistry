# Step 1: 애플리케이션 빌드
FROM gradle:jdk17 AS builder
WORKDIR /app
COPY build.gradle settings.gradle ./
COPY src ./src
RUN gradle build --no-daemon

# Step 2: 최종 이미지 생성 및 실행
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/build/libs/app.jar ./
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]