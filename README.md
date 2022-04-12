# Spring Boot with Docker

This is a follow along of the spring.io guide:

https://spring.io/guides/gs/spring-boot-docker/

## FYI

### Passing an environment variable to the Docker Container

Use the -e flag when running the docker container

    docker run -e "ENV_VARIABLE=foo" -p 8080:8080 -t lxkrmr/spring-boot-docker

## Learnings

### Apple Silicon

To get this running on my Macbook Air M1 I needed to add this attribute to the Dockerfile:
    
    --platform=linux/arm64/v8

Source:
https://stackoverflow.com/questions/68975743/docker-image-runs-on-intel-mac-but-not-m1-mac