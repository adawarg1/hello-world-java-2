package com.adawar.docker;

/**
 * Hello world!
 *
 */
public class HelloWorldPing 
{
    public static void main( String[] args ) throws Exception
    {
        //System.out.println( "Hello World!" );
        for(int i = 0 ; i < 100; i++){
			System.out.println("Hello World Ping " + i );
			Thread.sleep(1000);
		}
    }
}
