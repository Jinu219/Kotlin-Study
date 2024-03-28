/*
오버라이딩 -> 서브클래스에서 같은 이름과 형태로 된 함수의 내용을 다시 구현할수 있음.
수퍼 클래스에서 open이 붙은 함수는 서브 클래스에서 override를 붙여 재구현 하면된다.

이미구현이 끝난 함수의 기능을 서브클래스에서 변경해야 할 때,
추상화는 형식만 선언하고 실제구현은 서브 클래스에 일임할 때 사용하는 기능

*/

fun main(){
    var t = Tiger()
    // 변수 t 를 Tigher() 클래스로 지정 해줘서
    t.eat()
    // Animal()안에있는 eat함수를 통해서 t.eat() 실행
    var r = Rabbit()
    r.eat()
}

open class Animal {
    open fun eat() {
        // fun eat()옆에 open이 붙어 있다면 서브 클래스에서 재구현이 허용된다.
        println("음식을 먹습니다")
    }
}
// 서브 클래스 Tiger에서는 함수를 재구현할 수가 없음.
class Tiger : Animal() {
    override fun eat() {
        println("고기를 먹습니다")
    }
}

class Rabbit : Animal(){
    override fun eat(){
        println("풀을 뜯어먹습니다.")
        }
}
// 서브 클래스에서 override를 통해서 함수를 설정해준다면 t.eat()를 사용했을때 "고기를 먹습니다"가 출력된다.
// eat() 함수를 다시 사용할수 있다는 뜻임

