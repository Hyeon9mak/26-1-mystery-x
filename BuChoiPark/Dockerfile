FROM eclipse-temurin:25-jre-alpine

WORKDIR /app

# SQLite DB 파일을 저장할 볼륨 디렉토리 생성
RUN mkdir -p /app/data && \
    addgroup -g 1000 appuser && \
    adduser -D -u 1000 -G appuser appuser && \
    chown -R appuser:appuser /app

# JAR 파일 복사
COPY --chown=appuser:appuser build/libs/*.jar buchoipark.jar

USER appuser

EXPOSE 8080

HEALTHCHECK --interval=30s --timeout=10s --start-period=40s --retries=3 \
  CMD wget --no-verbose --tries=1 --spider http://localhost:8080/actuator/health || exit 1

ENTRYPOINT ["java", "-jar", "buchoipark.jar"]
