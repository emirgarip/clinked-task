This application is a task for using some CRUD operations with Articles.

There are two ways for runing the application:
1. Run the spring boot application directly with Application class
2. Use docker with following instruction

   a) `docker build --tag=clinked:latest .`

   b) `docker run -it -p 8080:8080 clinked:latest`
3. With using Postman, you can use this URLs;
   [localhost:8080/articles]()     [localhost:8080/statistics]()

4. After run the application you can see requests and responses in SwaggerUI
   [http://localhost:8080/swagger-ui/index.html]() 

5. Credentials;
    For user: user/userPass
    For admin: admin/adminPass