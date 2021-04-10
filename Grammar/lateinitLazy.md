## 지연 초기화
### lateinit

```
lateinit var 변수명:타입
```

```
lateinit var person:Person // 기본형: Int, Long, Float, Double 불가

class Person {
  ...
}
```

### lazy
```
val 변수명 by lazy { 변수에 들어갈 클래스 생성자 }
```

```
val age by lazy { Person() }

class Person {
  ...
}
```
