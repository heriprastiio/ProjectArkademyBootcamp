package LevelTiga

///Level 3 - Tugas 1 (2 soal)
//Soal dengan:
//Nomor 1
fun main() {
    var a = 1
    var b = 2

    println("Tugas 1")
    println("Data a awal yang adalah " + a)
    println("Data b awal yang adalah " + b)
    a = b.also { b = a }
    println("Nilai menjadi a = " + a)
    println("Nilai menjadi b = " + b)
    kegiatan()
    memasakMieInstan()
    mendaftarBootcampArkademy()
    /*val nomor = listOf("one","two","three","four")
    val nomoriterasi = nomor.iterator()
    while (nomoriterasi.hasNext()){
        println(nomoriterasi.next())
    }*/
    printNumber(3)
    cekGanjilGenap(4)
}


    //Soal dengan:
// Nomor 2
    fun kegiatan() {
        println("\nTugas 2")
        println("5 kegiatan saya")
        println("1. Merapikan tempat tidur")
        println("2. Mandi")
        println("3. Sarapan pagi")
        println("4. Belajar online untuk upgrade skill")
    }

    ///Level 3 - Tugas 2 (4 soal)
//Soal dengan :
// Nomor 1:
//1.Algoritma adalah langkah-langkah prosedur penyelesaian petunjuk
//Soal dengan :
// Nomor 2:
//2.Langkah memasak mie instan
    fun memasakMieInstan() {
        println("\nTugas Nomor 2")
        println("1. Siapkan produk mie instan")
        println("2. Siapkan bahan tambahan, bisa telur, daun")
        println("3.")
    }

    //Soal dengan :
// Nomor 3:
//3. Algortima mendaftar Bootcamp Arkademy
    fun mendaftarBootcampArkademy() {
        println("\nTugas Nomor 3")
        println("Sudah memiliki email yang terdaftar pada bootcamp arkademy")
        println("Login ke website bootcamp arkademy")
        println("Pilih program bootcamp dalam hal ini fullstack mobile")
        println("")
    }

//Nomor 4 :
//Data struktur


    //Tugas 3 (2 soal)
    fun salam(nama: String) {
        println("Halo " + nama + ", selamat pagi!")
    }

//Tugas 4 (4 soal)

//Nomor 1 :
//If else


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



