import scala.io.StdIn.readLine

object assignment001 {
  def main(args:Array[String]):Unit={
    //1
    val your_name: String = "Subhrajyoti Saha"
    var your_age = 27
    var your_salary = 80000

    println(s"$your_name\n$your_age\n$your_salary")


    //2
    var a = 2
    var b = 3

     a = (a + b)
     b = a - b
     a = a - b

    // this will also work for new line -> println(a +"\n"+ b)
    print(s"$a $b \n")

    //3
    var (c, d) = (1,2)
    val (c2,d2) = (4,6)
    var c3:Int = 10; var c4:String = "Mistu"

    println(s"$c3\n$c4")

    //4
    var name = "Subhra"
    println(7.getClass)
    println("subhra".getClass)
    println(name.getClass.getSimpleName)
    println(10.5.getClass.getSimpleName)

    //5
    println("100".toInt+50)
    val num1 = "100"
    val num2 = num1.toInt
    println(num2 + 50)

    //6
    val a2 = 10
    val a3 = 5

    println(a2 + a3)
    println(a2 - a3)
    println(a2 * a3)
    println(a2 / a3)

    //7
    val num3 = 15
    println(num3%7)

    //8
    val num4 = 2
    val num5 = math.pow(num4,3)
    val num6 = math.pow(num4,3).toInt
    println(num5)
    println(num6)

    //9
    var total_marks = 180
    var total_sub = 2

    var avg = (total_marks/total_sub)
    println(avg)

    //10
    var simple_interest = 0
    val principal_amount = readLine().toInt
    val ratte_of_interest = readLine().toInt
    val time01 = readLine().toInt

    simple_interest = (principal_amount * ratte_of_interest * time01)/100

    println(simple_interest)

    //11
    val num7 = 200
    if (num7>100) {
      println(s"$num7 is greater than 100")
    }
    else {
      println(s"$num7 is less than 100")
    }

    //12
    val num8 = readLine().toInt
    val num9 = readLine().toInt
    if (num8>num9){
      println(num8)
    }
    else {
      println(num9)
    }

    //13
    val num10 = 40
    val result1 = if (num10==50) "matched" else "not matched"
    println(result1)

    //14
    val num11 = 9
    val result2 = if (num11 != 0) "not 0" else "it's 0"
    println(result2)

    //15
    val num12 = 20
    val result3 = if (num12>=10 && num12<=50) s"$num12 is in 10-50"
    println(result3)


    //16
    val age = readLine().toInt
    if (age>=18){
      println("eligible to vote")
    }
    else{
      println("not eligible to vote")
    }

    //17
    val num13 = 15
    if (num13%3==0 && num13%5==0){
      println("divisible by both")
    }

    //18
    val marks = 50
    if (marks >= 35){
      println("passed")
    }
    else{
      println("failed")
    }

    //19
    val num14 = readLine().toInt
    if (num14>=0){
      println("positive")
      if (num14%2==0){
        println("even")
      }
      else {
        println("odd")
      }
    }
    else {
      println("negative")
      if (num14 % 2 == 0) {
        println("even")
      }
      else {
        println("odd")
      }
    }

    //20
    val user = readLine("please enter you id").toLowerCase

    if (user == "admin") {
      val password_admin = readLine("please enter your password")
      if (password_admin == "1234"){
        println("you are successfully logged in")
      }
      else{
        println("password mismatch")
      }
    }
    else {
      println("please use a valid id")
    }













  }

}
