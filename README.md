# Spring Rest Hibernate Lab Template

To call an example controller use:
```bash
curl -X POST \
  http://localhost:8080/api/software-modules/modules \
  -H 'Content-Type: application/json' \
  -d '{ \
    "description": "Module 1", \
    "author": "Yevhenii Tymofeiev", \
    "language": "Python", \
    "lastEditDate": "2023-05-03", \
    "size": 12312313, \
    "linesOfCode": 123123, \
    "isCrossPlatform": false, \
    "product": { \
      "id": 100 \
    } \
  }'
```