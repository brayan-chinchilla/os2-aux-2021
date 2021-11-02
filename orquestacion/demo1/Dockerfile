FROM node:lts-alpine

WORKDIR /usr/scr/app 

COPY package.json package-lock.json ./
RUN npm install

COPY . .
RUN npm install

EXPOSE 3000

CMD ["npm", "start"]