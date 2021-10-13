// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

	package com.example.mod;

	public class opossum extends EntityModel<Entity> {
private final ModelPart head;
	private final ModelPart body;
	private final ModelPart Tail;
public opossum() {
		textureWidth = 32;
		textureHeight = 32;
		head = new ModelPart(this);
		head.setPivot(0.0F, 24.0F, 0.0F);
		head.setTextureOffset(0, 0).addCuboid(1.1667F, -5.9667F, -5.3333F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(0, 1).addCuboid(-1.8333F, -5.9667F, -5.3333F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addCuboid(-1.8333F, -4.9667F, -8.3333F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(14, 0).addCuboid(-1.3333F, -3.9667F, -11.3333F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(14, 4).addCuboid(-1.3333F, -2.9667F, -11.3333F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(12, 1).addCuboid(-0.3333F, -3.9667F, -12.3333F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		body = new ModelPart(this);
		body.setPivot(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 8).addCuboid(-2.8333F, -4.9667F, -5.3333F, 6.0F, 3.0F, 11.0F, 0.0F, false);
		body.setTextureOffset(28, 5).addCuboid(1.6667F, -1.9667F, -5.3333F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(28, 5).addCuboid(1.6667F, -1.9667F, 4.6667F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(28, 5).addCuboid(-2.3333F, -1.9667F, 4.6667F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(28, 5).addCuboid(-2.3333F, -1.9667F, -5.3333F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Tail = new ModelPart(this);
		Tail.setPivot(0.0F, 24.0F, 0.0F);
		Tail.setTextureOffset(0, 22).addCuboid(-0.3333F, -4.9667F, 5.6667F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		Tail.setTextureOffset(8, 22).addCuboid(-0.3333F, -4.9667F, 8.6667F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		Tail.setTextureOffset(8, 22).addCuboid(-0.3333F, -4.9667F, 11.6667F, 1.0F, 1.0F, 3.0F, 0.0F, false);
}
@Override
public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
}
@Override
public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		Tail.render(matrixStack, buffer, packedLight, packedOverlay);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}

	}