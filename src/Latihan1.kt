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

    



}