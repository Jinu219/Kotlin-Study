/*

인터페이스 : 생성자를 가질수 없음
구현부가 있는 함수 -> open 함수로 간주
구현부가 없는 함수 -> abstract 함수로 간주
별도의 키워드가 없어도 포함된 모든함수를 서브클래스에서 구현및 재정의가 가능하다.

한번의 여러 인터페이스를 상속 받을수 있다.

여러개의 인터페이스나 클래스에서 같은 이름과 형태를 가진 함수를 구현하고 있다면
서브 클래스에 혼선이 일어나지 않게 해서 override을 해줘야한다.

서로 다른 기능들을 여러개 물려주어야 할때 유용한 기능임 

*/


fun main(){

}

interface Runner{
    fun run()
}

interface Eater{
    fun eat() {
        println("eat food")
    }
}

class Dog : Runner, Eater {
    override fun run(){
        println("run")
    }

    override fun eat(){
        println("eat eat")
    }
}