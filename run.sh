docker compose down \
&& docker compose rm -f \
&& docker compose up --force-recreate -d \
&& docker compose logs -f