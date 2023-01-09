# Spring Cloud Configuration Server

- Spring Cloud 환경설정 서버


## 우선순위

- 하단 순서로 우선순위가 높고, 중복 설정 시 하단 순서로 값이 덮어씌워진다.
  - 프로젝트의 application.yaml
  - 설정 저장소의 application.yaml
  - 프로젝트의 application-{profile}.yaml
  - 설정 저장소의 {application name}/{application name}-{profile}

## EndPoints

- /{application}/{profile}[/{label}]
- /{application}-{profile}.yml
- /{label}/{application}-{profile}.yml
- /{application}-{profile}.properties
- /{label}/{application}-{profile}.properties
