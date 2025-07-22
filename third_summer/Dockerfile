# 기본적으로는 순수한 리눅스 이미지를 가져감. 
# 16은 노드 버전, alpine은 최소한의 리눅스 버전
FROM node:16-alpine 

# 컨테이너 안에서 어떤 경로의 것을 실행할건지 명시해줌
WORKDIR /app

# 프로젝트 파일을 복사해와야함
# 빈번하게 변경되는 파일일수록 제일 마지막에 명시해주는게 좋음
# 명렁어 하나하나가 레이어로 구성되어있기 때문에 자주 변경될떄 밑에만 빌드해주면 되기 때문
COPY package.json package-lock.json ./

# npm install을 실행하여 json에 명시되어있는 모든 라이브러리를 설치함
# 이때 install 대신 ci를 사용하면 명시되어있는대로 됨.
# install은 최신버전을 설치해서 버전이 달라지는 문제를 해결할 수 있음
RUN npm ci

COPY index.js .

# node를 실행하고 index.js를 실행하라고 명시해줌
ENTRYPOINT [ "node", "index.js" ]

