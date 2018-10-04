package com.myorg

import software.amazon.awscdk.Construct
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.s3.Bucket
import software.amazon.awscdk.services.s3.BucketProps

import java.util.ArrayList

/**
 * Example of a reusable construct. This one defines N buckets.
 */
class HelloConstruct(parent: Construct, name: String, props: HelloConstructProps) : Construct(parent, name) {
    private val buckets = ArrayList<Bucket>()

    init {

        for (i in 0 until props.bucketCount) {
            buckets.add(Bucket(this, "Bucket" + i.toString(), BucketProps.builder().build()))
        }

    }

    /**
     * Given an principal, grants it READ access on all buckets.
     * @param principal The principal (User, Group, Role)
     */
    fun grantRead(principal: IPrincipal) {
        buckets.forEach { b -> b.grantRead(principal, "*") }
    }
}
