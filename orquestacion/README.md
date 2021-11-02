# OS2

1. Introduccion a Docker
[https://www.docker.com/resources/what-container](https://www.docker.com/resources/what-container)
    - Que es un contenedor?
    - Contenedores vs maquinas virtuales
    [https://docs.docker.com/get-started/overview/](https://docs.docker.com/get-started/overview/)
    - Para que sirve?
    - Arquitectura
    - Imagenes y Contenedores
2. Instalacion docker
[https://docs.docker.com/engine/](https://docs.docker.com/engine/)
3. Ver docker hub
4. Play around

```bash
docker image ls
docker run ubuntu
docker start ID
```

```bash
docker run -it ubuntu /bin/bash
apt-get update
apt-get install nodejs
apt-get install npm
apt-get install nano
hello world express
```

Diferencia entre imagenes y running containers

```bash
docker image
docker run -it ubuntu
```

Nuevo contenedor no tiene mis cambios, but I need to attach a port... So create a new image

```bash
docker commit ID mynodejs
docker run -p 3000:3000 mynodejs
```

docker ps -a
docker start ID
docker attach ID
docker exec ID /bin/bash

install nodejs and npm
npm init
hello world express

docker commit
docker run with port

1. do it with nodejs image
    - write dockerfile
    - docker build -t  .
    - [https://docs.docker.com/get-started/02_our_app/](https://docs.docker.com/get-started/02_our_app/)
2. angular image
    - docker build -t .
3. Instalacion docker-compose
[https://docs.docker.com/compose/](https://docs.docker.com/compose/)

# Prometheus y Grafana

[https://youtu.be/4WWW2ZLEg74](https://youtu.be/4WWW2ZLEg74)

# Kubernetes

- Configurar cluster en GCP
- Instalar kubectl; [https://kubernetes.io/docs/tasks/tools/](https://kubernetes.io/docs/tasks/tools/)
- Conectar kubectl al cluster; ~/.kube/config

```bash
gcloud container clusters get-credentials hello-cluster
```

- Crear y tag imagen

```bash
docker build -t [us.gcr.io/playground-310623/angular-hello-world](http://us.gcr.io/playground-310623/angular-hello-world) .
```

- Push imagen

```bash
docker push [us.gcr.io/playground-310623/angular-hello-world](http://us.gcr.io/playground-310623/angular-hello-world)
```

- Si el paso anterior falla, autenticarse en gcloud

```bash
gcloud auth login
gcloud auth configure-docker
```

- Deployment con k8s

```bash
kubectl apply -f deployment.yaml
```

- See information

```bash
kubectl get pods
kubectl describe pod ID
kubectl get rs
kubectl delete rs ID
```

- Creando load balancer para ponerlo publico

kubectl expose deployment testdeploy --type=LoadBalancer --name=load-balancer-service

# Updating image

- Crear imagen, push changes

```bash
docker build -t [us.gcr.io/playground-310623/angular-hello-world:v1](http://us.gcr.io/playground-310623/angular-hello-world:v1) .
docker push [us.gcr.io/playground-310623/angular-hello-world:v1](http://us.gcr.io/playground-310623/angular-hello-world:v1)
```

- Apply changes

```bash
kubectl apply -f deployment.yaml
```

- Watch replica set

```bash
kubectl get rs --watch
kubectl get rs
kubectl describe pods
```

- Delete previous rs

```bash
kubectl delete rs testdeploy-68b7d574d8
```

## How to communicate back and front?

- External IP if it's two different clusters
- Cluster IP if both deployments are in the same cluster