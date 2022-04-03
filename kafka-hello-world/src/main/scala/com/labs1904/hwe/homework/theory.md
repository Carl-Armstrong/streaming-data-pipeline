# Overview

Kafka has many moving pieces, but also has a ton of helpful resources to learn available online. In this homework, your
challenge is to write answers that make sense to you, and most importantly, **in your own words!**
Two of the best skills you can get from this class are to find answers to your questions using any means possible, and to
reword confusing descriptions in a way that makes sense to you. 

### Tips
* You don't need to write novels, just write enough that you feel like you've fully answered the question
* Use the helpful resources that we post next to the questions as a starting point, but carve your own path by searching on Google, YouTube, books in a library, etc to get answers!
* We're here if you need us. Reach out anytime if you want to ask deeper questions about a topic 
* This file is a markdown file. We don't expect you to do any fancy markdown, but you're welcome to format however you like

### Your Challenge
1. Create a new branch for your answers 
2. Complete all of the questions below by writing your answers under each question
3. Commit your changes and push to your forked repository

## Questions
#### What problem does Kafka help solve? Use a specific use case in your answer 
* Helpful resource: [Confluent Motivations and Use Cases](https://youtu.be/BsojaA1XnpM)
* Kafka is event driven and can consolidate data that would traditionally
* need multiple databases.
* Kafka can take convert the data of IOT into useful info. The example
* given was of a hospital using monitors on babies to give real time info
* to doctors.

#### What is Kafka?
* Helpful resource: [Kafka in 6 minutes](https://youtu.be/Ch5VhJzaoaI) 
* Kafka is a response to the need of scaling systems -
* particularly messaging systems. In traditional systems, the data would
* get bogged down as the system scales too big. Kafka is a system of 
* distributing data without it getting out of order - a distribution
* strategy.

#### Describe each of the following with an example of how they all fit together: 
 * Topic
 * *A stream of data similar to a table in a database - identified by
 * its name
 * Producer
 * *Client application that writes events to Kafka
 * Consumer 
 * *Client application that reads events from Kafka
 * Broker
 * *A server which may hold several partitions
 * Partition
 * *An individual unit on a server holding part of a topic? It acts 
 * independently from other partitions. Order is maintained within a 
 * partition but not guaranteed when combined with other partitions

#### Describe Kafka Producers and Consumers

#### How are consumers and consumer groups different in Kafka? 
* Helpful resource: [Consumers](https://youtu.be/lAdG16KaHLs)
* Helpful resource: [Confluent Consumer Overview](https://youtu.be/Z9g4jMQwog0)
* I guess a consumer group is many instances of the same application
* accessing the data? This is still fuzzy to me.

#### How are Kafka offsets different than partitions? 
*An offset is an individually stamped event that is held by a partition

#### How is data assigned to a specific partition in Kafka?
*Kafka tries to share the load evenly (as I understand it)

#### Describe immutability - Is data on a Kafka topic immutable?
*An event cannot be edited once it is created (Is this why you can't edit
a tweet?)

#### How is data replicated across brokers in kafka? If you have a replication factor of 3 and 3 brokers, explain how data is spread across brokers
* Helpful resource [Brokers and Replication factors](https://youtu.be/ZOU7PJWZU9w)
* Data is copied to other partitions, but there is only ever 1 leader
* partition at a time. Data is read/written from leader only. If it's
* replication factor 2, there are 2 copies of data - leader and copy.
* If it's factor 3, leader and 2 copies.

#### What was the most fascinating aspect of Kafka to you while learning? 
* I'm interested in the real-time application rather than the static
* I'm used to working with