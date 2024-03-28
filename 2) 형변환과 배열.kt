  // 2) 형변환과 배열
  // toByte()
  // toShort()
  // toInt()
  // toLong()
  // toFloat()
  // toDouble()
  // toChar()

  // arrayOf()
  // arrayOfNulls<Int>()
  // <> 안에는 배열에 할당할 자료형을 저장해주면 된다.

fun main(){
    var a: Int = 54321
    var b: Long = a.toLong()


    var intArr = arrayOf(1,2,3,4,5)
    var nullArr = arrayOfNulls<Int>(5)

    intArr[2] = 8
    println(intArr[4])
}
