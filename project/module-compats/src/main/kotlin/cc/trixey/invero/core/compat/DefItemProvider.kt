package cc.trixey.invero.core.compat

/**
 * Invero
 * cc.trixey.invero.core.compat.DefItemProvider
 *
 * @author Arasple
 * @since 2023/2/7 21:38
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class DefItemProvider(
    val namespaces: Array<String>
)