# test-spring-boot-logger

[![TravisCI Status][travis-image]][travis-url]
[![Codecov Status][codecov-image]][codecov-url]

Proyecto base para micro servicio de logger

## Build project with maven

```
$ mvn clean verify spring-boot:run
```

## Build project with gradle

```
$ gradle clean build bootRun
```

```
http://localhost:9993/service/log/message
```

[travis-image]: https://travis-ci.org/yadickson/test-spring-boot-logger.svg?branch=master
[travis-url]: https://travis-ci.org/yadickson/test-spring-boot-logger

[codecov-image]: https://codecov.io/gh/yadickson/test-spring-boot-logger/branch/master/graph/badge.svg?branch=master
[codecov-url]: https://codecov.io/gh/yadickson/test-spring-boot-logger

