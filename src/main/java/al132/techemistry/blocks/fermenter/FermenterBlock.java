package al132.techemistry.blocks.fermenter;

import al132.techemistry.blocks.BaseTileBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.List;

public class FermenterBlock extends BaseTileBlock {
    public FermenterBlock() {
        super("fermenter", FermenterTile::new, Block.Properties.create(Material.IRON));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new StringTextComponent(I18n.format("block.techemistry.fermenter.tooltip")));
    }
}