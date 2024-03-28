  // 3) 타입추론과 함수
  // 변수나 함수를 선언할때 자료형을 코드에 명시하지 않더라도 코틀린이 자동으로 자료형을 명시해주는 코드

  // 함수

  fun main(){
    println(add(5,6,7))
  }

  fun add(a: Int, b:Int, c:Int): Int // 반환값
  {
    return a + b + c
  }

  // 단일형 함수가 존재한다 .
  fun add(a:Int, b:Int, c:Int) = a + b + c