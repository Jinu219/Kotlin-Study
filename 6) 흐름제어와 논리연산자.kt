

// return : 함수를 종료하고 값을 반환하는 역할
// 반복문에서 사용할수 있는 함수 -> break / continue
// label 기능존재 -> break@loop 
// label은 어떻게 써도 상관없는거네 

fun main(){
    
    for (i in 1..10){
        if (i==3) break
        print(i)
    }

    for (i in 1..10){
        if (i==3) continue
        print(i)
        // 3을 제외한 모든 숫자가 적힌다.
    }

    loop@for (i in 1..10){
        for (j in 1..10){
            if(i == 1 && j == 2) break@loop
            println("i : $i, j : $j")
        }
    }
}


// 논리 연산자 
// && || !