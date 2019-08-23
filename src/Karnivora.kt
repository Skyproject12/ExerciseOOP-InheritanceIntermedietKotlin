class Karnivora : Binatang() {
    var daftarMangsa =  ArrayList<Binatang>()
    fun Karnivora () {

    }
    fun getDaftarMangsas () : ArrayList<Binatang>  {
        return daftarMangsa
    }
    fun setDaftarMangsas (daftarMangsa : ArrayList<Binatang>) {
        this.daftarMangsa=daftarMangsa
    }
    fun add (binatang : Binatang){
        daftarMangsa.add(binatang)
    }
    fun displayKarnivora () {
        super.displayBinatang()
    }
}