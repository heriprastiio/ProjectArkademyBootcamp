package LevelTiga

//Tugas 5 (4 soal)

/*Nomor 1 :
Perulangan atau looping adalah proses berurutan*/
//Nomor 2 :
fun printNumber(num :Int) {
    println("Tugas 5 nomor 2")
    val num = 3
    for (i in 0..num) {
        println(i)
    }
}

//Nomor 3 :
fun cekGanjilGenap(ganjilNumber: Int){
    println("\nTugas 5 nomor 3")
    if (ganjilNumber%2==1){
        println("Bilangan " +ganjilNumber+" adalah ganjil")
    }else{
        println("Bilangan " +ganjilNumber+" adalah genap")
    }

}
fun main() {
    printNumber(3)
    cekGanjilGenap(1)
}



