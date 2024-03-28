 /*
 
 object로 선언된 객체는 '최초사용시' 자동으로 생성되며 
 이후에는 코드 전체에서 공용으로 사용될수 있으므로 

 Static 멤버
 -> 클래스 내부에서 별도의 영역에 고정적으로 존재하여 인스턴스를 생성하지 않아도 
 고용으로 사용가능한 속성이나 함수 
 
 
 
 
 */
fun main(){

    println(Counter.Count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.clear()

    println(Counter.count)
}


object Counter(){
    var count = 0

    fun countUp(){
        count++
    }

    fun clear(){
        count = 0 
    }
}






// ------------------

fun main(){
    var a = FoodPoll("Keria")
    var b = FoodPoll("deft")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("${FoodPoll.total}")
}

// 중괄호 안에 total 이라는 총 투표수를 저장하는 속성을 만들어 0을 할당.


class FoodPoll (val name : String){
    companion object{
        var total = 0
    }
    var conunt = 0
    fun vote(){
        total++
        count++
    }
}
