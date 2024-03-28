import java.awt.SystemTray
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Scanner

fun main(){
   // 표준 라이브러리 활용1
    val input = readlnOrNull()
    // val input = readLine()
    // val input = readln()

    println(input!!.split(" ")[0].toInt() + input.split(" ")[1].toInt())
    useScannerWith()
    useScanner()
    useScanner2()
}

// import java.util.Scanner
// with 블록을 통해서 자바의 Scanner를 생성하여 정수를 입력 받을수 있다.
fun useScannerWith() = with(Scanner(System.`in`)) {
    println(nextInt() + nextInt())
}

fun useScanner(){
    val sc:Scanner = Scanner(System.`in`)
    val input = sc.nextLine()
    // 입력을 문자열로 받아서 문자열안에 있는 공백을 기준으로 정수를 나눠어서 더하는 시스템
    println(input!!.split(" ")[0].toInt() + input.split(" ")[1].toInt())
}

fun useScanner2(){
    val sc:Scanner = Scanner(System.`in`)
    println(sc.nextInt() + sc.nextInt())
}

fun useBufferedReader() = with(BufferedReader(InputStreamReader(System.`in`))){
    val input = readLine()!!

    println(input.split(" ")[0].toInt() + input.split(" ")[1].toInt())
}

// 정규식을 확인하지 않고 바로 처리함.
// 입력을 그떄그떄 처리하는 Scanner와 달리 버퍼를 통해 처리 시점을 개발자가 직접 정해줄수 있다.
fun useBufferedReader2() = with(BufferedReader(InputStreamReader(System.`in`))){

}