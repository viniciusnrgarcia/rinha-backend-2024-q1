#!/bin/bash

echo docker compose down
docker compose down
docker compose rm -f

echo Clean Environment
containers=$(docker ps -a -q)

if [ -n "$containers" ]; then
    docker rm -f $containers
fi

docker volume prune --all --force
docker system prune --all --force

echo Build application
docker buildx build --platform linux/amd64 -t vnrg/rinha-backend-2024-q1 .

# docker push vnrg/rinha-backend-2024-q1

docker compose up --force-recreate -d

docker compose logs -f