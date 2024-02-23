package com.cisco.awss3;

import java.util.List;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

public class S3Util {

	public static void listBucketsInS3() {
		String accessKeyId="AKIAUN6Q2PB7WWNPPMGM";
		String secretKeyId="nGtCljxDjBkp8GJ7GASEE4mG38EHshuiPY+E7A/I";
		BasicAWSCredentials awsCredentials= 
				new BasicAWSCredentials(accessKeyId, secretKeyId);
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
}
