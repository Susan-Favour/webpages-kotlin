//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val pageTracker = PageTracker()
    pageTracker.trackPageVisit("Home-page")
    pageTracker.trackPageVisit("Log-in page")
    pageTracker.trackPageVisit("Home-page")
    pageTracker.trackPageVisit("Mentorship-page")
    pageTracker.trackPageVisit("Home-page")
    pageTracker.trackPageVisit("Sign-out page")
    pageTracker.trackPageVisit("Log-in page")
    pageTracker.trackPageVisit("Mentorship-page")
    pageTracker.trackPageVisit("Home-page")
    pageTracker.trackPageVisit("Log-in page")

    val topVisitedPages = pageTracker.getTopPages()
    println("Top 5 of the most visited webpages")

    topVisitedPages.forEachIndexed{index,Pair ->
//        println("${index + 1}.${Pair.second} was visited ${Pair.second} times")

    }
    println(topVisitedPages)
}


class PageTracker(){

    private val numberOfPageVisits = mutableMapOf<String,Int>()
    fun trackPageVisit(page:String){
        numberOfPageVisits[page] = numberOfPageVisits.getOrDefault(page,0) + 1 }
    fun getTopPages():List<Pair<String,Int>>{
        return numberOfPageVisits.toList().sortedByDescending{it.second}.take(5)
    }

}