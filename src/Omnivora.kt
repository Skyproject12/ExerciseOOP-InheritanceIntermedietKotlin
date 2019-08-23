class Omnivora : Binatang() {
    var daftarMangsa = ArrayList<Binatang>()
    var daftarMakanan = ArrayList<Tumbuhan> ()
    fun getDaftarMangsas () : ArrayList<Binatang> {
        return daftarMangsa
    }
    fun setDaftarMangsas (daftarMangsa : ArrayList<Binatang>) {
        this.daftarMangsa=daftarMangsa
    }
    fun getDaftarMakanans () : ArrayList<Tumbuhan> {
        return daftarMakanan
    }
    fun setDaftarmakanans (daftarMakanan: ArrayList<Tumbuhan>) {
        this.daftarMakanan=daftarMakanan
    }
    fun add (binatang : Binatang){
        daftarMangsa.add(binatang)
    }
    fun add (tumbuhan : Tumbuhan){
        daftarMakanan.add(tumbuhan)
    }
    fun displayOmnivora () {
        super.displayBinatang()
    }
}