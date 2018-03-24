package ruolan.com.kotlinshare

/**
 * Created by wuyinlei on 2018/3/24.
 *
 * @function
 */

class SingleClass private constructor() {

    companion object {
        fun get(): SingleClass {
            return Holder.instance
        }
    }

    private object Holder {
        var instance = SingleClass()
    }
}
