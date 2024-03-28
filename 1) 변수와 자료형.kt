  // 변수를 두가지 방식으로 선언한다
  // var = 일반적으로 통용되는 변수, 언제든지 읽기 쓰기가 가능하다
  // val = 선언시에만 초기화 가능, 중간에 값을 변환할수 없음.
  // 변수는 선언 위치에 따라 이름이 바뀐다.
  // Property : 클래스에 선언된 변수
  // Local Variable : 이외의 Scope 내에 선언된 변수
  // 코틀린은 Null을 사용하지 않는다.
  // 자료형 뒤에 '?'을 붙이면 null을 허용하는 nullable 변수로 선언해 줄 수 있습니다.
  // nullable 변수는 null인 상태로 연산할 시 null poninter exception 발생할수 있으므로 조심해야한다.

fun main(){
    var a: Int
    println(a)
}



  // 정수형 자료형 : Byte / Short / Int / Long
  // 실수형 자료형 : Float / Double
  // 문자형 자료형 : Char
  // 논리형 자료 : Boolean
  // 정수를 표기할때에 64비트인 Long 타입의 10진수는 숫자 뒤에 'L'을 붙 더 큰 메모리를 사용하는 정수임을 표시해야 한다.
  // 16진수인 경우에 앞에 '0x'를 붙이면된다.
  // 2진수인 경우에는 앞에 '0b'를 붙이면된다.
  // 실수를 표기할때에 float 타입의 실수는 뒤에 소문자 또는 대문자 f를 붙여줘야한다,
  // Char형은 문자하나하나당 2byte를 사용한다.
  // Boolean 값은 직접 true 혹은 false로 표기하면 된다.
  // 문자열은 따옴표 "" 내에 문자열을 써주면된다. │ 여러줄의 문자열을 표기할때에는 따옴표3개 """ㅁㄴㅇㄹ"""

  // 특수 문자
  // \t : 탭 │ \b : 백스페이스 │ \r : 첫 열로 커서를 옮김 │ \n 줄바꿈 │ \ : 작은 따옴표 │ \\ : 역 슬래시 │ \$ : $ │ \u : 유니코드 문자
