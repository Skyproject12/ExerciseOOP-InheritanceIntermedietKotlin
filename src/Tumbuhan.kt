open class Tumbuhan {
    var namaTumbuhan=""
    var jenisTumbuhan=""
    var maksLama=0
    constructor(){

    }
    constructor(namaTumbuhan : String, jenisTumbuhan: String, maksLama: Int){
        this.namaTumbuhan=namaTumbuhan
        this.jenisTumbuhan=jenisTumbuhan
        this.maksLama=maksLama
    }
    fun getNamatumbuhans () : String {
        return namaTumbuhan
    }
    fun setNamatumbuhans (namaTumbuhan : String) {
        this.namaTumbuhan=namaTumbuhan
    }
    fun getJenistumbuhan () : String {
        return jenisTumbuhan
    }
    fun setJenistumbuhans (jenisTumbuhan : String) {
        this.jenisTumbuhan=jenisTumbuhan
    }
    fun getMakslama () : Int {
        return maksLama
    }
    fun setMakslama (maksLama : Int){
        this.maksLama=maksLama
    }
    fun displayTumbuhan () {
        println("nama Tumbuhan :"+namaTumbuhan)
        println("jenis tumbuhan : "+jenisTumbuhan)
        println("maks lama : "+maksLama)
    }
}