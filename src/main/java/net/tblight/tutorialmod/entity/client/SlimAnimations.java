//package net.tblight.tutorialmod.entity.client;
//
//import net.minecraft.client.animation.AnimationChannel;
//import net.minecraft.client.animation.AnimationDefinition;
//import net.minecraft.client.animation.Keyframe;
//import net.minecraft.client.animation.KeyframeAnimations;
//
//public class SlimAnimations {
//
//    public static final AnimationDefinition MOVE = AnimationDefinition.Builder.withLength(1.41667f)
//            .addAnimation("bone",
//                    new AnimationChannel(AnimationChannel.Targets.POSITION,
//                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
//                                    AnimationChannel.Interpolations.LINEAR),
//                            new Keyframe(0.16667f, KeyframeAnimations.posVec(0f, 0f, 0f),
//                                    AnimationChannel.Interpolations.LINEAR),
//                            new Keyframe(0.33333f, KeyframeAnimations.posVec(0f, 0f, 0f),
//                                    AnimationChannel.Interpolations.LINEAR),
//                            new Keyframe(0.54167f, KeyframeAnimations.posVec(0f, 1f, 0f),
//                                    AnimationChannel.Interpolations.LINEAR),
//                            new Keyframe(0.75f, KeyframeAnimations.posVec(1f, 1f, 0f),
//                                    AnimationChannel.Interpolations.LINEAR),
//                            new Keyframe(1f, KeyframeAnimations.posVec(2f, 0f, 0f),
//                                    AnimationChannel.Interpolations.LINEAR)))
//            .addAnimation("bone",
//                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
//                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
//                                    AnimationChannel.Interpolations.LINEAR),
//                            new Keyframe(0.16667f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
//                                    AnimationChannel.Interpolations.LINEAR),
//                            new Keyframe(0.33333f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
//                                    AnimationChannel.Interpolations.LINEAR),
//                            new Keyframe(0.54167f, KeyframeAnimations.degreeVec(0f, 0f, 8.81f),
//                                    AnimationChannel.Interpolations.LINEAR),
//                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(0f, 0f, -8.69f),
//                                    AnimationChannel.Interpolations.LINEAR),
//                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 1.31f),
//                                    AnimationChannel.Interpolations.LINEAR)))
//            .addAnimation("bone",
//                    new AnimationChannel(AnimationChannel.Targets.SCALE,
//                            new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
//                                    AnimationChannel.Interpolations.LINEAR),
//                            new Keyframe(0.16667f, KeyframeAnimations.scaleVec(1f, 0.9f, 1f),
//                                    AnimationChannel.Interpolations.LINEAR),
//                            new Keyframe(0.33333f, KeyframeAnimations.scaleVec(1f, 0.8f, 1f),
//                                    AnimationChannel.Interpolations.LINEAR),
//                            new Keyframe(0.54167f, KeyframeAnimations.scaleVec(1f, 0.9f, 1f),
//                                    AnimationChannel.Interpolations.LINEAR),
//                            new Keyframe(0.75f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
//                                    AnimationChannel.Interpolations.LINEAR),
//                            new Keyframe(1f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
//                                    AnimationChannel.Interpolations.LINEAR))).build();
//}
