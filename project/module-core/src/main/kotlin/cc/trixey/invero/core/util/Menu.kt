package cc.trixey.invero.core.util

import cc.trixey.invero.common.Pos
import cc.trixey.invero.common.Scale
import cc.trixey.invero.core.icon.Slot

/**
 * Invero
 * cc.trixey.invero.core.util.Menu
 *
 * @author Arasple
 * @since 2023/1/16 12:52
 */
fun List<Slot>.flatRelease(scale: Scale): List<Pos> {
    return flatMap { it.release(scale) }
}