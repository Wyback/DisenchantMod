package net.wyback.disenchantmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wyback.disenchantmod.DisenchantMod;
import net.wyback.disenchantmod.block.ModBlock;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DisenchantMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DISENCHANT_TAB = CREATIVE_MODE_TABS.register("disenchant_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlock.DISENCHANT_TABLE.get(), 1))
                    .title(Component.translatable("creative_tab.disenchant_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept((ModBlock.DISENCHANT_TABLE.get()));
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
