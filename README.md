# Media-Production-Scheduler

This application is a REST API built using the Spring-Boot framework, handling HTTP requests and responses.

## Usage

The application runs on the port 8080.

Examples of GET requests

- Returning all the data:

      http://localhost:8080/api/content

- Return data by id:

      http://localhost:8080/api/content/{id}

- Filter data by title containing a keyword:

      http://localhost:8080/api/content/filter/{keyword}

- Filter data by status:

      http://localhost:8080/api/content/filter/status/{status}
  
