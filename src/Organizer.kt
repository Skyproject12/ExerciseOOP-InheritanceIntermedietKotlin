class Organizer {
    var listKarnivora = ArrayList<Karnivora>();
    var listHerbivora = ArrayList<Herbivora>();
    var listOmnivora = ArrayList<Omnivora>();
    var listTumbuhan = ArrayList<Tumbuhan>();
    constructor(){

    }
    fun add (karnivora : Karnivora) {
        listKarnivora.add(karnivora)
    }
    fun add (herbivora : Herbivora) {
        listHerbivora.add(herbivora)
    }
    fun add (omnivora : Omnivora) {
        listOmnivora.add(omnivora)
    }
    fun add (tumbuhan : Tumbuhan) {
        listTumbuhan.add(tumbuhan)
    }
    fun getListKarnivoras(): ArrayList<Karnivora> {
        return listKarnivora ;
    }
    fun getListHerbivoras () : ArrayList<Herbivora> {
        return listHerbivora
    }
    fun getListOmnivoras () : ArrayList<Omnivora> {
        return listOmnivora
    }
    fun getListTumbuhans () : ArrayList<Tumbuhan> {
        return listTumbuhan
    }
    fun displayOrganizer () {
        println("List Karnivora")
        for (i in 0..listKarnivora.size){
            listKarnivora.get(i).displayKarnivora()
        }
        println("List Herbivora")
        for (i in 0..listHerbivora.size){
            listHerbivora.get(i).displayHerbivora()
        }
        println("List Omnivora")
        for (i in 0..listOmnivora.size){
            listOmnivora.get(i).displayOmnivora()
        }
        println("List Tumbuhan")
        for (i in 0..listTumbuhan.size){
            listTumbuhan.get(i).displayTumbuhan()
        }
    }

}