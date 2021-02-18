# Stage 1
# FROM node:10-alpine as build-step
FROM node:15-alpine as build-step
COPY ["./demoAngular/package.json", "./demoAngular/package-lock.json", "/usr/src/"]	
WORKDIR /usr/src/
RUN npm install
COPY --chown=node:node ./demoAngular /usr/src/
RUN npm run build --prod
RUN ls /dist/

# Stage 2
# FROM nginx:1.17.1-alpine
FROM nginx:1.19.7-alpine
COPY --from=build-step /usr/src/dist /usr/share/nginx/html