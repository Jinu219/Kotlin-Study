fun main(){

    var a = Person("a", 123)
    var b = Person("b", 1234)
    var c = Person("c", 12345)
    
    println("${a.name}")
    a.introduce()

    var c = Animal("asd",5,"개")
    var d = Dog("asd",10)
    var e = Cat("aasd",123)

    c.introduce1()
    d.introduce1()
    e.introduce1()

    d.bark()
    e.meow()

}

class Person(var name:String, val birthYear:Int) {
    fun introduce(){
        println(${a.name}, ${a.birthYear})
    }
}

class Person1{var name:String, val birthYear:Int}{
    init {
        println(${a.name}, ${a.birthYear})
    }
    constructor(name:String) : this(name, 1997)
}

// init : 패러미터나 반환형이 없는 특수한 함수
// constructor : 생성자를 제공하여 인스턴스 생성시 편의를 제공하거나 추가적인 구문을 수행
// 보조생성자를 만들때에는 반드시 기본 생성자를 통해 속성을 초기화 해줘야한다
// this : 사용한 클래스 자신을 지칭할떄 사용함


// open : 어떤 클래스의 상속을 허용하기 위해 사용


open class Animal (var name:String, var age:Int, var type:String){
    fun introduce1(){
        println("${type}, ${name}, ${age}")
    }
}

class Dog (name:String, age:Int) : Animal(name, age, "개"){
    fun bark(){
        println("bark")
    }
}

class Cat(name : String, age:Int) : Animal(name, age, "고양이"){
    fun meow(){
        println("meow")
    }
}