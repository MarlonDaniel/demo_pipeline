FROM nginx
# Copio lo que necesito para hacer el npm install
WORKDIR /demoAngular
RUN ng build --prod

COPY nginx.conf /etc/nginx/nginx.conf	
COPY ./demoAngular/dist/demoAngular /usr/share/nginx/html