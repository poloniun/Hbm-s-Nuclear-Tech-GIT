package com.hbm.tileentity.machine;

import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;

public class TileEntityDummyPort extends TileEntityDummy {

	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		if(world.getTileEntity(target) != null){
			return world.getTileEntity(target).hasCapability(capability, facing);
		}
		return false;
	}
	
	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		if(world.getTileEntity(target) != null){
			return world.getTileEntity(target).getCapability(capability, facing);
		}
		return null;
	}
}
