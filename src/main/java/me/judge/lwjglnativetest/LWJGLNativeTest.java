package me.judge.lwjglnativetest;

import org.lwjgl.glfw.GLFW;

public class LWJGLNativeTest {
    public static void main(String[] args) {
        // Just initializing the library breaks it.
        GLFW.glfwInit();
    }
}
