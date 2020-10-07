//variable global
const val APPLICATION = "APP"

fun main() {
    //coba awal
    println("hello world")
    //variab;e umum
    var age: Int //variable yg bisa berubah
    val num: Int = 10 //variable yg tidak bisa berubah

    println(num)

    var ageDouble: Double = num.toDouble()
    println(ageDouble)
    //string
    val kalimat: String = """
        kamu dimana
        dengan siapa
    """.trimIndent()
    //stringTemplating
    println("jumlah karakter $kalimat adalah ${kalimat.length} ")

    //variabel Global
    println(APPLICATION)

    //array
    val cobaArray: Array<Int?> = arrayOfNulls(1)
    val cobaArray1: Array<String> = arrayOf("aku")

    cobaArray1.set(0, "dia")

    println(cobaArray1[0])
    //range
    val range = 1..20
    val range1 = 20 downTo 3

    val range2 = 1..46 step 2

    println(range2.contains(2))

    //if expression

    val nilai = 1

    if (nilai > 90){
        println("hebat")
    }
    else if (nilai > 70){
        println("lumayan")
    }
    else if (nilai > 50){
        println("coba lagi")
    }else{
        println("semangat")
    }

    //when expression => switch case di bahsa pemrograman lain

    val ujian = "D"

    when(ujian){
        "A"-> {// bisa menggunakan kurung kurawal
            println("hebat")
        }
        "B"-> println("mayan")
        else -> println("ujian ulang")
    }

    when(ujian){
        "A","B","C" -> println("selamat lulus")
        "D", "E" ->{
            println("maaf")
        }
        else -> println("nilai tidak ditemukan")
    }

    //when in
    val nilaiLulus = arrayOf("A", "B", "C")
    when(ujian){
        in nilaiLulus -> println("selamat anda lulus")
        !in nilaiLulus -> println("maaf coba lagi tahun depan")
    }

    //when is => digunakan untuk mengecek tipe data

    val umur = 10

    when(umur){
        is Int -> println("benar")
        !is Int -> println("salah")
    }

    //when sebagai pengganti if

    val nilaiUjian = 0
    when{
        nilaiUjian > 90  -> println("lulus")
        nilaiUjian > 70  -> println("lumayan")
        nilaiUjian > 30  -> println("coba lagi")
        else -> println("nilai $nilaiUjian tidak ditemukan")
    }

    //for
    


}