package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Verapen
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Troubleshoot Car Issues (enter y for yes and n for no)" );
        System.out.println("-------------------------");
        diagnoseCar diagnoseCar = new diagnoseCar();
        diagnoseCar.diagnosis();
    }
}
