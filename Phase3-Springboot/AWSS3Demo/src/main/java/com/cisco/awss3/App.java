package com.cisco.awss3;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //S3Util.createBucketInS3("aws-demo-bucket-again1");
        S3Util.listBucketsInS3();
    }
}
