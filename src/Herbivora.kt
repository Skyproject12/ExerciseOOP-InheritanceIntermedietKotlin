class Herbivora : Tumbuhan() {
    var daftarMakanan = ArrayList<Tumbuhan>();
    fun Herbivora () {

    }
    fun add (tumbuhan : Tumbuhan) {
        daftarMakanan.add(tumbuhan)
    }
    fun displayHerbivora () {
        super.displayTumbuhan()
    }
}