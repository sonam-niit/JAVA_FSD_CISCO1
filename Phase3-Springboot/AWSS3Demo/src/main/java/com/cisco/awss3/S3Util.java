package com.cisco.awss3;

import java.util.List;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

public class S3Util {

	private static String accessKeyId="AKIAQZL74JVKOMGLZFLI";
	private static String secretKeyId="GHHEFTtO0UDB6/AceBgwprBZPU80kKnK9OTwwzle";
	private static BasicAWSCredentials awsCredentials= 
			new BasicAWSCredentials(accessKeyId, secretKeyId);
	public static void listBucketsInS3() {
		
		try {
			AmazonS3 s3Ref= 
					AmazonS3ClientBuilder.standard()
					.withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
					.withRegion(Regions.DEFAULT_REGION)
					.build();
			List<Bucket> list=s3Ref.listBuckets();
			list.forEach((bucket)->{
				System.out.println("-----------------------------------------");
				System.out.println("Bucket Name: "+bucket.getName());
				System.out.println("Creation Date: "+bucket.getCreationDate());
				System.out.println("Owner: "+bucket.getOwner());
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void createBucketInS3(String bucketName) {
		try {
			AmazonS3 s3Ref= 
					AmazonS3ClientBuilder.standard()
					.withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
					.withRegion(Regions.DEFAULT_REGION)
					.build();
			s3Ref.createBucket(bucketName);
			System.out.println("Bucket Created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteBucketInS3(String bucketName) {
		try {
			AmazonS3 s3Ref= 
					AmazonS3ClientBuilder.standard()
					.withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
					.withRegion(Regions.DEFAULT_REGION)
					.build();
			s3Ref.deleteBucket(bucketName);
			System.out.println("Bucket Created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
