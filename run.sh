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

docker compose up --force-recreate -d

docker compose logs -f