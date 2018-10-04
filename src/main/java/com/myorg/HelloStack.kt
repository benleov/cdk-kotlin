package com.myorg

import software.amazon.awscdk.App
import software.amazon.awscdk.Stack
import software.amazon.awscdk.StackProps
import software.amazon.awscdk.services.iam.User
import software.amazon.awscdk.services.iam.UserProps
import software.amazon.awscdk.services.sns.Topic
import software.amazon.awscdk.services.sns.TopicProps
import software.amazon.awscdk.services.sqs.Queue
import software.amazon.awscdk.services.sqs.QueueProps

class HelloStack(parent: App,
                 name: String? = null,
                 props: StackProps? = null) : Stack(parent, name, props) {

    init {

        val queue = Queue(this, "MyFirstQueue", QueueProps.builder()
                .withVisibilityTimeoutSec(300)
                .build())

        val topic = Topic(this, "MyFirstTopic", TopicProps.builder()
                .withDisplayName("My First Topic Yeah")
                .build())


        topic.subscribeQueue(queue)

        val hello = HelloConstruct(this, "Buckets",

                HelloConstructProps.builder()
                        .withBucketCount(5)
                        .build())

        val user = User(this, "MyUser", UserProps.builder().build())
        hello.grantRead(user)
    }
}
