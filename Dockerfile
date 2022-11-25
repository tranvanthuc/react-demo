FROM node:19.1.0-alpine3.15

RUN addgroup app && adduser -S -G app app

USER app

WORKDIR /home/app

COPY --chown=app:app package*.json .

RUN npm i

COPY --chown=app:app . .

ENV API_URL http://google.com

EXPOSE 3000

CMD [ "npm", "start" ]