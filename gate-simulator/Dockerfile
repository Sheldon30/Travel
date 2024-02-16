FROM node:8.16.2-alpine
WORKDIR ./opt/app
COPY package.json package-lock.json data.json ./
RUN npm install
COPY . ./
CMD ["npm", "start"]
EXPOSE 9999
