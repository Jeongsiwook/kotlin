## 리스너
- 새롭게 인터페이스를 구현

```
val listener = object : View.OnClickListener {
  override fun onClick(v: View?) { // ctrl + i 키를 눌러서 구현
    Log.d("리스너", "클릭되었습니다.")
}

binding.button.setOnClickListener(listener) 
```

- 함수가 하나만 있을 경우 중괄호를 사용해 간단하게 할 수 있음

```
binding.button.setOnClickListener {
  Log.d("리스너", "클릭되었습니다.")  
}
```
