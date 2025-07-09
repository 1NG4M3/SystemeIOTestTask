FROM selenium/standalone-chrome:latest

USER root

RUN apt-get update && \
    apt-get install -y openjdk-17-jdk unzip curl && \
    apt-get clean

RUN curl -o allure.tgz -L https://github.com/allure-framework/allure2/releases/download/2.27.0/allure-2.27.0.tgz && \
    tar -xzf allure.tgz && \
    mv allure-2.27.0 /opt/allure && \
    ln -s /opt/allure/bin/allure /usr/bin/allure

WORKDIR /app
COPY . .

RUN chmod +x ./gradlew
COPY entrypoint.sh /app/entrypoint.sh
RUN chmod +x /app/entrypoint.sh

CMD ["/app/entrypoint.sh"]