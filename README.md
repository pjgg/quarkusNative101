# Compile and create a docker native image
```shell script
./mvnw clean package -Pnative
```

then you can run your image as usual

```shell script
docker run --rm -p 8080:8080 -p 5005:5005 -e JAVA_DEBUG=true pagonzal/my-first-native-app:1.0.0-SNAPSHOT
```

And Make some random queries:

```shell script
curl -v http://localhost:8080/hello
```

Also I encourage you to have a look the footprint size of your microservice:

```shell script
docker stats
```
```shell script
CONTAINER ID   NAME                CPU %     MEM USAGE / LIMIT    MEM %     NET I/O           BLOCK I/O   PIDS
b469ba59c69e   confident_hawking   0.01%     7.18MiB / 31.14GiB   0.02%     8.09kB / 1.18kB   0B / 0B     21
```