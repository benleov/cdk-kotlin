package com.myorg

class HelloConstructProps {
    var bucketCount: Int = 0


    class HelloConstructPropsBuilder() {
        private var bucketCount: Int = 0

        fun withBucketCount(bucketCount: Int): HelloConstructPropsBuilder {
            this.bucketCount = bucketCount
            return this
        }

        fun build(): HelloConstructProps {

            val helloConstructProps = HelloConstructProps()
            helloConstructProps.bucketCount = bucketCount
            return helloConstructProps

        }

    }

    companion object {

        fun builder(): HelloConstructPropsBuilder {
            return HelloConstructPropsBuilder()
        }
    }
}
