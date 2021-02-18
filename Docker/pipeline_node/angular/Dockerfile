# Stage 1
# FROM node:10-alpine as build-step
FROM node as build-step
RUN mkdir -p /app
WORKDIR /app
COPY ./demoAngular/package.json /app
RUN npm install
COPY ./demoAngular /app
RUN npm run build --prod

# Stage 2
# FROM nginx:1.17.1-alpine
FROM nginx
COPY --from=build-step /app/docs /usr/share/nginx/html