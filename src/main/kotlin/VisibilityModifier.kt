fun main() {

}
// By default, top level declarations (classes and functions) are public.
open class A {
    val p = 0 // public by default
    private val q = 1
    internal val r = 2
    protected val s = 3

}
// Internal modifier for top level declarations (classes and functions) is accessible in its module only.
internal class B: A() {
    fun doSomething() {
        // p, r, and s are accessible
    }
}

// private modifier for top level declarations (classes and functions) is accessible in the file only.

private fun a() {

}
