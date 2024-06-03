curl --location 'http://localhost:8080/api/v1/kafka/publish' \
--header 'Content-Type: application/json' \
--data '{
    "job_id": "20822",
    "job_status": "SUCCESS"
}'