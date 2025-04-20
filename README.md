
# DHL Challenge

For DHL interview 

### Installation
1. Run maven package
   ```sh
   mvn package
   ```
2. Run the docker compose file
   ```sh
   docker compose up
   ```
4. In order to test the API send a POST request as such 
   ```js
   curl --location 'localhost:8080/postcode/calculate
    --header 'Content-Type: application/json'
    --header 'Cookie: JSESSIONID=AB5335C08A406E96C588049A0B228633'
    --data '{
        "fromPostcode": "AB24 2TN",
        "toPostcode": "AB24 1ZS"
    }'
   ```
