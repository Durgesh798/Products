
# Serverless Spring Boot 2 example
The goal of this sample is to demonstrate the use of the [aws-serverless-java-container](https://github.com/awslabs/aws-serverless-java-container/wiki) with [Spring MVC](https://spring.io/guides/gs/rest-service/)

The `StreamLambdaHandler` object is the main entry point for the Lambda.

The application can be deployed in an AWS account using the [Serverless Application Model](https://github.com/awslabs/serverless-application-model). The `template.yml` file in the root folder contains the application definition.

## Pre-requisites
* [AWS CLI](https://aws.amazon.com/cli/)
* [SAM CLI](https://github.com/awslabs/aws-sam-cli)
* [Maven](https://maven.apache.org/)

## Deployment
In a shell, navigate to the root folder of the repository and use the SAM CLI to build a deployable package
```shell
$ sam build
```

This command compiles the application and prepares a deployment package in the `.aws-sam` sub-directory.

To deploy the application in your AWS account, you can use the SAM CLI's guided deployment process and follow the instructions on the screen

```shell
$ sam deploy --guided
```

Once the deployment is completed, the SAM CLI will print out the stack's outputs, including the new application URL. 

```text
...
CloudFormation outputs from deployed stack
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Outputs                                                                                                                                                                                                                                                                                                                                      
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Key                 SpringBootPetStoreApi                                                                                                                                                                                                                                                                                                    
Description         URL for application                                                                                                                                                                                                                                                                                                      
Value               https://xxxxxxxxxx.execute-api.us-west-1.amazonaws.com/                                                                                                                                                                                                                                                             
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
```
You can use `curl` or a web browser to make a call to the URL. Remember to append the path name: `/hello`
```shell
$ curl https://xxxxxxxxxx.execute-api.us-west-1.amazonaws.com/hello
```

---

# Cold starts
- [AWS Blog on optimizing cold starts (language-agnostic)](https://aws.amazon.com/blogs/compute/operating-lambda-performance-optimization-part-1/)
- [Spring-specific optimization for cold start times](https://github.com/awslabs/aws-serverless-java-container/wiki/Quick-start---Spring-Boot2#optimizing-cold-start-times)


# See also
[Wiki - aws-serverless-java-container](https://github.com/awslabs/aws-serverless-java-container/wiki)

---

This project was initially cloned from  
[awslabs/aws-serverless-java-container "Serverless Spring Boot 2 example"](https://github.com/awslabs/aws-serverless-java-container/blob/6d88f503c02988cc947743bad78d965d8aa0b5a2/samples/springboot2/pet-store/README.md)




