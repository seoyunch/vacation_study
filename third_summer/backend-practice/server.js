// 1. 모듈 불러오기
const express = require('express'); 
// express : 서버를 쉽게 만들게 해주는 프레임워크
let users = require('./data');
// require('./data') : 우리가 만든 data.js가져오기

// 2. 서버 기본설정
const app = express();// 서버 객체 생성
const port = 3000;

app.use(express.json()); // 요청 body를 JSON으로 읽어줌

// 3. 라우팅(URL + 동작 매핑)
// 라우팅 : 어떤 URL로 요청이 오면 어떤 동작을 할지 정하는것
app.get('/', (req, res) => {
    res.send('Hello Backend');
});

app.get('/users', (req, res)=>{
    res.json(users); // users배열을 JSON형태로 보여줌
});

app.get('/users/:id', (req, res)=>{// :id는 변수. /users/1 -> id=1이됨
    const id = parseInt(req.params.id);// 클라이언트가 보낸 id값 가져오기
    const user = users.find(u => u.id === id);
    if(user){
        res.json(user);
    }else{
        res.status(404).json({message:"User not found"});
    }
});

app.post('/users', (req, res)=>{
    const{name} = req.body;// 클라이언트가 보낸 JSON데이터
    const newUser = {id: users.length + 1, name};
    users.push(newUser);
    res.status(201).json(newUser);// 201응답코드 -> 새 리소스가 생성됨을 의미
});

app.delete('/users/:id', (req, res)=>{
    const id = parseInt(req.params.id);
    users = users.filter(u => u.id !== id);// 해당 id빼고 새 배열 생성
    res.json({message:`User ${id} deleted`});
});

app.put('/users/:id', (req, res)=>{
    const id = parseInt(req.params.id);
    const { name } = req.body;

    const userindex = users.findIndex(u => u.id === id);

    if(userindex !== -1){
        users[userindex].name = name;
        res.json({ message: `User ${id} updated`, user: users[userIndex]});
    }else{
        res.status(404).json({message: "User not found"});
    }
});


// 4. 서버실행
app.listen(port, () => {
    console.log(`server running on http://localhost:${port}`);
});