package Models

data class Sher(val name:String, val matni:String)

object SherListObject{
   lateinit var sevgiList:ArrayList<Sher>
   lateinit var soginchList:ArrayList<Sher>
   lateinit var tabrikList:ArrayList<Sher>
   lateinit var otaOnaList:ArrayList<Sher>
   lateinit var dostlikList:ArrayList<Sher>
   lateinit var hazilList:ArrayList<Sher>
   lateinit var yangilarList:ArrayList<Sher>
   lateinit var saqlanganList:ArrayList<Sher>
}

fun loadData(){
    SherListObject.sevgiList = ArrayList()
    for (i in 0..0) {
        SherListObject.sevgiList.add(
            Sher(
                "Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                        "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                        "Mayli xijron azobi qiynasin meni,\n" +
                        "O’lsam ham baribir sevaman seni!"
            )
        )
    }

    SherListObject.soginchList = ArrayList()
    for (i in 0..0)
    SherListObject.soginchList.add(Sher("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
            "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
            "Mayli xijron azobi qiynasin meni,\n" +
            "O’lsam ham baribir sevaman seni!"))


    SherListObject.tabrikList = ArrayList()
    for (i in 0..0)
    SherListObject.tabrikList.add(Sher("8 - mart", "8 - mart bugun\n" +
            "Onajonlar bayrami\n" +
            "Yo'llariga poyandoz\n" +
            "Dasta gullar boylami"))

    SherListObject.otaOnaList = ArrayList()
    for (i in 0..0)
    SherListObject.otaOnaList.add(Sher("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
            "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
            "Mayli xijron azobi qiynasin meni,\n" +
            "O’lsam ham baribir sevaman seni!"))

    SherListObject.dostlikList = ArrayList()
    for (i in 0..0)
    SherListObject.dostlikList.add(Sher("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
            "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
            "Mayli xijron azobi qiynasin meni,\n" +
            "O’lsam ham baribir sevaman seni!"))

    SherListObject.hazilList = ArrayList()
    for (i in 0..0)
    SherListObject.hazilList.add(Sher("Qorbobo","Qorbobojon oppoq\n" +
            "Peshonasi yalpoq\n" +
            "Hassasi uzunchoq\n" +
            "Ko'proq bering o'yinchoq"))
    SherListObject.hazilList.add(Sher("Ayiq","Ayiq polvon\n" +
            "Zo'r hayvon\n" +
            "Asal yeyishga chaqqon\n" +
            "Lapan-lupan yuradi\n" +
            "Charchasa o'tiradi"))

    SherListObject.yangilarList = ArrayList()
    for (i in 0..0)
    SherListObject.yangilarList.add(Sher("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
            "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
            "Mayli xijron azobi qiynasin meni,\n" +
            "O’lsam ham baribir sevaman seni!"))

    SherListObject.saqlanganList = ArrayList()
    for (i in 0..0)
    SherListObject.saqlanganList.add(Sher("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
            "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
            "Mayli xijron azobi qiynasin meni,\n" +
            "O’lsam ham baribir sevaman seni!"))
}
