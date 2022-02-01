FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=Semenov_Rustam_Telegram_bot
ENV BOT_TOKEN=5204190234:AAGJ4z7SxdM1L8D747zU8HVAl9xe9E-tJNM
ENV BOT_DB_USERNAME=bestuser
ENV BOT_DB_PASSWORD=bestuser
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["-Dspring.datasource.password=${BOT_DB_PASSWORD}", "-Dbot.username=${BOT_NAME}", "java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/app.jar"]