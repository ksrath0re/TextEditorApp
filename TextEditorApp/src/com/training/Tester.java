package com.training;


interface InterfaceClassOne
{
    void methodOne();
}
 
interface InterfaceClassTwo
{
    void methodOne();
}
 
class Tester implements InterfaceClassOne, InterfaceClassTwo
{
    public void methodOne()
    {
        System.out.println("wow");
    }
 
    
    
}