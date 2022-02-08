# Handschriftenportal - java messaging library-

**Description**:  This project offers a Java library which must be used for asynchronous communication within the manuscript portal project. This software module is part of the administration unit of the manuscripts portal "[Handschriftenportal](https://handschriftenportal.de/)". The message model is based on the W3C [Standard Activity Streams 2.0](https://www.w3.org/TR/activitystreams-core/).

- **Technology stack**:  Java 11. 
- **Status**:  Alpha (in development)
- **Links:** [Production instance](https://alpha.erfassung.handschriftenportal.de/dashboard.xhtml)

## Getting started

1. Get the source code

   ```
   git clone https://github.com/handschriftenportal-dev/hsp-messaging
   ```

2. Build the project

   ```javascript
   mvn clean install
   ```


## Configuration

There is no extra configuration needed. 

## Usage

If you would like to use this library you should start a new Java project and add this project to the dependency list. After a new build you can use the messaging library as follow: 

```java

    ActivityStreamObject activityStreamObject = ActivityStreamObject.builder()
            .withCompressed(compressed)
            .withContent("Test")
            .withType(ActivityStreamsDokumentTyp.KOD)
            .withUrl("http://localhost")
            .withId("1")
            .withGroupId("beschreibung1")
            .withMediaType("text/xml")
            .build();
    
        ActivityStream message = ActivityStream
            .builder()
            .withId(UUID.randomUUID().toString())
            .withType(ActivityStreamAction.ADD)
            .withPublished(LocalDateTime.now())
            .withActorName("User 1")
            .addObject(activityStreamObject)
            .build();

```



As you can see you must build an ActivityStreamObject and afterwards an ActivityStream Message Object. These Object you can use sending an Apache Kafka Message within the administration unit of the manuscripts portal.  The primary message payload is TEI XML. Therefore you can marshal and unmarshal XML into Java Objects. 



```java
Unmarshal XML to Java TEI Objects 

Path teiFilePath = Paths.get("src", "test", "resources", "tei", "tei-msDesc_Westphal.xml");
    List<TEI> tei = TEIObjectFactory.unmarshal(newInputStream(teiFilePath));
        
        
Marshal TEI Java Object to XML


Path teiFilePath = Paths.get("src", "test", "resources", "tei", "tei-msDesc_Westphal.xml");
TEI tei = (TEI) TEIObjectFactory.unmarshal(newInputStream(teiFilePath));
String teiAsXML = TEIObjectFactory.marshal(tei);

```

## How to test the software

1. To run all unit tests please use the following command

```
mvn clean test
```

## Known issues

## Getting help

To get help please use our contact possibilities on [twitter](https://twitter.com/hsprtl) and [handschriftenportal.de](https://handschriftenportal.de/)

## Getting involved

To get involed please contact our develoment team [handschriftenportal@sbb.spk-berlin.de](handschriftenportal-dev@sbb.spk-berlin.de)

## Open source licensing info

The project is published under the [MIT License](https://opensource.org/licenses/MIT).

## Credits and references

1. [Github Project Repository](https://github.com/handschriftenportal-dev)
2. [Project Page](https://handschriftenportal.de/)
3. [Internal Documentation](doc/ARC42.md)

## RELEASE Notes
