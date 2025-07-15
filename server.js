//express 라이브러리 참조
const express = require('express');
// 새로운 객체를 만듦
const app = express();
// 내 컴퓨터에 서버를 열 수 있음
// 8080 : 서버띄울 포트번호
// function : 띄운 후 실행할 코드
app.listen(8080, function(){
    console.log("listening on 8080")
});  
// 위에 세줄은 서버를 띄우기 위한 기본 셋팅(express 라이브러리)

//누군가가 /pet 으로 방문을 하면
//pet관련된 안내문을 띄워주자

app.get('/pet', function(요청, 응답){
    응답.send('펫용품 쇼핑할 수 있는 페이지입니다.')
    //여기에 html 파일을 보내면 페이지를 넘겨주는것
});

//누군가가 /beauty RUL로 접속하면(GET요청하면)
//안내문을 띄워주자 "뷰티용품 쇼핑 페이지임"
app.get('/beauty', function(req, res){
    res.send('뷰티용품 쇼핑 페이지임!')
})