open class Binatang {
    var namaBinatang=""
    var jenisKelamin=""
    var warna=""
    var maksLamaHidup=0
    var jenisBinatang=""

    constructor(){

    }
    constructor(namaBinatang: String, jenisKelamin: String, warna:String, maksLamaHidup: Int, jenisBinatang: String){
        this.namaBinatang=namaBinatang
        this.jenisBinatang=jenisBinatang
        this.jenisKelamin=jenisKelamin
        this.warna=warna
        this.maksLamaHidup=maksLamaHidup
    }

    fun getNamabinatangs(): String {
        return namaBinatang ;
    }
    fun setNamabinatangs (namaBinatang: String) {
        this.namaBinatang=namaBinatang
    }
    fun getJenisKelamins () : String {
        return jenisKelamin
    }
    fun setJenisKelamins (jenisKelamin : String)  {
        this.jenisKelamin=jenisKelamin
    }
    fun getWarnas () : String {
        return warna
    }
    fun setWarnas (warna : String) {
        this.warna=warna
    }
    fun getMakslamahidups () :Int {
        return maksLamaHidup
    }
    fun setMakslamahidups (makslamahidup : Int) {
        this.maksLamaHidup=maksLamaHidup
    }
    fun getJenisbinatangs () :String {
        return jenisBinatang
    }
    fun setJenisbinatangs (jenisBinatang: String) {
        this.jenisBinatang=jenisBinatang
    }
    fun displayBinatang () {
        println("Jenis Binatang"+jenisBinatang)
        println("Warna"+warna)
        println("Lama Maksimal"+maksLamaHidup)
        println("Jenis Binatang"+jenisBinatang)
    }

}