package ruolan.com.kotlinshare

/**
 * Created by wuyinlei on 2018/3/24.
 *
 * @function
 */

class Fun {


    fun function() {
        var str = "Hello"
        fun say(count: Int = 10) {
            println(say())
            if (count > 0) {
                say(count - 1)
            }
        }
        say()
    }


}
