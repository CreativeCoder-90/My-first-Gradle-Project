import com.google.gson.Gson
import kotlin.jvm.JvmStatic
import java.lang.Exception

object ConvertJavaObjectToJson {
    @JvmStatic
    fun main(args: Array<String>) {
        try {
            val address = Address("M.G road", "110030", "Gurgaon")
            val person = Person("101", "Aman", "25", address)
            val Gson_obj = Gson()

            //To convert an entity to Json
            val Json_string = Gson_obj.toJson(person)
            println(Json_string)

            //To get an entity from Json
            val p = Gson_obj.fromJson<Person>(Json_string, Person::class.java)
            println(p)

        }
        catch (e: Exception) {
            e.printStackTrace()
        }
    }
}