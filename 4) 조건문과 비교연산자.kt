// 4) 조건문과 비교연산자
// 조건문의 기본 if : 만약 ~ 한다면

fun main(){
    var a = 7
    if (a > 10){
        println(a)
        } else{
          println("a < 10")
        }
  
    if (a>10) print(a)


    print(dowhen(3))
    print(dowhen(three))
}
  
  
// is 연산자
// is : 값에 특정 유형(자료형)이 있는지 확인, 같은 목적을 위한 when 문에서 사용된다
// as : 타입 캐스트에 사용되거나 import에 대한 별칭을 지정할 때 사용된다  
  
// when은 하나의 변수를 여러개의 값과 비교할수 있음
  
fun dowhen(a:any){
    3 -> println(a)
    "three" -> println(a)
    a is Int -> println(a)
}

// < │ <= │ > │ >= │ !=



fun main1(){
    dowhen(3)
	dowhen("keria")
    
    
}
fun dowhen(a:Any){
    when(a){
        3 -> firstloop@for(i in 1..10) println("a = $a, i = $i")
        "keria" -> secondloop@for (i in 1..10) {
            if ( i == 4 ) { 
                println(i)
                break@secondloop
            }
            println(i)
        }
    }
}
