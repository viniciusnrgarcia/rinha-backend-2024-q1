FROM ghcr.io/graalvm/native-image-community:21 as build
WORKDIR /rinha-backend-2024-q1
COPY . /rinha-backend-2024-q1
RUN ./mvnw -Pnative native:compile

FROM alpine
COPY --from=build /rinha-backend-2024-q1/target/rinha-backend-2024-q1 /rinha-backend-2024-q1
# ENV DATASOURCE_URL=jdbc:postgresql://db:5432/rinhadb?useSSL=false
RUN apk add libc6-compat curl
EXPOSE 8080
CMD ["./rinha-backend-2024-q1"]