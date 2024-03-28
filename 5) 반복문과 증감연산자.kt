// while , do..while , for



fun main(){
    var a: Int = 0

    while(a< 10){
        print(a++)
    }



    do{
        print(a++)
    }while(a<10)



    for(i in 1..10){
        print(i)
    }

    for(i in 1..10 step3){
        print(i) // step 3 -> 3씩 증가한다
    }

    for(i in 9downTO 0 ){
        print(i) // 9에서 0까지 1씩 감소하면서 반복
    }

    for(i in 'a'..'e'){
        print(i) // 문자열도 가능함.
    }
}

