# Specify the base image
FROM node:16

# Set the working directory inside the container to /WebApp
WORKDIR /WebApp

# Copy package.json and package-lock.json (if available) into the container
COPY package*.json .

# Install project dependencies
RUN npm install

# Copy project files and folders into the container's working directory (/WebApp)
COPY . .

# Expose port 8081 to allow external access to the application
EXPOSE 8081

# Define the command to be executed when the container starts
CMD ["npm", "run", "serve"]
