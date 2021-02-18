FROM node:10
#Copio lo que necesito para hacer el npm install
COPY ["./demoApi/package.json", "./demoApi/package-lock.json", "/usr/src/"]		
#me situo en este directorio dentro del docker
WORKDIR /usr/src/

#RUN ls 
#configuro el ambiente de node
RUN npm install 
RUN npm install express --save  
RUN npm install sequelize --save  
RUN npm install mysql2 --save  
RUN npm install -g sequelize-cli --save 
#RUN npm install -g nodemon
	
#copio el resto del proyecto. Docker no lleva los files que ya estan ahi y no han cambiado	
#COPY ["./app/*", "./src/"]
# chown asigna les droits l'utilisateur:group
COPY --chown=node:node ./demoApi/ /usr/src/
#configuro el ambiente de node --HABILITAR PARA LA VERSION ESTABLE LA SIGUIENTE LINEA
#RUN npx sequelize-cli db:migrate 
#expongo el puerto 3000
EXPOSE 3000				
#comando para levantar el node modo nodemon (cuando el file index.js cambia, se reinicia el servicio para tomar los cambios)
#CMD ["npx", "nodemon", "index.js"]
#CMD ["npx", "nodemon", "app.js"]
#CMD ["npx", "nodemon", "app.js"]
#comando para levantar el node standar
#RUN ls
CMD ["npm","start"]
#CMD ["node","index.js"]