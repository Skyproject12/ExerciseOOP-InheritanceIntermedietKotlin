fun main (args: Array<String>){
    var binatang = Binatang("Kucing", "Jantan", "Biru", 10, "karnivora");
    var tumbuhan = Tumbuhan ("kangkung","Sayur",1)
    var omnivora = Omnivora()
    var karnivora = Karnivora()
    var gerbivora = Herbivora()
    println("Daftar nama binatang omnivora")
    println("==============================")
    omnivora.setNamabinatangs("Beruang")
    omnivora.setJenisKelamins("Betina")
    omnivora.setWarnas("Coklat")
    omnivora.setMakslamahidups(5)
    omnivora.setJenisbinatangs("Omnivora")
    omnivora.displayOmnivora()
    println()
    println("Daftar nama binatang herbivora")
    println("================================")
}