# DistributedSystems
Distributed Systems Lab

Other folders are exercises

##Frontend
Frontend in WebApp folder

On Mac change WebApp/package.json scripts to:
  "scripts": {
    "serve": "export NODE_OPTIONS=--openssl-legacy-provider && vue-cli-service serve",
    "build": "export NODE_OPTIONS=--openssl-legacy-provider && vue-cli-service build",
    "lint": "export NODE_OPTIONS=--openssl-legacy-provider && vue-cli-service lint"
  }

On Windows change WebApp/package.json scripts to:
  "scripts": {
    "serve": "set NODE_OPTIONS=--openssl-legacy-provider && vue-cli-service serve",
    "build": "set NODE_OPTIONS=--openssl-legacy-provider && vue-cli-service build",
    "lint": "set NODE_OPTIONS=--openssl-legacy-provider && vue-cli-service lint"
  }

Start Frontend in direcotry /WebApp and run npm run serve command

##Backend
Backend in Backend folder

Start Backend with Spring Boot Dashboard "Distributed Systems" or with mvn spring-boot:run command

##Docker
Start the container with docker-compose up