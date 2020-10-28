package LevelSatu

class TugasSatu {
    fun langsungPrint() {
        val nama: String = "Heri"
        val umur: Int = 25
        println("Ini Tugas 1")
        println("Nama Anda "+nama)
        println("Umur "+umur)
//        println("Nama anda adalah: Heri Prastio \nUmur: 25 tahun\n Alamat: Jl. Duri Barat Hobi: Berenang \nAsal universitas: Universitas Esa Unggul\n Kesulitan Belajar Programming: Sering ada error pusing \nAlasan Ingin Ikut Bootcamp Arkademy Karena dengan adanya bootcamp ini, saya dibimbing lebih mendalam membantu mengerjakan real projek")
    }

}


class TugasDua {
    val nama: String = "Heri Prastio"
    val umur: Int = 25
    val alamat: String = "Jl. Duri Barat"
    var hobi: String = "Berenang"
    val asalUniversitas: String = "Universitas Esa Unggul"
    val kesulitanBelajarProgramming: String = "Pernah mengalami kesulitan programming karena error berjam jam"
    val alasanInginIkutBootcampArkademy: String =
        "Karena dengan adanya bootcamp ini, saya dibimbing lebih mendalam membantu mengerjakan real projek"
    var keteranganTugas : String = "SSH"

}

fun printMethod() {
    val tugasSatu = TugasSatu()
    tugasSatu.langsungPrint()
    val variableBiodata = TugasDua()
    println(variableBiodata.keteranganTugas)
    println(variableBiodata.nama)
    println(variableBiodata.umur)
    println(variableBiodata.keteranganTugas)
    println("Nama anda adalah " + variableBiodata.nama + "\nUmur anda " + variableBiodata.umur)
}

fun main() {
    printMethod()
}
