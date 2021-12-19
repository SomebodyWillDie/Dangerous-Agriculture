package io.github.somebodywilldie.dangerousagriculture.core.init;

import io.github.somebodywilldie.dangerousagriculture.DangerousAgriculture;
import io.github.somebodywilldie.dangerousagriculture.common.block.BlackberryBushBlock;
import io.github.somebodywilldie.dangerousagriculture.common.block.CrimsonBeetrootBlock;
import io.github.somebodywilldie.dangerousagriculture.common.block.PepperBushBlock;
import io.github.somebodywilldie.dangerousagriculture.common.block.WarpedCarrotsBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DangerousAgriculture.Reference.MOD_ID);

    public static final RegistryObject<Block> PEPPER_BUSH = BLOCKS.register("pepper_bush", () -> new PepperBushBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    public static final RegistryObject<Block> WARPED_CARROTS = BLOCKS.register("warped_carrots", () -> new WarpedCarrotsBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP)));
    public static final RegistryObject<Block> CRIMSON_BEETROOTS = BLOCKS.register("crimson_beetroots", () -> new CrimsonBeetrootBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP)));
    public static final RegistryObject<Block> BLACKBERRY_BUSH = BLOCKS.register("blackberry_bush", () -> new BlackberryBushBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
}