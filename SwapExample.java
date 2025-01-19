/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class SwapExample {
    
    int a;
    int b;

    public SwapExample(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swap() {
        a = a + b; 
        b = a - b; 
        a = a - b; 
    }

    public static void main(String[] args) {
        SwapExample example = new SwapExample(5, 10);
        System.out.println("Before swap: a = " + example.a + ", b = " + example.b);
        example.swap();
        System.out.println("After swap: a = " + example.a + ", b = " + example.b);
    }
}
