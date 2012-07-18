package code.json

import org.specs2.mutable.Specification
import net.liftweb.json._

class JsonSpecs extends Specification{

  implicit val format = DefaultFormats
  val json = parse("""{"name" : "John", "age" : 30}""")
  case class Person(name: String, age: Int)
  case class FakePerson(sudo: String, age: Int)



  "Lift Json" should{
    "extract the name value" in {
      json.extract[Person].name must_== "John"
    }
    "extract the age value" in {
      json.extract[Person].age must_== 30
    }
    "throw an exception" in {
      json.extract[FakePerson].sudo must throwA[MappingException]
    }

  }

}
