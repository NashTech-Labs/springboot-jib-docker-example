# Requirements
## Set up container using Jib 
To send container registry images on gcr, make the following changes in `build.gradle`
```shell
jib.to.image = gcr.io/gcp_project_id/[your-repo-name]
```
To send container images on dockerhub
```shell
jib.to.image = yourdockerhubid/[jib-springbott-demo]
```

## How to run container build Task
```shell
./gradlew jib
```

## To run and generate docker images using docker
```shell
docker build -t app .
```