/*
수퍼 클래스에서는 함수의 구체적인 표현은 없고 각 서브클래스가 비어있는 함수의 내용을
필요에 따라 구현하도록 하려면 추상화라는 개념을 사용해야한다

추상화 : 선언부만 있고 기능이 구현되지 않은 추상함수 / 추상클래스가 존재

abstarct를 붙인 추상클래스는 일부함수가 구현되지 않은 미완성 클래스이기 때문에 단독으로는 인스턴스를 만들수 없다
-> 반드시 서브 클래스에서 상속을 받아 abstract가 표시된 함수들을 구현해줘야 한다
.
*/


fun main(){

    var r = Rabbit()
    r.eat()
    r.sniff()

}
// abstract : 추상화
abstract class Animal {
    abstract fun eat(){
        fun sniff() {
            println("Sniff")
            }
    }
}

class Rabbit: Animal(){
    override fun eat() {
        println("eat carrot")
    }
}