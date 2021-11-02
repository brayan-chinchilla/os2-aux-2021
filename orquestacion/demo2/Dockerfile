FROM node:lts-alpine AS builder

WORKDIR /usr/src/app

COPY my-app/package.json my-app/package-lock.json ./
RUN npm install

COPY my-app .
RUN npm run build



FROM nginx:alpine
COPY --from=builder /usr/src/app/dist/my-app/ /usr/share/nginx/html
COPY ./nginx-custom.conf /etc/nginx/conf.d/default.conf

EXPOSE 80