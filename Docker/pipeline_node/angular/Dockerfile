FROM node:10
#Copio lo que necesito para hacer el npm install
COPY ["./demoAngular/package.json", "./demoAngular/package-lock.json", "/usr/src/"]		
# me situo en este directorio dentro del docker
WORKDIR /usr/src/

# Installer les dépendances
RUN npm install 
# instalo Angular
RUN npm install -g @angular/cli

#copio el resto del proyecto. Docker no lleva los files que ya estan ahi y no han cambiado	
#COPY ["./app/*", "./src/"]
COPY --chown=node:node ./demoAngular/ /usr/src/
#configuro el ambiente de node --HABILITAR PARA LA VERSION ESTABLE LA SIGUIENTE LINEA
#RUN npx sequelize-cli db:migrate 
#expongo el puerto 3000
EXPOSE 4200				
#comando para levantar el node modo nodemon (cuando el file index.js cambia, se reinicia el servicio para tomar los cambios)
#CMD ["npx", "nodemon", "index.js"]
#CMD ["npx", "nodemon", "app.js"]
#comando para levantar el node standar
#RUN ls
CMD ["ng","serve","--open","--configuration=production"]
#CMD ["node","index.js"]