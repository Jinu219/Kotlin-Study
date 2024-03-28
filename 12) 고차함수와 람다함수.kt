fun main(){

    b(::a)


    val c: (String) -> Unit = { str }
}

fun a (str = String){
    println("$str 함수 a ")
}

fun b (function: (String) -> Unit){
    function("b가 호출한")
}


/*

람다함수도 여러 구문을 사용이 가능하다 
람다함수에 패러미터가 없으면 실행할 구문만 쓰면 된다.
패러미터가 하나라면 it을 사용한다

람다함수를 사용하는 이유 
1) 코드를 깔끔하게 하기 위해서 
2) 일련의 동작을 변수에 저장하거나 다른함수에 넘겨야하는 경우에 사용하기 위해


스코프 함수 : 함수형 언어의 특징을 좀더 편리하게 사용할수 있도록 기본 제공하는 함수
apply : 인스턴스를 생성한수 변수에 담기전에 초기화 과정을 수행할때 사용
run 
with
also
let

main함수와 별도의 scope에서 인스턴스의 변수와 함수를 조작하므로 코드가 깔끔해진다. 
apply / also : 처리가 끝나면 인스턴스를 반환
run / let : 처리가 끝나면 최종값을 반환

*/

fun main(){
    var a = Book("kotlin",10000).apply{
        name = "[초특가]" + name
        discount()
    }
    a.run{
        println("${name},${price}")
    }

    a.let{
        println("${it.name}, ${it.price}")
    }
}

class Book(var name: String, var price:Int){
    fun discount(){
        price -= 2000
    }
}

