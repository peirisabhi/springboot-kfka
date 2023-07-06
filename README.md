<div align="center">
  <h1>Spring Boot Kafka Example</h1>
  <p>
    This repository contains an example project showcasing the usage of Spring Boot with Apache Kafka. It demonstrates how to integrate Kafka messaging in a Spring Boot application.
  </p>
</div>

## Prerequisites

Before running this example, ensure that you have the following prerequisites:

- Java Development Kit (JDK) 17 or higher
- Apache Kafka installed and running (e.g., using Docker)
- Spring Boot version 3.1.1 or higher

## Getting Started

To get started with this example, follow these steps:

1. Clone the repository:

   ```shell
   git clone https://github.com/peirisabhi/springboot-kfka.git
   ```

2. Navigate to the project directory:

   ```shell
   cd springboot-kfka
   ```

3. Install and run Kafka using Docker:

   ```shell
   docker-compose up -d
   ```

   This command will start a Kafka broker, ZooKeeper, and create the necessary topics.

4. Build the project using build Maven.

5. Run the application:

   ```shell
   ./mvnw spring-boot:run
   ```

6. The application should now be running locally.

## Configuration

The Kafka configuration for this example can be found in the `application.properties` file. Make sure to update the configuration settings according to your Kafka setup.

```properties
# Kafka configuration
spring.kafka.bootstrap-servers=localhost:9092
spring.kafka.consumer.group-id=myGroup
spring.kafka.consumer.auto-offset-reset= earliest

spring.kafka.topic.name=topic1  
spring.kafka.topic-json.name=topic_json

spring.kafka.consumer.key-deserializer= org.apache.kafka.common.serialization.StringDeserializer  
spring.kafka.consumer.value-deserializer= org.apache.kafka.common.serialization.StringDeserializer  
#spring.kafka.consumer.value-deserializer= org.springframework.kafka.support.serializer.JsonDeserializer  
spring.kafka.consumer.properties.spring.json.trusted.packages=*
```

## Usage

This example project includes a sample Kafka producer and consumer to demonstrate the usage of Kafka messaging with Spring Boot. The producer publishes messages to a Kafka topic, and the consumer listens to that topic to receive and process the messages.

Feel free to explore the code and modify it to suit your needs. The code is extensively documented to help you understand each step and the purpose of different components.

## Contributing

Contributions to this project are welcome. If you find any issues or have ideas for improvements, please open an issue or submit a pull request.


## Contact

For any questions or feedback, please contact:

Abhishek Peiris
- Email: abhishekpeiris9@gmail.com
- GitHub: [@peirisabhi](https://github.com/peirisabhi)
