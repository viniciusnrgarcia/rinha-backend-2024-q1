docker compose down \
&& docker compose rm -f \
&& docker buildx build --platform linux/amd64 -t rinha-backend-2024-q1 . \
&& docker compose up --force-recreate -d \
&& docker compose logs -f