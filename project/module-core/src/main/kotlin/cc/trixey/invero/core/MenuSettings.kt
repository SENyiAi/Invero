package cc.trixey.invero.core

import cc.trixey.invero.common.ContainerType
import cc.trixey.invero.serialize.SerializerInventoryType
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import org.bukkit.event.inventory.InventoryType

/**
 * Invero
 * cc.trixey.invero.core.MenuSettings
 *
 * @author Arasple
 * @since 2023/1/15 20:42
 */
@Serializable
class MenuSettings(
    val title: MenuTitle,
    @Serializable(with = SerializerInventoryType::class)
    val type: InventoryType = InventoryType.CHEST,
    val options: MenuOptions = MenuOptions()
) {

    @Transient
    val containerType = ContainerType.fromBukkitType(type.name)

}