package net.frogger.goose.init;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class GooseCreativeTab extends CreativeModeTab {
    private GooseCreativeTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Blocks.ACACIA_SAPLING);
    }
    
    public static final GooseCreativeTab instance = new GooseCreativeTab(CreativeModeTab.TABS.length, "goose");

}