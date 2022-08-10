import java.util.Scanner

fun main()
{

    val scn = Scanner(System.`in`)
    println("Enter enter the size (N) of list: ")
    val N = scn.nextInt()
    val list = mutableListOf<String>()

    println("Please enter $N names: ")
    println("*--------------------------------------------*")

    for(item in 0 until N)
    {
        print("Enter name ${item+1}: ")
        list.add(scn.next())
    }
    val filterdList = list.filter {
        it.contains('M') || it.contains('m') || it.contains('A') || it.contains('a')

    }
    println(filterdList.map { it.uppercase() })

}