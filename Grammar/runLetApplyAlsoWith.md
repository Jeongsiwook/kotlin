## 스코프 함수
### run
- 반복되는 코드를 줄여준다
- apply와 사용법 같음
- action에 대해서 다른 결과 값을 받고 싶을 때

### let
- 알리아스 사용
- also와 사용법 같음
- action에 대해서 다른 결과 값을 받고 싶을 때

```
fun studyRun() {
  val phones = mutableListOf("010-1234-5678", "010-3456-8978", "010-4587-1345")
  val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
  val names = mutableListOf("Scott", "Kally", "Michael")
  
  val seoulPeople = SeoulPeople()
  
  /*
  seoulPeople.persons.add(Person("Scott", "010-1234-5678", 22)
  seoulPeople.persons.add(Person("Scott", "010-1234-5678", 22)
  seoulPeople.persons.add(Person("Scott", "010-1234-5678", 22)
  */
  
  seoulPeople.persons.run {
    add(Person("Scott", "010-1234-5678", 22)
    add(Person("Scott", "010-1234-5678", 22)
    add(Person("Scott", "010-1234-5678", 22)
    size // 3이 반환됨, apply는 상관없이 add한 결과만 나타냄
  }
  
  seoulPeople.persons.let { persons ->
    persons.add(Person("Scott", "010-1234-5678", 22)
    persons.add(Person("Scott", "010-1234-5678", 22)
    persons.add(Person("Scott", "010-1234-5678", 22)
    size // 3이 반환됨, apply는 상관없이 add한 결과만 나타냄
  }
}

class SeoulPeople {
  var persons = mutableListOf<Person>()
  init {
    persons.add(Person("Scott", "010-1234-5678", 19)
    persons.add(Person("Kelly", "010-1234-5678", 20)
    persons.add(Person("Michael", "010-1234-5678", 21)
  }
}

data class Person (
  var name:String = "",
  var phone:String = "",
  var age:Int
)
```

### with
- 위젯에 접근할 때 사용

```
/*
binding.button.setOnClickListener { }
binding.imageView.setImageLevel(50)
*/

with(binding) {
  button.setOnClickListener { }
  imageView.setImageLevel(50)
}
```

