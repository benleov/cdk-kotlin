package com.myorg

import software.amazon.awscdk.App
import java.util.*

/**
 * mvn dependency:build-classpath -Dmdep.outputFile=.classpath.txt
 */
object HelloApp {
    @JvmStatic
    fun main(argv: Array<String>) {
        val app = App(Arrays.asList(*argv))

        HelloStack(app, "hello-cdk-1")
        //        new HelloStack(app, "hello-cdk-2");

        println(app.run())
    }
}
