#POST CROPPER
The purpose of this application is to crop a string to up to  desired length (maximumLength), respecting word boundaries, and removing any trailing spaces.

## How to run locally
Requires gradle: ./gradlew run

The application will be listening at the following address: http://localhost:8888

To change the port edit in application.yml under micronaut->server->port.

## Issuing a request.

Local Server:

curl -X POST http://localhost:8888/api/crop -d '{"message":"Codility we test coders","maximumLength":14}' -H "Content-Type: application/json" 


K8s cluster on RedHAT:


curl -X POST http://postcropper-evals28-shared-6494.apps.hackathon.rhmi.io/api/crop -d '{"message":"Codility we test coders","maximumLength":14}' -H "Content-Type: application/json"


